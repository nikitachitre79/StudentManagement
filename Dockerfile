# ---- build stage ----
#FROM maven:3.9-eclipse-temurin-17 AS build
#WORKDIR /src
#COPY pom.xml .
#RUN mvn -q -B -DskipTests dependency:go-offline
#COPY src ./src
#RUN mvn -B -DskipTests package

# ---- runtime ----
#FROM eclipse-temurin:17-jre
#WORKDIR /app
#COPY --from=build /src/target/FullStack.jar app.jar
#ENTRYPOINT ["java", "-jar", "app.jar"]
#FROM eclipse-temurin:17-jre
#WORKDIR /app

# copy the exact jar name from the local target folder
#COPY studentmanagement/target/FullStack.jar app.jar

#ENTRYPOINT ["java", "-jar", "app.jar"]
# Start from Eclipse Temurin JDK (recommended for Spring Boot)
FROM eclipse-temurin:17-jdk-alpine

# Directory inside container
WORKDIR /app

# Copy jar file into the container
COPY target/FullStack.jar app.jar

# Expose port Spring Boot uses
EXPOSE 8080

# Default command
ENTRYPOINT ["java", "-jar", "app.jar"]