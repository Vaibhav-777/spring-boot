FROM amazoncorretto:11-alpine-jdk
COPY target/SpringDemo-0.0.1-SNAPSHOT.jar  SpringMysql.jar
ENTRYPOINT ["java","-jar","/SpringMysql.jar"]
