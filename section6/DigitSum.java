package section6;

public class DigitSum {
    public static void main(String[] args){
        System.out.println("sum of the digits: "+sumDigit(1234));
    }

    //iterective
    public static int sumDigit(int n){
        int sum = 0;
        // for(int i=n;i!=0;i=i/10){
        //     sum += n%10;
        //     n = n/10;
        // }
        // while(n!=0){
        //     sum += n%10;
        //     n = n/10;
        // }
        // return sum;

        //recursive
        if (n!=0) {
            sum+=n%10;
            n=n/10;
            return sum + sumDigit(n);
        }
        return 0;
    }
}
