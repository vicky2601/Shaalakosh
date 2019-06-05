FROM openjdk
MAINTAINER Girish Pant <girish.pant@uneecops.com>
ADD target/customer-service.jar school-service.jar
ENTRYPOINT ["java", "-jar", "/school-service.jar"]
EXPOSE 3333