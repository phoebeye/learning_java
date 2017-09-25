public class VIPCustomer {
    private String name;

    private int creditLimit;

    private String email;

    public VIPCustomer() {
        this("Phoebe", 10000, "firstCon@gmail.com");

    }

    public VIPCustomer(String name, int creditLimit) {

        this(name, creditLimit, "second@gmai.com");
    }

    public VIPCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
