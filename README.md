# Spring Cloud Data Flow Example with RabbitMQ Binder

Repository contains 3 individual spring application . This is Message-driven applications where an unbounded amount of data is consumed or produced through a single input or output (or both).

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

| Application   | Associated Port   | Remarks |
| ------------- |:-------------:| :-------------:|
| scdf_source_app   | 8081 | Message producer that sends messages to a destination |
| scdf_sink_app     | 8082 | Message consumer that reads messages from a destination |
| scdf_processor_app  | 8083 | The combination of a source and a sink. A processor consumes message from a destination and produces messages to send to another destination |


