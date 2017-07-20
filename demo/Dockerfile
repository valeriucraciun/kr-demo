FROM java:8-jre

ADD ./build/libs/demo-0.0.1-SNAPSHOT.jar /app/demo.jar

EXPOSE 8080

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx200m", "-jar", "/app/demo.jar"]