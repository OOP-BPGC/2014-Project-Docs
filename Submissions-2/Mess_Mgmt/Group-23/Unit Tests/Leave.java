public interface Leave
{
	public String startDate;
	public String endDate();
	
	public void setStartDate(String s);
	public void setEndDate(String s);
	public String getStartDate();
	public String getEndDate();
	public void validate();
	public void submit();
	public Leave();
}