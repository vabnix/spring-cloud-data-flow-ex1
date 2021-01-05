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

Registering the application from shell. Open a new command prompt and type this command
```bash
docker exec -it dataflow-server java -jar shell.jar

  ____                              ____ _                __
 / ___| _ __  _ __(_)_ __   __ _   / ___| | ___  _   _  __| |
 \___ \| '_ \| '__| | '_ \ / _` | | |   | |/ _ \| | | |/ _` |
  ___) | |_) | |  | | | | | (_| | | |___| | (_) | |_| | (_| |
 |____/| .__/|_|  |_|_| |_|\__, |  \____|_|\___/ \__,_|\__,_|
  ____ |_|    _          __|___/                 __________
 |  _ \  __ _| |_ __ _  |  ___| | _____      __  \ \ \ \ \ \
 | | | |/ _` | __/ _` | | |_  | |/ _ \ \ /\ / /   \ \ \ \ \ \
 | |_| | (_| | || (_| | |  _| | | (_) \ V  V /    / / / / / /
 |____/ \__,_|\__\__,_| |_|   |_|\___/ \_/\_/    /_/_/_/_/_/

2.7.0

dataflow:>app register --name VaibhavSource --type source --uri file://root/scdf/scdf/source/scdf_source_app-1.0.0.RELEASE.jar
Successfully registered application 'source:VaibhavSource'

dataflow:>app register --name VaibhavSink --type sink --uri file://root/scdf/scdf/source/scdf_sink_app-1.0.0.RELEASE.jar
Successfully registered application 'sink:VaibhavSink'

dataflow:>app register --name VaibhavProcessor --type processor --uri file://root/scdf/scdf/source/scdf_processor_app-1.0.0.RELEASE.jar
Successfully registered application 'processor:VaibhavProcessor'
```


