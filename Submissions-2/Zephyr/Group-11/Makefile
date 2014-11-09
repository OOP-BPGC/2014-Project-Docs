all:Utility.class Person.class Pair.class CustomComparator.class Event.class
	javac console/Application.java 
	java -classpath "../lib/:sqlite-jdbc-3.8.7.jar" Application  

Utility.class: zephyr/Utility.java
	javac zephyr/Utility.java 
Person.class: zephyr/Person.java
	javac zephyr/Person.java
Pair.class: zephyr/Pair.java
	javac zephyr/Pair.java
CustomComparator.class: zephyr/CustomComparator.java
	javac zephyr/CustomComparator.java 
Event.class: zephyr/Event.java
	javac zephyr/Event.java
clean:
	rm -v -r *.class 
