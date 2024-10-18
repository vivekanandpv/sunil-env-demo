FROM openjdk:21-jdk

COPY target/sunil-env-demo-0.0.1-SNAPSHOT.jar .

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "./sunil-env-demo-0.0.1-SNAPSHOT.jar"]