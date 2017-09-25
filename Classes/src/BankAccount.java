public class BankAccount {

    private String number;

    private double balance;

    private String phone;

    private String customerName;

    private String email;

    public BankAccount() {
        this("12341234", 2.50, "Default phone", "Default name", "default email");
        System.out.println(this.getBalance() + " in default account");
    }

    public BankAccount(String number, double balance, String phone, String customerName, String email) {
        this.number = number;
        this.balance = balance;
        this.phone = phone;
        this.customerName = customerName;
        this.email = email;
    }

    public BankAccount(String phone, String customerName, String email) {
        this("1234567", 0.99, phone, customerName, email);
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void deposit(double fund) {
        this.balance += fund;
    }

    public void withdraw(double fund) {
        if(this.balance >= fund) {
            this.balance -= fund;
        }
    }
}
