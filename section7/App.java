public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Car car = new Car();
        car.describe();
        System.out.println("bank account");
        Account account = new Account();
        account.setAccountBalance(10);
        account.deposite(500);
        account.withdraw(200);

        //constructor
        ConstructorExample exeample0 = new ConstructorExample();
        ConstructorExample example1 = new ConstructorExample("biplob", 12345, 100.00);
        example1.describe();
    }
}
