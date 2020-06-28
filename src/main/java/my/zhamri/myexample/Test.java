package my.zhamri.myexample;

public class Test {

    public static void main(String[] args) {

        String name = "Zhamri Che Ani";
        String address = "Kuala Lumpur, Malaysia";

        MySimpleString mySimpleString = new MySimpleString();
        mySimpleString.displayString(name);
        mySimpleString.displayString(address);
        System.out.println("Total length: " + mySimpleString.getLength(name,address));

    }
}
