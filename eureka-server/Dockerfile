FROM openjdk:8-jdk-alpine
EXPOSE 8761
VOLUME /tmp
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
