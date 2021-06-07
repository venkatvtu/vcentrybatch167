package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Preconditions {

	//Background: To run all the scenario we need to check, verify network,excel,properties
	@Given ("verify network")
public void verifyNetwork()
{
	System.out.println("network is connected");
}
	@Given ("verify excel location")
	public void verifyExcellocation()
	{
		
	}
	@Given ("verify properties file location")
	public void verifyPropertiesFileLocation()
	{
		
	}
	@Given ("verify database")
	public void verifyDatabase()
	{
		
	}
	@When ("enter username and password in db login url")
	public void enterUsernameAndPassword()
	{
		
	}
	@When ("establish db connection")
	public void establishDbConnection()
	{
		
	}
	@Then ("verify db connected or not")
	public void verifyDbConnectedOrNot()
	{
		
	}
	
	
	
}
