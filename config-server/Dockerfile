FROM java:8-jre

ADD ./build/libs/config-server-0.0.1-SNAPSHOT.jar /app/config-server.jar

EXPOSE 8888

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx200m", "-jar", "/app/config-server.jar"]