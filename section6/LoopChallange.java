package section6;

public class LoopChallange {
    int sum = 0;
        int counter = 0;
        for(int i=1;i<=1000;i++){
            if(i%3==0 && i%5==0){
                counter++;
                sum += i;
                System.out.println("number is: "+i);
            }
            if(counter==5){
                break;
            }
        }
        System.out.println("sum: "+sum);
}
