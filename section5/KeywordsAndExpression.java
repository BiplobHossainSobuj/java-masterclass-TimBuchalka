package section5;

public class KeywordsAndExpression{
    public static void main(String [] args){
        int n = 100; //n=100 is an expression 
        if (n<25 && n>1000) {
            n = n - 1000; //n<25, n>100, n<25 && n>1000, n-100, n = n - 1000 all are expression
        }
        // System.out.println("keywords and expression");
        // for(int i=0;i<args.length;i++){
        //     System.out.println(args[i]);
        // }
        // System.out.println("file:"+args[0]);

        //statements
        int myVariable = 100;
        myVariable++;
        myVariable--;

        //codeblocks
        if (myVariable==100) {
            System.out.println("number is 100");
        }else{
            System.out.println("Got here");
        }
    }
}