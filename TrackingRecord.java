import java.util.Date;
import java.util.Scanner;

public class TrackingRecord
{
    private Citizen citizen;
    private String healthStatus;
    private float temperature;
    private java.sql.Date date;
    private Shop shop;

    public TrackingRecord (Citizen citizen, float temperature, java.sql.Date date, Shop Shop)
    {
        this.citizen = citizen;
        this.temperature = temperature;
        this.date = date;
        this.shop = Shop;
    }
    
    public void setCitizen(Citizen citizen)
    {
        this.citizen = citizen;
    }

    public void setHealthStatus(String healthStatus)
    {
        this.healthStatus=healthStatus;
    }

    public void setTemperature(float temperature)
    {
        this.temperature = temperature;
        //what changes to be made in main class
    }

    public void setShop(Shop shop)
    {
        this.shop = shop;
    }

    public void setDate ()
    {
        long millis=System.currentTimeMillis();  
        this.date=new java.sql.Date(millis);  
    }

    public Citizen getCitizen ()
	{
		return citizen;
	}

    public String getHealtStatus ()
	{
		return healthStatus;
	}

    public float getTemperature ()
	{
		return temperature;
	}

    public java.sql.Date getDate ()
	{
		return date;
	}

    public Shop getShop ()
	{
		return shop;
	}

    public void display()
	{
        //Show all the tracking record information
		System.out.printf("\nHealth status     :%s\n",healthStatus);
		System.out.printf("Temperature       :%.1f\n",temperature);
		System.out.printf("Date              :"+date+"\n");
        shop.display();
		System.out.printf("\n\n");

    }
    public void officerDisplay()
    {
        citizen.officerDisplay();
        System.out.printf("Health status     :%s\n",healthStatus);
		System.out.printf("Temperature       :%.1f\n",temperature);
		System.out.printf("Date visit        :"+date+"\n");
        
    }
}
