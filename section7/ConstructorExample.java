public class ConstructorExample {
    String name;
    int phone;
    double balance;
    public ConstructorExample(){
        System.out.println("empty constructor");
    }
    public ConstructorExample(String name,int phone,double balance){
        this.name = name;
        this.balance = balance;
        this.phone = phone;
        System.out.println("not empty");
    }
    public void describe(){
        System.out.println(name+" " + phone +" "+ balance);
    }
}
