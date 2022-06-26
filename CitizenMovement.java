import java.util.Scanner;
import java.util.*;

public class CitizenMovement {
    static void menuRole()
    {
        System.out.printf("Choose your role:\n");
        System.out.printf("1. Officer\n");
        System.out.printf("2. Citizen\n");
        System.out.printf("3. Shop Owner\n");

    }
    static void menuOfficer()
    {
          
    }
    static void menuCitizen()
    {
        System.out.printf("Welcome to the system\n");
        System.out.printf("1. Log in\n"); 
        System.out.printf("2. Sign up\n"); 
    }
    
    static void menuShopOwner()
    {
        System.out.printf("Welcome to the system\n");
        System.out.printf("1. Register New Shop\n");
        System.out.printf("2. Update Shop Information\n");
    }
    static void menuExit()
    {
        System.out.printf("\n\n---End of program---\n");
        System.out.printf("1. Close the program\n");
        System.out.printf("2. Continue as another role\n");
    }



public static void main(String [] args)
    {
        //variable
        int option;
        int exitOption;
        boolean loop=true;
        //List variable
        CitizenList citizenList = new CitizenList();
        ShopOwnerList shopOwnerList = new ShopOwnerList();
        Officer officer = new Officer("Inspector Mohammed","011-2665 2440","0");

        //Shop data
        try
        {

        // "Hong's Convenience Store"};
        Shop shop1 = new Shop("1","Ali's Discount Store","Jalan UTM 5","07-5578949");
        Shop shop2 = new Shop("2","Amin's Department Store","Jalan UTM 10","07-5584135");
        Shop shop3 = new Shop("3","Min's Specialty Store","Jalan UTM 15","07-5589465");
        ShopOwner shopOwner1 = new ShopOwner("Nurul Ain","011-2345678","0");
        shopOwner1.setShop(shop1);
        ShopOwner shopOwner2 = new ShopOwner("Aiman Mustafa","011-7348596","0");
        shopOwner2.setShop(shop2);
        ShopOwner shopOwner3 = new ShopOwner("Asyraf Sophan","011-8465995","0");
        shopOwner3.setShop(shop3);
        shopOwnerList.addShopOwner(shopOwner1);
        shopOwnerList.addShopOwner(shopOwner2);
        shopOwnerList.addShopOwner(shopOwner3);


        //User data
        Citizen citizen1 = new Citizen("Tai Wen Jun","011-2665 2440","0");
        Citizen citizen2 = new Citizen("William Goy","011-2665 2665","0");
        Citizen citizen3 = new Citizen("Satish","011-2440 2440","0");
        citizenList.addCitizen(citizen1);
        citizenList.addCitizen(citizen2);
        citizenList.addCitizen(citizen3);

        Scanner scanner = new Scanner(System.in);
        while(loop)
        {
            //Display menu  
            menuRole();
            System.out.printf("\nEnter your choice: ");
            String optionLine;
            optionLine=scanner.nextLine();
            option=Integer.parseInt(optionLine);
            switch(option)
            {
                //For the officer
                case 1:
                //Search patient
                //get Track Record
                //Track Record will show shop
                //Search shop
                //Shop will directly print customer information();

                //display List of shop
                officer.investigate(citizenList, shopOwnerList);
                break;

                //For the citizen
                case 2:
                boolean registerSuccess=false;
                Citizen citizen=null;
                while(!registerSuccess)
                {
                    menuCitizen();
                    System.out.printf("\nEnter your choice: ");
                    String registerOptionLine;
                    int registerOption;
                    registerOptionLine=scanner.nextLine();
                    registerOption=Integer.parseInt(registerOptionLine);
                    switch(registerOption)
                    {
                        //Log in
                        case 1:
                        //##Log in function here
                        //##Log in interface 
                        citizen=citizenList.Login();
                        if(citizen!=null)
                        {
                            registerSuccess=true;
                        }
                        if(registerSuccess)
                        {
                            System.out.printf("\n----Success Log In------\n");
                        }
                        break;
                        //Sign in 
                        case 2:
                        //##Sign in function here 
                        //Sign in interface
                        citizen=citizenList.SignUp();
                        if(citizen!=null)
                        {
                            registerSuccess=true;
                        }
                        //Do you confirm your information? (Y/N) :
                        default:
                        //Exception handling can be here
                    }
                    if(registerSuccess==false)
                    {
                        System.out.printf("Log in failed please try again");
                    }    
                //     String[] sick = new String[5];                  
                //     sick[0] = "Diabetes";
                //     sick[1] = "High blood pressure";
                //     sick[2] = "Cancer";
                //     sick[3] = "Chronic respiratory disease";
                //     sick[4] = "Covid-19";

                //     System.out.println("Please select any illness that you have been infected with.");
                //     System.out.println("1. " + sick[0]);
                //     System.out.println("2. " + sick[1]);
                //     System.out.println("3. " + sick[2]);
                //     System.out.println("4. " + sick[3]);
                //     System.out.println("4. " + sick[4]);   
                                      
                //     int opt=scanner.nextInt();

                //     Scanner in = new Scanner(System.in);

                //     System.out.println("Enter temperature in Fahrenheit");
                //     temperature = in.nextInt();

                //     temperature = ((temperature - 32)*5)/9;

                //     System.out.println("temperature in Celsius = " + temperature);
                    
                //     //Do you confirm your information? (Y/N) :
                //     default:
                //     //Exception handling can be here
                // }


                }
                //Start register store //Satish 
                //StoreList.display
                boolean userLoop=true;
                String choice;
                while(userLoop)
                {
                    citizen.addTrackingRecord(shopOwnerList);
                    System.out.printf("Do you want to enter another record?(Y/N) :");
                    choice=scanner.nextLine();
                    if(choice.toUpperCase().equals("Y"))
                    userLoop=true;
                    else 
                    userLoop=false;
                }
                break;


                
                //For the shopOwner
                case 3:
                menuShopOwner();
                System.out.printf("\nEnter your choice: ");
                String shopOptionLine;
                int shopOption;
                shopOptionLine=scanner.nextLine();
                shopOption=Integer.parseInt(shopOptionLine);
                switch(shopOption)
                {
                    case 1:
                    //##Register new store function here
                    //Shop ID:
                    //Shop name:
                    //Shop address:
                    //Shop contact Num:
                    shopOwnerList.addShopOwner();

                    break;
                    case 2:
                    //##Update store information here
                    //Enter your shop name:
                    //##start editing the information
                    //Enter shop new name:
                    //Enter shop new address:
                    //Enter shop contact Num;
                    shopOwnerList.updateShop();
                    break;
                    default:
                    //Exception flow 
                    break;
                }
                break;
                default:
                //exception handling here;
            }
            menuExit();
            System.out.printf("\nEnter your choice: ");
            String exitOptionLine;
            exitOptionLine=scanner.nextLine();
            exitOption=Integer.parseInt(exitOptionLine);
            switch(exitOption)
            {
                case 1:
                loop=false;
                break;
                case 2:
                loop=true;
                break;
                default:
                break;
            }
        }
        System.out.printf("Thank you for using the system");
    }
    catch(InputMismatchException ex)
    {
        System.out.printf("The inserted input is mismatch");
    }
    catch(ArithmeticException ex)
    {
        System.out.printf("Arithmetic error");
    }
    catch(NumberFormatException ex)
    {
        System.out.printf(ex.getMessage());
    }
    }

}
