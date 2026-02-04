public class ClassAverage {
    public static double calculateClassAverage(double score1, double score2) {
        return (score1 + score2) / 2;
    }

    public static double calculateClassAverage(double score1, double score2, double score3) {
        return (score1 + score2 + score3) / 3;
    }

    public static double calculateClassAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static void main(String[] args) {
        System.out.println(calculateClassAverage(70, 80));
        System.out.println(calculateClassAverage(70, 80, 90));

        double[] classScores = {65, 75, 85, 95};
        System.out.println(calculateClassAverage(classScores));
    }
    
}
