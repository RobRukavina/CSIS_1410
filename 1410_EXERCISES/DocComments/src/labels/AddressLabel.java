package labels;


/**
 * Represents an address label that includes firstName and lastName
 * of the addresse and an address.
 * 
 * @author Rob R
 * 
 */
public class AddressLabel {
    private String firstName;
    private String lastName;
    private Address address;

    /**
     * Constructor of class AddressLabel
     * 
     * @param firstName first name of addresse
     * @param lastName  last name of addresse
     * @param address   US Address
     */
    public AddressLabel(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    /**
     * Prints an address label in the following format:</br>
     * {firstName} {lastName}</br>
     * {address}</br>
     * {city}, {state} {zip}</br>
     */
    public void printLabel(){
        System.out.println(this.firstName + " " + this.lastName);
        System.out.println(this.address.getStreet());
        System.out.println(this.address.getCity() + ", " + this.address.getState() + " " + this.address.getZip());
    }

    /**
     * (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "AddressLabel [firstName=" + this.firstName + ", lastName=" + this.lastName + ", address=" + this.address + "]";
    }

}
