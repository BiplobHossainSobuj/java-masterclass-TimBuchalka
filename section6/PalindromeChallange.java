package section6;

public class PalindromeChallange {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
    public static boolean isPalindrome(int n){
        int reverse = 0;
        int temp = n;
        while(n!=0){
            reverse *= 10; 
            reverse += n%10;
            n=n/10;
        }
        return temp==reverse?true:false;
    }
}
