package section6;

public class ParsingValue {
    public static void main(String[] args){
        int currentYear = 2025;
        String dateOfBirth = new String("1999");
        //parsing in java
        int dob = Integer.parseInt(dateOfBirth);//parseInt is a static method which can be called without instantiate
        // Double.parseDouble(doubleValue);
        System.out.println("age= "+(currentYear-dob));
        System.out.println(getUserInputFromConsole(currentYear));
    }
    public static int getUserInputFromConsole(int year){
        String yr = System.console().readLine("your date of birth");
        int age = Integer.parseInt(yr);
        return 2025 - age;
    }
}

//exeption handling in java
// try{
//     //code
// }catch(exceptionName variableName){
//     //code
// }