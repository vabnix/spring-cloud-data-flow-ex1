# Spring Cloud Data Flow Example with RabbitMQ Binder

Repository contains 3 individual spring application 

Follow Below Steps

If are familiar with Docker and docker compose then there is docker-compose file under scdf_source_app, this will help you in getting background app up and running like RabbitMQ, Spring Cloud Dataflow Server, MySQL database.
```bash
docker-compose up
```
Once the docker instance are up you can access RabbitMQ home at

| Application   | Url           |
| ------------- |:-------------:|
| RabbitMQ     | http://localhost:15672/ |
| SCDF Server     | http://localhost:9393/dashboard/ |

Start each individual application from this repository 

| Application   | Associated Port   |
| ------------- |:-------------:|
| scdf_source_app   | 8081 |
| scdf_sink_app     | 8082 |
| scdf_processor_app  | 8083 |
