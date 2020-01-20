import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class that holds all the features
 * @author Marin Hristov
 */
public class Operations
{
    ArrayList<PhoneBook> listOfPeople = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // Already saved contacts
    public void savedPhoneNumbers()
        {
        PhoneBook phone1 = new PhoneBook("Marin", "0895792357"); listOfPeople.add(phone1);
        PhoneBook phone2 = new PhoneBook("Kostadin", "0884188288"); listOfPeople.add(phone2);
        PhoneBook phone3 = new PhoneBook("Veselin", "0896210811"); listOfPeople.add(phone3);
        }
    //Add new contact
    public void addNewNumber()
        {
        PhoneBook phoneBook = new PhoneBook(scanner.nextLine(), scanner.nextLine()); listOfPeople.add(phoneBook);
        }
    //Delete contact
    public void deleteNumber()
        {
        for (int j = 0; j < listOfPeople.size(); j++)
            {
            PhoneBook phoneBook = listOfPeople.get(j); if (phoneBook.getPhoneNumber().equals(scanner.nextLine()))
                {
                listOfPeople.remove(j); break;
                }
            }
        }
    //Look-up
    public PhoneBook findObjectByPhoneNumber()
        {
        for (PhoneBook object : listOfPeople)
            {
            if (object.getPhoneNumber().equals(scanner.nextLine()))
                {
                return object;
                }
            } return null;
        }
}
