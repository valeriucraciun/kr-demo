FROM java:8-jre

ADD ./build/libs/discovery-service-0.0.1-SNAPSHOT.jar /app/discovery-service.jar

EXPOSE 8761

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx200m", "-jar", "/app/discovery-service.jar"]