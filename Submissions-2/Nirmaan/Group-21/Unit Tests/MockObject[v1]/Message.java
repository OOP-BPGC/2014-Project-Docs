import java.util.Date;



public interface Message {

	public String decodeString(String msg);
	public String encodeString(String msg);
	public boolean isAvailable(Person p);
	public boolean setDate(Date d);
	public boolean setBody(String s);
	public boolean setTag(String s);
	public boolean setFrom(String s);
	public boolean setTo(String s);
	public boolean setPrivilege(int priv);
	public Date getDate();
	public String getBody();
	public String getTag();
	public String getFrom();
	public String getTo();
	public int getPrivilege();
	
}
