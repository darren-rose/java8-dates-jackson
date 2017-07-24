### fun with Java 8 Dates and Jackson

uses Lombok and jackson-datatype-jsr310

demonstrates Java 8 Instant serialisation and de-serialisation

#### To run

gradle bootrun

```GET http://localhost:10699/some```

```POST http://localhost:10699/some  {"created" : 1500930212091 } ```