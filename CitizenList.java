import java.util.Scanner;


class CitizenList 
{
	private Citizen[] citizen = new Citizen[0];
	Scanner scanner = new Scanner(System.in);
	public Citizen Login()
	{
		String name;
		String pass;
		System.out.printf("Enter your name       :");
		name=scanner.nextLine();                        
		System.out.printf("Enter your password   :");
		pass=scanner.nextLine();
		for(int i=0;i<citizen.length;i++)
		{
			if(citizen[i].getName().equals(name))
			{
				if(citizen[i].getPassword().equals(pass))
				{
					return citizen[i];	
				}
				return null;
			}
		}
		return null;
	}
	public Citizen SignUp()
	{
		String name;
		String pass;
		String contactNum;

		System.out.printf("Enter your name       :");
		name=scanner.nextLine();
		System.out.printf("Enter your contact num:");
		contactNum=scanner.nextLine();
		System.out.printf("Enter your password   :");
		pass=scanner.nextLine();
		Citizen newPerson = new Citizen(name,contactNum,pass);
		addCitizen(newPerson);
		return newPerson;
	}
	public Citizen[] getCitizenList()
	{
		return citizen;
	}
	public Citizen searchCitizen(String name)
	{
		for(int i=0;i<citizen.length;i++)
		{
			if(citizen[i].getName().equals(name))
			{
				return citizen[i];
			}
		}
		return null;
	}
	public void addCitizen(Citizen person)
	{
		int size=citizen.length;
		Citizen[] newList = new Citizen[size+1];
		for(int i=0;i<size;i++)
		{
			newList[i]=citizen[i];
		}
		newList[size]=person;
		citizen=newList;
	}
	public void display()
	{
		for(int i=0;i<citizen.length;i++)
		{
			citizen[i].display();
		}
	}
}