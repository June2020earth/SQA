import java.util.ArrayList;
import java.util.Scanner;

public class ShopOwnerList
{
    private ShopOwner[] shopOwnerList = new ShopOwner [0];
    Scanner scanner = new Scanner(System.in);


    public Shop searchShopById(String Id)
    {
        for(int i=0;i<shopOwnerList.length;i++)
        {
            if(shopOwnerList[i].getShop().getID().equals(Id))
            return shopOwnerList[i].getShop();
        }
        return null;
    }
    public Shop searchShopByName(String name)
    {
        for(int i=0;i<shopOwnerList.length;i++)
        {
            if(shopOwnerList[i].getShop().getName().equals(name));
            return shopOwnerList[i].getShop();
        }
        return null;
    }
    public void addShopOwner()
    {
        ShopOwner shopOwner=new ShopOwner("Ali","011-1111111","0");
        shopOwner.addShop();
        int size = shopOwnerList.length;
        ShopOwner[] newList = new ShopOwner[size+1];
        for(int i=0;i<size;i++)
        {
            newList[i]=shopOwnerList[i];
        }
        newList[size]=shopOwner;
        shopOwnerList=newList;
    }
    public void addShopOwner(ShopOwner shopOwner)
    {
        int size = shopOwnerList.length;
        ShopOwner[] newList = new ShopOwner[size+1];
        for(int i=0;i<size;i++)
        {
            newList[i]=shopOwnerList[i];
        }
        newList[size]=shopOwner;
        shopOwnerList=newList;
    }
    public void updateShop()
    {
        display();
        System.out.printf("Please enter the shop ID you want to update:");
        String ID;
        String name;
        String address;
        String num;
        ID = scanner.nextLine();
        System.out.printf("Please enter the new shop name    :");
        name = scanner.nextLine();
        System.out.printf("Please enter the new shop address :");
        address = scanner.nextLine();
        System.out.printf("Please enter the new shop number  :");
        num = scanner.nextLine();
        Shop shop = searchShopById(ID);
        shop.setName(name);
        shop.setAddress(address);
        shop.setContactNum(num);
    }
    public ShopOwner[] getShopOwnerList()
    {
        return shopOwnerList;
    }
    public void display()
	{
		System.out.println("---List of Shop---");
        for(int i=0;i<shopOwnerList.length;i++)
        {
            System.out.printf("\nShop "+(i+1)+"\n");
            shopOwnerList[i].getShop().display();
        }
	}


}