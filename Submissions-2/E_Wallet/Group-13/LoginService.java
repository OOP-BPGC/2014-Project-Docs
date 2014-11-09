
/**
* Provides authenticated related processing.
*/
public interface LoginService {

     /**
     * Handles a request to login.  Passwords are stored as an MD5 Hash in
     * this system.  The login service creates a hash based on the parameters
     * received and looks up the user.  If a user with the same userName and
     * password hash are found, true is returned, else false is returned.
     * 
     * @parameter userName
     * @parameter password
     * @return    boolean
     */
     boolean login(String userName, String password);
}
