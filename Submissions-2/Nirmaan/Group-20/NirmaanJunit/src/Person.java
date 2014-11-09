/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sreejith
 */
public class Person {
    String name;
String contactNumber;
Person()
{
    this.name="Null";
    this.contactNumber="0000000000";
}
Person(String nam,String contactNumber)
{
    this.name=nam;
    this.contactNumber=contactNumber;
}
public void setName(String name) {
this.name= name;
}
public String getname()
{
    return this.name;
}
    
}
