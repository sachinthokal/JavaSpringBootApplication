# Use Java 17 base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file into container
COPY target/*.jar app.jar

# Run the Spring Boot app
ENTRYPOINT ["java", "-jar", "app.jar"]

