import java.util.Scanner;

/**
 * Class that holds only the Menu
 * @author Marin Hristov
 */

public class Menu
{
        public Menu(){}

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        public void showOptions()
            {
            Operations op = new Operations();
            op.savedPhoneNumbers();
            switch (choice)
                {
                case 1:
                    System.out.println(op.listOfPeople);
                    break;
                case 2:
                    op.addNewNumber();
                    System.out.println(op.listOfPeople);
                    break;
            case 3:
                op.deleteNumber();
                System.out.println(op.listOfPeople);
                break;
            case 4:
                System.out.println(op.findObjectByPhoneNumber());
                break;

                default:
                    System.out.println("Invalid choice");
                }
            }
    }