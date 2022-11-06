import java.util.Scanner;

public class Welcome
{
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the Wokolad Store!");
        System.out.println("You have 7 options");
        System.out.println(" 1 - Sale" +
                "\n 2 - Add chocolate" +
                "\n 3 - Change provider's info" +
                "\n 4 - All chocolate information" +
                "\n 5 - Display income" +
                "\n 6 - Help about the program" +
                "\n 7 - Quit");
        System.out.println("Type a number:");
        int option = inp.nextInt();
        inp.nextLine();

        switch(option)
        {
            case 1:
                System.out.println("Type chocolate name:");
                String sale_name = inp.nextLine();
                System.out.println("Type number of chocolate:");
                int sale_num = inp.nextInt();
                //Function that make number of selected chocolate decreases
                break;
            case 2:
                System.out.println("Type chocolate name:");
                String add_name = inp.nextLine();
                System.out.println("Type number of chocolate: ");
                int add_num = inp.nextInt();
                inp.nextLine();
                //Function that make addition for the selected chocolate
                break;
            case 3:
                System.out.println("Type provider's name:");
                String provider_name = inp.nextLine();
                System.out.println("Enter new name: ");
                String provider_new_name = inp.nextLine();
                System.out.println("Enter new address: ");
                String provider_address = inp.nextLine();
                System.out.println("Enter new location: ");
                String provider_city = inp.nextLine();
                System.out.println("Enter new phonec: ");
                String provider_phone = inp.nextLine();
                inp.nextLine();
                //Function that changes provider's information
                break;
            case 4:
                System.out.println("Enter chocolate name: ");
                String info_name = inp.nextLine();
                //Function that display info of selected chocolate
                break;
            case 5:
                System.out.println("Посмотреть доход для продажи для определенной даты:");
                //Function that displays income for a particular date
                System.out.println("Посмотреть суммарную продажу для определенного шоколада:");
                //Function that displays number of sales for particular chocolate
                System.out.println("Посмотреть суммарную продажу для всех шоколадов");
                //Function that displays all sales number for all chocolates
                break;
            case 6:
                System.out.println("This application can register individual sales transactions, update the quantity of each chocolate sold, replenish stocks of chocolates, change supplier information for a specific chocolate and display all information about chocolate");
                break;
            case 7:
                //Quits program
                break;

        }
    }
}
