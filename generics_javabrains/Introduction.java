import java.util.ArrayList;
import java.util.Date;

public class Introduction {

    public static void main(String[] args) {
        ArrayList names = new ArrayList();//any object or typed data we can add on the list
        //names.add(new Date())
        names.add("name 1");
        names.add("name 2");
        //names.add(1);
        System.out.println(names);

        //catch the first element of the arraylist
        //String name = names.get(0);//not working
        String name1 = (String) names.get(0);//everytime we should use typecasting bcz we don't know the returning type
        System.out.println(name1);


        //using generics -> expected the particular typed to deal with
        //I can ensure the type of passing data
        ArrayList<String> friends = new ArrayList<String>();//only String type data can be passed
        friends.add("biplob");
        friends.add("sobuj");
        //friends.add(new Date());//producing error bcz only String can be passed
        System.out.println(friends);
        String friend = friends.get(0);//don't have to use type casting compiler already know the typed

        //another example
        ArrayList<Date> dates = new ArrayList<Date>();
        dates.add(new Date());
        //dates.add("biplob hossain sobuj")// it will produce error bcz compiler already know the typed.it expected only date typed data to deal with
        System.out.println(dates);

        //ArrayList<int> numbers = new ArrayList<int>();//it will not work bcz it must be java typed not primitive
        ArrayList<Integer> numbers = new ArrayList<Integer>();//it will work bcz Integer is java typed not primitive
        numbers.add(1);
        System.out.println(numbers);
    }
}
