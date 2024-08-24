package labels;
public class LabelApp {
    public static void main(String[] args){
        Address add1 = new Address("12343 E. Jungle Dr.", "Salt Lake City", State.UT, 84092);
        System.out.println("address1: " + add1);
        System.out.println();
        
        AddressLabel addLabel1 = new AddressLabel("Rob", "Rukavina", add1);
        addLabel1.printLabel();
    }
}
