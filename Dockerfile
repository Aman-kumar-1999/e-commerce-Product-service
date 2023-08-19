# Use an official OpenJDK runtime as the base image

FROM openjdk:17



# Set the working directory in the container

WORKDIR /app



# Copy the Spring Boot executable JAR file into the container

COPY target/productService-0.jar /app/productService-0.jar



# Expose the port that the Spring Boot application will run on

EXPOSE 5005



# Specify the command to run your Spring Boot application

CMD ["java", "-jar", "productService-0.jar"]
