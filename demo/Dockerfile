FROM java:8-jre

ENV TZ=Europe/Berlin
RUN echo $TZ | tee /etc/timezone
RUN dpkg-reconfigure --frontend noninteractive tzdata

ARG jarPath=./build/libs/de.jar 
ADD $jarPath /app/


EXPOSE 8091
VOLUME ["/opt/abda-plusx"]

CMD ["java", "-Dspring.profiles.active=docker", "-Xmx2048m", "-jar", "/app/demo.jar"]