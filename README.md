# -Stream_SCHEDULE_RESTAPI


1: IntelliJ Community:

	1.1: We will need to get the pre-requisites for our project

		*Plugins - GitHub Copilot - code hint and completion for IntelliJ
		*New Project
		*Spring Initialiser from menu

		

	1.2: Project JAR - to create a jar for our project. We choose an artefact Id, Java version

		
		*Java - Maven Project
		*Spring Boot 2.6.3
		*ArtifactID: stream-schedule-mansoor
		*Name: stream_schedule
		*Jar
		*Java 17
		
		*NEXT


	1.3: Dependencies - the dependencies we need to import in order to use functionalities

		*Spring-Web
		*Bean Validation 		//Validating user input for handling the logic

		*FINISH



2: Stream_SCHDEULE:

	2.1: Stream_Schedule project is ready with the pom file and dependencies. To make sure nothing is messy, we run the webApplication.class where it should run successfully on port 8080

		*StreamScheduleApplication.java
		
		*IT SHOULD RUN SUCCESSFULLY



3: Data Model:

	3.1: Data Model - We create our internal channel data model, @POJO classes

		*MutableLiveStream.java		//attributes id, titel, description, url, startDate, endDate
		*ImmutableLiveStream.java		//CONSTANT FINAL attribute attributes id, titel, description, url, startDate, endDate
		

		*JAVA 17 FEATURE
		*LiveStreamRecord		//a record to make immutable class  




Test Cases:

1: Data Model:

	1.1: Data Model Test - test cases to test the Mutable Live Stream Class getters/setters & instantiation

		*LiveStreamTest.java		//public void mutableTest();
















 




