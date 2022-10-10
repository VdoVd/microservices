FROM java:8-jre
MAINTAINER liuhaobin <3577504312@qq.com>

ADD ./target/com.config.jar /app/
CMD ["java","-Xmx200m","-jar","/app/com.config.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8888/actuator/health ||exit 1

8888