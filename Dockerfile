FROM maven:3.9.3-amazoncorretto-20 as build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install

FROM alpine as build_2
COPY --from=build /usr/src/app/target /app
RUN ["ls", "-l", "/app"]

FROM alpine as build_3
COPY --from=build_2 /app /app
RUN ["ls", "-l", "/app"]