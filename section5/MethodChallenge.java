
public class MethodChallenge {
    public static void main(String[] args){
        int highscore = calculateScore(500);
        displayHighScorer("Biplob", highscore);
    }
    
    public static void displayHighScorer(String name, int position){
        System.out.println(name+" managed to get position: "+ position);
    }
    public static int calculateScore(int score){
        int position = 3;
        if (score>=1000) {
            position=1;
        }else if (score>=500) {
            position=2;
        }
        return position;
    }
}
