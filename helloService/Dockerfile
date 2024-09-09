FROM openjdk:22
EXPOSE 8080
ADD target/helloService.jar helloService.jar
ENTRYPOINT ["java","-jar","/helloService.jar"]