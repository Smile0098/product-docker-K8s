FROM openjdk:17-jdk-slim-buster
EXPOSE 5656
COPY target/product-service-0.0.1-SNAPSHOT.jar product-service-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","product-service-0.0.1-SNAPSHOT.jar"]
