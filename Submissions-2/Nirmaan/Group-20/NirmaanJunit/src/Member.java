/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sreejith
 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.ArrayList;
public class Member extends Person implements Serializable{
private String userName;
private String password;
private Designation designation;
public Member(String Name,String ContactNum,String userName, String password, Designation designation) {
super(Name,ContactNum);
this.userName= userName;
this.password = sha256(password);
this.designation = designation;
}
/**
* Takes a string, hashes it using SHA-256 and then returns a hex string.
* @param base
* @return
*/
public boolean RequestTransaction(String name,String reason,double amount)
{
    Transaction t1 = new Transaction(name,reason,amount);
    boolean done=t1.registertransaction();
       
    return done;    
  
}
public boolean RequestEvent(String name,String Date,String Venue)
{
    return true;
}
private static String sha256(String base) {
try{
MessageDigest digest = MessageDigest.getInstance("SHA-256");
byte[] hash = digest.digest(base.getBytes("UTF-8"));
StringBuffer hexString = new StringBuffer();
for (int i = 0; i < hash.length; i++) {
String hex = Integer.toHexString(0xff & hash[i]);
if(hex.length() == 1) hexString.append('0');
hexString.append(hex);
}
return hexString.toString();
} catch(Exception ex){
throw new RuntimeException(ex);
}
}
/**
* Use this method to register a member and returns true if successful. Adds the current object to an ArrayList and serializes it.
* @return
*/
@SuppressWarnings("unchecked")
public boolean register() throws Exception {
ArrayList<Member> members;
members = (ArrayList<Member>)Utility.deserialize("members.ser");
if(members == null) {
members = new ArrayList<Member>();
}
if(this.checkUserNameExists(members)== false) {
members.add(this);
Utility.serialize(members, "members.ser");
return true;
}
else {
return false;
}
}
/**
*
* @param userName
* @param password
* @return
*/
public static boolean authenticate(String userName, String password) {
ArrayList<Member> members;
password = sha256(password);
members = (ArrayList<Member>)Utility.deserialize("members.ser");
if(members == null) {
return false;
}
for(Member member:members) {
if(member.userName.equals(userName))
{   //System.out.println("Username exists");
    if(member.password.equals(password))
    {//System.out.println("password also matches");
    return true;
    }
}

}
return false;
}
/**
* Checks if the user name already exists; returns true if it does
* @param members
* @return
*/
private boolean checkUserNameExists(ArrayList<Member> members) throws Exception {
for(Member member:members) {
if(this.userName.equals(member.userName)){
return true;
}
}
return false;
}
public static ArrayList<Member> search(String query) {
ArrayList<Member> members;
ArrayList<Member> result = new ArrayList<Member>();
members = (ArrayList<Member>)Utility.deserialize("members.ser");
for(Member member: members) {
if(member.userName.contains(query)) {
System.out.println("Here!");
result.add(member);
}
}
System.out.println("Somthim");
return result;
}
/*public static void main(String[] args) throws Exception {
Member one = new Member("Sreejith","888888888","joke","one123", Designation.GENERAL);

Member two = new Member("someone","0987-56789898","jimbru","oneplusone", Designation.GENERAL);
try
{System.out.println(one.register());
System.out.println(two.register());
System.out.println(two.register());
ArrayList<Member> result = Member.search("jimbru");
System.out.println(result.size());
System.out.println(two.authenticate("jimbru12", "oneplusone"));
}
catch(Exception E)
{
    
}
}
*/
}