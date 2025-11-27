# spring-boot-tutorial
Catching up with Spring boot after spending several years working with C#/DotNet

Resources:
* YouTube course: https://www.youtube.com/watch?v=Cw0J6jYJtzw
* Github repo: https://github.com/amigoscode/spring-boot-crash-course/blob/main/src/main/resources/application.properties

### Docker commands 
```
docker compose up -d
docker compose ps
docker compose logs
```

If "mydb" exists, do this:
```
docker exec -it postgres-spring-boot psql -U postgres -d mydb
```

Else, do this:
```
docker exec -it postgres-spring-boot bash
psql -U postgres
create databse mydb;
\c mydb // Connect to DB "mydb"

\l          // list of databases
\dt         // list of tables
\d users    // describe table schema
```

