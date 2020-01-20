/**
 * Main class
 * @author Marin Hristov
 */
public class Main
{
    public static void main(String[] args)
        {
        System.out.println("Welcome to the main menu!\n" +
                "Click 1 to show all phone numbers.\n" +
                "Click 2 to add new number.\n" +
                "Click 3 to delete a number\n" +
                "Click 4 to search by phone number");
            Operations op = new Operations();
            op.savedPhoneNumbers();
        Menu m = new Menu();
        m.showOptions();
        }
}