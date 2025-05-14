package section6;

public class SumChallange {
    public static void main(String[] args) {
        sumFirstAndLastDigit(121);//2
        sumFirstAndLastDigit(-121);//-1
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0)return -1;
        int last = number%10;
        int first = 0;
        while(number!=0){
            first = number;
            number/=10;
        }
        return first+last;
    }
}
