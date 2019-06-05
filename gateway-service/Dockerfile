FROM openjdk
MAINTAINER Girish Pant <girish.pant@uneecops.com>
ADD target/gateway-service.jar gateway-service.jar
ENTRYPOINT ["java", "-jar", "/gateway-service.jar"]
EXPOSE 8765