FROM rainee/docker-alpine-oraclejdk8
VOLUME /tmp

ADD ./target/spring-boot-microservice-currency-conversion-2-0.0.1-SNAPSHOT.jar ccrealtime.jar
RUN sh -c 'touch /ccrealtime.jar'
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8787,suspend=n"
EXPOSE 8080
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=docker -jar /ccrealtime.jar" ]
