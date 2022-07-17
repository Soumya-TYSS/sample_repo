package practice;
import org.testng.annotations.Test;



public class SampleCreateDeleteTest
{

	@Test(groups = "smoke")
	public void createContact() throws Throwable
	{
		System.out.println("contact created");
		System.out.println("create and delete");
		System.out.println("vgcghfjh");
		
	}
	@Test(groups = "regression")
	public void createAndDeleteContact()throws Throwable
	{
		System.out.println("crated with delete options..");
		System.out.println("delete");
	}
}

