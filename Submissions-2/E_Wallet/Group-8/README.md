Group-8
=======

9th November 2014
-------------------------------
All uml diagrams moved to folder uml
All test cases in src/test/java/bits/ewallet/
All dependencies added to pom.xml file
Spring loaded via web.xml in src/main/webapp/WEB-INF
TO run the project edit the ewallet.properties file. Remove comments and give username and password and database name at appropriate places. Then set path of the file in tomcat(or any other server) VM options.

Test Cases
All tests are in the package src/test/java/bits/ewallet/
All entity Test cases will run unconditionally
To run test cases for repository, database setting is required along with the following changes in the source code:
As properties file is loaded from tomcat environment, Test cases will not work with this setting. To run tests, open the spring-data.xml file in src/main/resources/spring and edit the following lines.

p:driverClass="${app.jdbc.driverClassName}"
p:jdbcUrl="${app.jdbc.url}"
p:user="${app.jdbc.username}"
p:password="${app.jdbc.password}"

enter the values directly instead of reading from properties file.
