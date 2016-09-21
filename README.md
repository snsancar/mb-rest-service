# mb-rest-service
Rest API to get details from MusicBrainz API about artist details

Solution:

This API Consumes details from three third party REST API's to provide information about Artist details like Description of the Artist, List of Albums and Cover Art details corresponding to each Album.

###Third Party Rest APIs used:

- http://musicbrainz.org/doc/Development/XML_Web_Service/Version_2
- https://www.mediawiki.org/wiki/API:Main_page
- https://wiki.musicbrainz.org/Cover_Art_Archive/API

###Technologies and Tools Used:

* [Java 8]
- Maven
- Spring Boot
- Spring RestTemplate
- Spring MVC
- Spring Tool Suite (STS) IDE

###How to Build the code:

```sh
cd mb-rest-service
mvn clean install
```

It creates a fat jar with all dependencies.

###How to run the Application from STS or Eclipse IDE.

- Just clone the code to your desktop using Git Clone command.
- Import the existing maven project to STS tool using Import option.
- Open the Application.java file
- Right Click and Run as Spring Boot Application, thats all, once the tomcat server is started, you can access the application using * [http://localhost:8080/mbapp/{mbid}] [appurl]

###How to Deploy the code:

Since its a Spring Boot project, by default it comes with embedded Tomcat server, so you can directly run the jar using the below command.

```sh
java -jar mb-rest-service.jar
```

Then you can access the service using the below url.

http://localhost:8080/mbapp/{mbid}


[appurl]: <http://localhost:8080/mbapp/{mbid}>
