public class Account {
    private String accountNumber;
    private int accountBalance;
    private  String name;
    private String email;
    private int phoneNumber;

    //getters
    public String getAccountNumber(){
        return accountNumber;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public int getAccountBalance(){
        return accountBalance;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    //setters
    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAccountBalance(int accountBalance){
        this.accountBalance = accountBalance;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void deposite(int amount){
        accountBalance +=amount;
        System.out.println(accountBalance);
    }
    public void withdraw(int amount){
        if(accountBalance-amount<0){
            System.out.println("insufficient funds");
        }
        else{
            accountBalance -=amount;
            System.out.println(accountBalance);
        }
    }
    
}
