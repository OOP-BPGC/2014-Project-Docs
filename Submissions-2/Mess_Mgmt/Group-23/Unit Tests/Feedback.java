public interface Feedback
{
	public String Description;
	public String title;
	public String status;
	
	public String getDescription();
	public void setDescription(String s);
	public String getTitle();
	public void setTitle(String s);
	public String getStatus();
	public String setStatus(String s);
	public void submit();
	public Feedback();
}