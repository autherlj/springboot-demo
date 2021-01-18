FROM openjdk:8
COPY ./target/*.jar /usr/src/myapp/
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "/usr/src/myapp/springboot-demo-0.0.1-SNAPSHOT.jar"]
