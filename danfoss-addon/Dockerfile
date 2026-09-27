FROM maven:3.9-eclipse-temurin-21 AS build

WORKDIR /build
COPY pom.xml .
COPY src src
RUN mvn clean package -B -DskipTests

FROM ghcr.io/home-assistant/base:latest

RUN mkdir -p /share/danfoss-icon/

RUN apk add --no-cache openjdk21

WORKDIR /

COPY run.sh /
RUN chmod a+x /run.sh

COPY --from=build /build/target/ha-danfoss-addon-*.jar /app.jar

CMD [ "/run.sh" ]