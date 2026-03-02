FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY studentmanagement/target/*.jar app.jar
ENTRYPOINT ["java", "-jar", "FullStack.jar"]
