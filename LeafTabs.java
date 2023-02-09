package SeleniumLearn;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LeafTabs {
	public static void main(String[] args) {
		//launch the browser
		EdgeDriver browser=new EdgeDriver();
		//load the url
		browser.get("http://leaftaps.com/opentaps/control/main");
		//to maximize the browser
		browser.manage().window().maximize();
		browser.findElement(By.id("username")).sendKeys("Demosalesmanager");
		browser.findElement(By.id("password")).sendKeys("crmsfa");
		browser.findElement(By.className("decorativeSubmit")).click();
		String text= browser.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		browser.findElement(By.linkText("CRM/SFA")).click();
		browser.findElement(By.linkText("Leads")).click();
		browser.findElement(By.partialLinkText("Create")).click();
		browser.findElement(By.partialLinkText("Create")).click();
		browser.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		browser.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		browser.findElement(By.id("createLeadForm_lastName")).sendKeys("Raj");
		browser.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
		browser.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Raj");
		browser.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Miss");
		browser.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Design");
		browser.findElement(By.id("createLeadForm_departmentName")).sendKeys("Design architect");
		browser.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("6,000,000");
		browser.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("14");
		browser.findElement(By.id("createLeadForm_sicCode")).sendKeys("1794");
		browser.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("des");
		browser.findElement(By.id("createLeadForm_description")).sendKeys("To Create a new Lead");
		browser.findElement(By.id("createLeadForm_importantNote")).sendKeys("Nil");
		browser.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		browser.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("+44");
		browser.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7094931002");
		browser.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Priya");
		browser.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priya01@gmail.com");
		browser.findElement(By.id("createLeadForm_generalToName")).sendKeys("Priya Raj");
		browser.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Raj kumar");
		browser.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("14,kamaraj street,");
		browser.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("palavanthangal");
		browser.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		browser.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600016");
		browser.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("3");
		
	}
	

		
		
	}


