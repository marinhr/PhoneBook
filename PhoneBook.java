/**
 * Class that holds the contact information
 * @author Marin Hristov
 */

public class PhoneBook
{
    private String name;
    private String phoneNumber;

    public PhoneBook(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString()
        {
        return "\nPhoneBook{" + "name='" + name + '\'' + ", phoneNumber='" + phoneNumber + '\'' + '}';
        }

    public String getPhoneNumber()
        {
        return phoneNumber;
        }
    // helping method for one of the searches
    public boolean equals(Object obj) {
    if (obj == null) return false;
    if (obj == this) return true;
    if (!(obj instanceof PhoneBook)) return false;
    PhoneBook phoneBook = (PhoneBook) obj;
    return phoneBook.getPhoneNumber() == this.getPhoneNumber();
    }
}
