

import org.testng.annotations.Test;

public class CreateContactTest {
@Test(groups="smoke")
public void createContact()
{
	System.out.println("Contact Created");
}
@Test(groups="regression")
public void modifyContact()
{
	System.out.println("Contact Modified");
	System.out.println("Soumya is changing the code for the first time");
}

}
