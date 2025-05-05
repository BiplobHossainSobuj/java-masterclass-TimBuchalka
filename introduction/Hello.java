public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        boolean isAlien = true;
        if (isAlien) {
            System.out.println("It's alien");
        }
        int toopScore = 100;
        if (toopScore != 100) {
            System.err.println("High scorer");
        }

        int age = 10;
        // ternary-> condition ? return value if true : return value if false
        String ageTxt = age==20 ? "over eighteen" : "still a kid";
        System.err.println(ageTxt);

        // operator precedence : https://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html
        double first = 20.00d;
        double second = 80.00d;
        double total = first + second * 100.00d;
        System.out.println(total);
        double remainder = total % 40.00d;
        System.out.println("reaminder: " + remainder);
        boolean isRemainder = remainder == 0? true : false;
        if (!isRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
