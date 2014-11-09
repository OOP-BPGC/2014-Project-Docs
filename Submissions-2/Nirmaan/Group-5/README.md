Group-5
=======
File structure:
	-Submission1/							Contains the files for submission1
	
	-Submission2/							Contains the files for submission2 ( UML and jUnit tests )
		-UML/
			-Activity Diagram 1.zargo		
			-Activity Diagram 2.zargo		
			-Class Diagram 1.zargo			
			-sequence and collaboration.vpp	
			
		-nirmaanam/							(Package) Contains stubs of the classes and jUnit Test files. Easy to import
			-Activity.java			Code stub for the class
			-Database.java						"
			-Discussion.java					"
			-Event.java							"
			-EventUpdate.java					"
			-Meeting.java						"
			-Notice.java						"
			-TimeTable.java						"
			-Vertical.java						"
			-Volunteer.java						"
			-TestActivity.java		Test for the class
			-testEvent.java						"
			-TestMeeting.java					"
			-testTimeTable.java					"
			-TestVertical.java					"
			-TestVolunteer.java					"

UML diagrams:
	The relevant UML diagrams have been created in ArgoUML and Visual Paradigm

Testing:
	Tests have been implemented using the jUnit and EasyMock frameworks.
	The Database class has been replaced by a Mock class to facilitate testing. It will be replaced by the actual class ( tested separately ) once the testing is complete.
