package section6;

public class Switch1 {
    public static void main(String[] args){
        int switchValue = 10;

        switch(switchValue){
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3,4,5 -> {
                System.out.println("3,4,5");
            }
            default -> System.out.println("default");
        }
        System.out.println(getQuater("january"));
    }

    public static String getQuater(String month){
        return switch(month){
            case "january","february","march" -> {yield "1st";}//it returns 1st 
            case "april","may","june" -> "2nd";
            case "july","august","sept" -> "3rd";
            default -> {
                String badResponse = month + "bad";
                yield badResponse;//return badResponse will produce an error here 
            }
        };
    }
}
