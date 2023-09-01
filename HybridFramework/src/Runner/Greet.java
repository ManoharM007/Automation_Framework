package Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Greet 
{
@Test
public void Test1()
{
	System.out.println("Hi");
}
@Test
public void Test2()
{
	System.out.println("Bye");
	Assert.fail();
}
@Test(dependsOnMethods = "Test2")
public void Test3()
{
	System.out.println("elloi");
}
}
