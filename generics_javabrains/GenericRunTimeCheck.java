package generics_javabrains;

import java.util.ArrayList;
import java.util.List;

public class GenericRunTimeCheck {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        addToNames(names,"name 1");
//        addToNames(names,"name 2");
//        //addToNames(names,1);//arise error bcz i put integer rather than string
//        //incorrectAddToNames(names,10);
//        //List arr = names;//generic type is assigning to non generics typed and works
//        incorrectAddToNames(names,100);
//        System.out.println(names);
//        //generics are compiled time
//        String thirdElement = names.get(2);//makes error
//        System.out.println(thirdElement);

        //arrays are runed time
        String[] nameArr = new String[5];
        addToNamesArr(nameArr,"biplob");
        incorrectAddToNamesArr(nameArr,100);


    }

    private static void addToNamesArr(String[] nameArr, String str) {
        nameArr[0] = str;
    }
    private static void incorrectAddToNamesArr(Object[] nameArr, Integer i) {
        nameArr[0] = i;//run time error
    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }
    private static void incorrectAddToNames(List list, Integer i) {
        list.add(i);
    }
}

