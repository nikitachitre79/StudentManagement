# Dockerfile (multi-stage Maven build)
# ---- Build stage ----
FROM maven:3.9-eclipse-temurin-17 AS build
WORKDIR /workspace
COPY pom.xml .
# leverage dependency layer caching
RUN mvn -B -q -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -B -DskipTests package

# ---- Runtime stage ----
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
# copy the built JAR from the previous stage
COPY --from=build /workspace/target/*.jar app.jar

ENTRYPOINT ["java","-jar","/app/app.jar"]