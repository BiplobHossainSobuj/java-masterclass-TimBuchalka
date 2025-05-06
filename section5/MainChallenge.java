package section5;

public class MainChallenge {
    public static void main(String[] args) {
        // boolean gameOver = true;
        // int score = 800;
        // int levelCompleted = 5;
        // int bonus = 100;
        calculateScore(true, 800, 5, 100);
        // int finalScore = score;
        // if (gameOver) {
        //     finalScore += (bonus*levelCompleted);
        //     System.out.println(finalScore);
        // }
    }

    public static void calculateScore(boolean gameOver,int score,int levelCompleted,int bonus){
        int finalScore = score;
        if (gameOver) {
            finalScore += (bonus*levelCompleted);
            System.err.println(finalScore);
        }
    }

}
