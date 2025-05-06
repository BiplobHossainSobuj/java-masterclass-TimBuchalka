public class MethodOverloading {
    public static void main(String[] args){
        calculateScore("biplob",50);
        calculateScore(100);
        double result = convertToCentimeters(5, 8);
        System.out.println(result);
        System.out.println(getDurationString(65,45));
    }
    public static int calculateScore(String player,int score){
        System.out.println(player +" scored "+score);
        return score *1000;
    }
    public static int calculateScore(int score){
        System.out.println("player anonymous" +" scored "+score);
        return score *1000;
    }

    public static double convertToCentimeters(int inches){
        double centimeters = inches * 2.54d;
        return centimeters;
    }
    public static double convertToCentimeters(int feet,int inches){
        int totalInches  = (feet * 12) + inches;
        return convertToCentimeters(totalInches);
    }

    public static String getDurationString(int seconds){
        int sec = seconds % 60;
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int remainingMin = minutes % 60;
        return String.format("%dh %dm %ds",hours,remainingMin,sec);
    }
    public static String getDurationString(int mins,int seconds){
        int totalSeconds = (mins * 60) + seconds;
        return getDurationString(totalSeconds);
        // int minutes = seconds / 60;
        // int hours = minutes / 60;
        // return String.format("%dh %dm %ds",hours,minutes,seconds);
    }
}
