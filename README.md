# mb-rest-service
Rest API to get details from MusicBrainz API about artist details based on Artist MB ID.

###Solution:

This API Consumes details from three third party REST API's to provide information about Artist details like Description of the Artist, List of Albums and Cover Art details corresponding to each Album.

###Third Party Rest APIs used:

- http://musicbrainz.org/doc/Development/XML_Web_Service/Version_2
- https://www.mediawiki.org/wiki/API:Main_page
- https://wiki.musicbrainz.org/Cover_Art_Archive/API

###Technologies and Tools Used:

* [Java 8] [java] - Used Lambda Expressions and Streaming API to work with Collections like List, also used Functional programming concepts like map, collect, filter etc..
* [Maven] [maven] - Used Maven for building Spring Rest API Application and to maintain the dependencies jars in Central repository.
* [Spring Boot] [springboot] - Spring boot to easily run the Spring based applications locally and using embedded web container.
* [Spring RestTemplate] [resttemplate] - Used this to consume external restful web services easily.
* [Spring MVC] [springmvc] - Used Spring MVC Controller for developing restful web services.
* [Spring Tool Suite (STS) IDE] [sts] - Used STS as IDE for developing Spring based applications.
* [Gson Library] [gson] - Gson to convert Json text to Java POJO classes easily.

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
- Right Click and Run as Spring Boot Application, thats all, once the tomcat server is started, You should be able to test the REST endpoint by opening up your browser and hitting [http://localhost:8080/mbapp/{mbid}] [appurl]

###How to Deploy the code:

Since its a Spring Boot project, by default it comes with embedded Tomcat server, so you can directly run the jar using the below command.

```sh
java -jar mb-rest-service.jar
```

Then you can access the service using the below url.

[http://localhost:8080/mbapp/{mbid}] [appurl]


###Short Cuts used:

- To create Java POJO objects from JSON Text used this site http://www.jsonschema2pojo.org/
- Used Gson library to convert JSON to Java
- To understand the JSON structure, used http://www.jsoneditoronline.org/




[appurl]: <http://localhost:8080/mbapp/{mbid}>
[gson]: <https://github.com/google/gson>
[java]: <https://www.oracle.com/java/index.html>
[springboot]: <http://projects.spring.io/spring-boot/>
[maven]: <https://maven.apache.org/>
[springmvc]: <http://docs.spring.io/spring/docs/current/spring-framework-reference/html/mvc.html>
[resttemplate]: <http://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/client/RestTemplate.html>

