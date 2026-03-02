FROM eclipse-temurin:17-jre
WORKDIR /app

# copy the exact jar name from the local target folder
COPY target/FullStack.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]