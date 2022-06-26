import java.util.Scanner;

public class Officer extends Person
{
    Officer(String name, String contactNum, String password)
    {
        super(name,contactNum,password);
    }
    Scanner scanner=new Scanner(System.in);
    public void investigate(CitizenList citizenList,ShopOwnerList shopList)
    {
        TrackingRecord[] recordList;
        System.out.printf("Enter the name of patient with COVID-19 : ");
        String name;
        name=scanner.nextLine();
        citizenList.searchCitizen(name).display();
        System.out.printf("\nEnter the shop ID to investigate : ");
        name=scanner.nextLine();
        recordList=shopList.searchShopById(name).getTrackingRecord();
        for(int i=0;i<recordList.length;i++)
        {
            System.out.printf("\n===Record %d===\n",(i+1));
            recordList[i].officerDisplay();
        }
    }
    public void display()
    {
		System.out.printf("Name           : " + getName()+"\n");
		System.out.printf("Contact Number : " + getContactNum()+"\n");
    }
}