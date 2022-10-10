FROM java:8-jre
MAINTAINER liuhaobin <3577504372@qq.com>

ADD ./target/auth-service.jar /app/
CMD ["java","-Xmx200m","-jar","/app/auth-service.jar"]

EXPOSE 5000