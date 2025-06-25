package generics_javabrains;

import java.util.Arrays;
import java.util.List;

public class Autoboxing {
    public static void main(String[] args) {
        int i = 10;//it's primitive type
        Integer x; //it's an object not primitive
        x = i;// it should not be worked but works bcz of autoboxing
        //the procedure of assigning the primitives typed data to the corresponding wrapper class is called autoboxing
        Integer n = i;//it creates in Integer instance and assign 10 to n. converting primitives to an object.
        System.out.println(n instanceof Object);//true

        //unboxing
        Integer a = new Integer(100);
        System.out.println(a instanceof Object);//true bcz it's object
        int b = a;//this is unboxing vice versa of autoboxing ->an instance of a is assign to b which is primitive typed

        //list of numbers
        //Arrays.asList(10,20,30);

        //List<int> numbers = Arrays.asList(10,20,30);//will not work bcz typed should be java typed not primitives
        List<Integer> numbers = Arrays.asList(10,20,30);//autoboxing & it works
        int first = numbers.get(0);//unboxing 

    }
}

