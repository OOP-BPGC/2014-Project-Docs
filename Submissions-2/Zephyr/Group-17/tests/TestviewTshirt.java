

import junit.framework.TestCase;


public class testviewTshirt extends TestCase {
	
	viewTshirt xy = new viewTshirt();
	public testviewTshirt(){
		super();
	}
	
	public void testwrongoption(){
		try{
			xy.view(11);
		}catch(wrongoptionenteredexception e){
			System.out.println("wrong option entered");
		}
	}

	public void testrightoption(){
		try{
			xy.view(3);
			System.out.println("the right option was entered");
		}catch(wrongoptionenteredexception e){
			System.out.println("wrong option entered");
		}
	}
}
