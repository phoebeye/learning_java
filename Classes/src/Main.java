public class Main {

    public static void main (String[] args) {
        Car porsche = new Car();
        Car toyota = new Car();
//        BankAccount bankAct = new BankAccount("23452345", "Phoebe", "as@gmail.com");
//        bankAct.deposit(3000.0);
//        bankAct.withdraw(500);
        VIPCustomer vip = new VIPCustomer("asdf", 9999);
        System.out.println(vip.getName());
        System.out.println(vip.getCreditLimit());

    }
}
