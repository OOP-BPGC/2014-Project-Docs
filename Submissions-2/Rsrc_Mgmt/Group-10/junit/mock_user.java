
package javaapplication2;

public class mock_user 
{
private String Username=null;
private String Password=null;

public String getUsername(){
    return this.Username;
}
protected String getPassword(){
    return this.Password;
}
public void setUsername(String username){
     this.Username=username;
}
public void setPassword(String password){
     this.Password=password;
}

}
