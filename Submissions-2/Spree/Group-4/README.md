Group-4
This project is based on the sports fest Spree and includes an easy mantenance of the fest which include the participant registration, accomodation, payment, reimbursement, schedule , socres, inventory managemnet, registration for non sporting events, role of event managers and convener and their access to various classes and methods of the program.

The project is under development stage and cureently the Use Case diagrams, UML diagrams, CRC Cards and various Unit tests have been completed. Basic class and method structure is made and testing is done using EasyMock Test.

In unit testing using EasyMock various methods are checked for their correct return type and values. Inputs from the user are also verified so that only syntatically valid entries are stored in the database.
Various EasyMock tests include:
A) participantTest()
cancelReg() method is tested for the participant which should cancel the registration for a sport and it should return a string "Cancelled" to the participant. This is checked using the assertEquals() by using the cancelReg() method on an object of participant class.
Similarly, the payment() method is tested which should return "Paid" upon the payment by the participant.

B) checkSlotsTest()
This test returns a value 1 if slots are available and 0 if slots are not availabe for a sport. This checkSlots() method is used on an object of sport class.

C) EMTest()
Methods that can be used on an object of EM, i.e. the class for event manager to verify whether the schedule, score and standings are updated by the methods scheduleUpdate(), scoreUpdate(), standings() respectively.
Also inventory is test if the number of items taken out by EM are successfully deducted from the inventory and the number of items returned by the EM to the inventory does not exceed the original number

D) testLogin()
Test if the web application and its user interface is working properly. Check for the proper functioning of various fields.

E) bankTest()
Test whether the amount to be reimbursed to the participant upon applying for reimbursement is actually approved by the convener and return "Returned" upon the reimbursement of the amount.

F) registerCheck()
Test for the correct syntax of participant's email id and the values of the attributes of participant class such as name, college, mobile, id and username should not be null.

=====
