# demo

## Description 

A very simple Springboot app that models the customer discussed on the [microservices.io](https://microservices.io/index.html) site.  We'll use this to kick off the winmicroservices organization set of repositories.

### Microservices Patterns

+ [Database Per Service](https://microservices.io/patterns/data/database-per-service.html)
+ [Saga](https://microservices.io/patterns/data/saga.html)
+ [CQRS](https://microservices.io/patterns/data/cqrs.html)
+ [Transactional Outbox](https://microservices.io/patterns/data/transactional-outbox.html)


## Run locally

Create the Docker volumes:

```
docker volume create kafka_data
docker volume create mysql-demo-volume
docker volume create zookeeper_data
```

Start the containers with Docker Compose:

```
docker-compose up -d
```

Populate the database

+ Log in to PHP Myadmin http://localhost 
  + db: mysql
  + username: root
  + password: password

+ Run the following SQL scripts from src/main/sql:
  + create-user.sql
  + Log out of Myadmin
  + Log back in PHP Myadmin with the credentials: 
    + db: mysql
    + username: demo
    + password: demo
  + Run the following script to create the database:  
  + create-database.sql


```
mvn -Pnative spring-boot:build-image
```


## APIs

### Swagger API

[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

### Hatoes

The rest apis in this example app follow the Hatoes link strategy.
This [article](https://www.springcloud.io/post/2022-04/hateoas-spring-boot-and-jpa/#gsc.tab=0) has a description of how Hatoes works with SpringBoot.

### Create Customer

This is a sample http POST for creating a customer.

```
curl -X POST http://localhost:8080/api/v1/customer \
   -H 'Content-Type: application/json' \
   -d '{"firstName":"Bill","lastName":"Polinchak","city":"Venice"}'
```

### Get Customer

This is a sample http GET for retreiving a customer.

```
curl http://localhost:8080/api/v1/customer/1
```

### Get Customers

This is a sample http GET for retreving a list of customers.

```
curl http://localhost:8080/api/v4/customer
```

This is a sample http GET that performs a search and sort.

```
curl http://localhost:8080/api/v4/customer?firstNameFilter=B&lastNameFilter=P&page=0&size=5&sortList=firstName&sortOrder=ASC
```

### Update Customer

This is a sample http PUT for updating a customer.

```
curl -X PUT http://localhost:8080/api/v1/customer/1 \
   -H 'Content-Type: application/json' \
   -d '{"firstName":"William","lastName":"Polinchak","city":"Venice"}'
```

### Delete Customer

This is a sample http GET for deleting a customer.

```
curl -X DELETE http://localhost:8080/api/v1/customer/1
```
## GraalVM

GraalVM builds a native image for the Java app to start up and run faster.

### Springboot support

Springboot supports GraalVM.  Refer to this link on [SpringBoot GraalVM](https://docs.spring.io/spring-boot/docs/3.0.0/reference/html/native-image.html#native-image) support.

### Build GraalVM Docker Image with Maven