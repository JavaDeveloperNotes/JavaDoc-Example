package my.zhamri.myexample;

/**
 * This class is for manipulating strings
 *
 * @author Zhamri Che Ani
 */
public class MySimpleString {

    /**
     * This method is for counting the length of your name and your home address.
     *
     * @param name Your full name which including the first name and last name.
     * @param address Your home address.
     * @return The total length of the name and address.
     */
    public int getLength(String name, String address){
        int mylength = name.length() + address.length();
        return mylength;
    }

    /**
     * This method is for displaying a string.
     *
     * @param str Either your name or your address.
     */
    public void displayString(String str){
        System.out.println("The string is " + str);
    }
}
