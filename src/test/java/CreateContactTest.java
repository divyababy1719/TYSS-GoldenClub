

import org.testng.annotations.Test;

public class CreateContactTest {
@Test(groups="smoke")
public void createContact()
{
	System.out.println("Contact Created");
	
	System.out.println("Hi chandu");
=======
	System.out.println("This statment is added by sanjay in createcontact");
	System.out.println("Hi chandan");
}
@Test(groups="regression")
public void modifyContact()
{
	System.out.println("Contact Modified");
	System.out.println("changes done by gokul");
	
	System.out.println("Bye chandu");

}

}
