FROM eclipse-temurin:21.0.1_12-jdk-alpine
WORKDIR /app
COPY target/starthub-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["java","-jar","starthub-0.0.1-SNAPSHOT.jar"]
