FROM openjdk:17

COPY target/DockerFile.jar docker.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","docker.jar"]