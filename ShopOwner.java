import java.util.Scanner;


class ShopOwner extends Person
{
	private Shop shop;
	Scanner scanner=new Scanner(System.in);
	ShopOwner(String name, String contactNum, String password)
	{
		super(name,contactNum,password);
		shop=null;
	}


	public void setShop(Shop shop)
	{
		this.shop = shop;
	}
	public Shop getShop()
	{
		return shop;
	}
	public void addShop()
	{
		String ID;
		String name;
		String address;
		String contactNum;
		System.out.printf("Shop ID         :");
		ID=scanner.nextLine();
		System.out.printf("Shop name       :");
		name=scanner.nextLine();
		System.out.printf("Shop address    :");
		address=scanner.nextLine();
		System.out.printf("Shop contact num:");
		contactNum=scanner.nextLine();
		Shop newShop = new Shop(ID,name,address,contactNum);
		setShop(newShop);
	}
	public void display()
    {
		System.out.printf("Name           : " + getName()+"\n");
		System.out.printf("Contact Number : " + getContactNum()+"\n"); 
    }
}