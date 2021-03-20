# Trade Engine
Is a small application that solves a supplied programming problem.
I only had a 2-3 hours to put this together due to work and family commitments. Thus I chose the simplest design while satisfying the requirements.
My main design choice was to generate a POJO of the Event XML structure using JAXB and simply un marshalling the contents of the xml files into an array of the object graph.
I then had a service bean which simply looped through the files while un marshalling the XML before filtering the list of events and outputting the desired events to the console.

I included the XML files in the resources directory so they would be always available when running the integration test or the application

## Tools you will need
Maven 3.0+ is your build tool
Your favorite IDE (I am using Eclipse as I am too cheap to pay for Intellij)
JDK 1.8+ (when building, make sure your IDE is using the JDK and not the JRE)

## Installation

- Download the TradingEngine Maven project. I have also included some Eclipse project files if you wish to do an Eclipse project import but you can do a Maven import on any other IDE.
- You may have to modify the parent section of the pom.xml file depending on what Repository you have access to. You may have to change it to
    <parent>
      ```xml
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-parent</artifactId>
      <version>1.4.3.RELEASE</version>
      <relativePath/> <!-- lookup parent from repository -->
    </parent>
    ```xml
- Clean and build the project and run the application by launching the main in TradingEngineMain.java. 
- Trigger the application via the Restful endpoint (http://localhost:8080/tradingengine/parseEventFiles) then the output will be available on the console.
