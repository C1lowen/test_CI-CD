FROM openjdk:17

WORKDIR /app

COPY target/testCICD-0.0.1-SNAPSHOT.jar testCICD-0.0.1-SNAPSHOT.jar

CMD ["java", "-jar", "testCICD-0.0.1-SNAPSHOT.jar"]