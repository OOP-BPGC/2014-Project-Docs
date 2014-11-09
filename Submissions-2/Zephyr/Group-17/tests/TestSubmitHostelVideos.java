import junit.framework.TestCase;


public class TestSubmitHostelVideos extends TestCase{
	TestSubmitHostelVideos(String message)
	{
		super(message);
	}
	void TestCaseOne()
	{
		//Hostel Representative constructor takes in name of the HR and hostel name as parameters
		HostelRepresentative HR=new HostelRepresentative("somename","Hostelname");
		//SubmitHostel video returns a String message
		assertEquals("Hostel videos successfully uploaded",HR.SubmitHostelVideo());
	}
	void TestCaseTwo()
	{
		
		HostelRepresentative HR=new HostelRepresentative("somename","Hostelname");
		HR.SubmitHostelVideo();
		//Because the video has been uploaded already,a message is flashed informing the HR of the same
		assertEquals("Video submitted already",HR.SubmitHostelVideo());
		
	}
}

