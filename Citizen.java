import java.util.Scanner;

class Citizen extends Person
{
	Scanner scanner = new Scanner(System.in);
	private TrackingRecord[] trackingRecord = new TrackingRecord[0];

	Citizen(String name, String contactNum, String password)
	{
		super(name, contactNum, password);
	}
	public void display()
	{
		System.out.printf("\n===Personal Detail===\n");
		System.out.printf("Name           : " + this.getName()+"\n");
		System.out.printf("Contact Number : " + this.getContactNum()+"\n");
		System.out.printf("\n===Tracking Record===\n");
		for(int i=0;i<trackingRecord.length;i++)
		{
			trackingRecord[i].display();
		}
	}
	public void officerDisplay()
	{
		System.out.printf("Name           : " + this.getName()+"\n");
		System.out.printf("Contact Number : " + this.getContactNum()+"\n");
		
	}
	public void  addTrackingRecord(ShopOwnerList shopOwnerList)
	{
		String Id;
		java.sql.Date date;
		String temperatureLine;
		float temperature;
        long millis=System.currentTimeMillis();  
        date=new java.sql.Date(millis); 		
		shopOwnerList.display();
		Shop shop=null;

		System.out.printf("\n\nPlease enter the shop ID that you entered:");
		Id = scanner.nextLine();
		System.out.printf("Please enter your temperature            :");
		temperatureLine = scanner.nextLine();
		temperature=Float.parseFloat(temperatureLine);
		shop = shopOwnerList.searchShopById(Id);

		TrackingRecord newRecord = new TrackingRecord(this,temperature,date,shop);
		int size=trackingRecord.length;
		TrackingRecord[] newList= new TrackingRecord[size+1];
		for(int i=0;i<size;i++)
		{
			newList[i]=trackingRecord[i];
		}
		newList[size]=newRecord;
		trackingRecord=newList;
		shop.addTrackingRecord(newRecord);
	}
}