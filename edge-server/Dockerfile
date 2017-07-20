FROM java:8-jre

ADD ./build/libs/edge-server-0.0.1-SNAPSHOT.jar /app/edge-server.jar

EXPOSE 4000

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx200m", "-jar", "/app/edge-server.jar"]