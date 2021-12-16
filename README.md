# hex-pizza

Simple sample application to demonstrate hexagonal architecture.

## Business logic

- Clients can create a new type of pizza with a name and price per square inch
- Clients can get a pizza type by its id

## Tech

App is runnable via Spring Boot and in-memory JDBC database.

## Running locally

```commandline
./gradlew clean bootRun
```

### Create

For example:

```commandline
curl --verbose --request POST localhost:8080/pizza -H "Content-Type: application/json" --data '{"name": "sausage party", "pricePerSquareInch": 23}'
```

### Get

For example:

```commandline
curl --verbose localhost:8080/pizza/1
```
