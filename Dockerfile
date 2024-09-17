FROM openjdk:18
WORKDIR /app
COPY ./target/EVChargingStationSonarTT-0.0.1-SNAPSHOT.jar /app
EXPOSE 8081
CMD ["java", "-jar", "EVChargingStationSonarTT-0.0.1-SNAPSHOT.jar"]
