### About
Kafka (in docker) + Spring Boot App

#### Prerequisites
* Java 12
* add `kafka` to `/etc/hosts` e.g. `127.0.0.1	localhost kafka`

#### Run
```
docker-compose up

./gradlew bootRun

curl -X POST \
  http://localhost:9000 \
  -H 'Content-Type: text/plain' \
  -d 'another brick in the wall'

```