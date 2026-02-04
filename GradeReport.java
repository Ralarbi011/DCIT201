public class GradeReport {
    public void executeGradeReport(double score) {
        if (!validateScore(score)) {
            System.out.println("Invalid Score");
            return;
        }

        char letterGrade = calculateLetterGrade(score);
        displayPerformanceMessage(letterGrade);
    }

    private boolean validateScore(double score) {
        return score >= 0 && score <= 100;
    }

    private char calculateLetterGrade(double score) {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    private void displayPerformanceMessage(char grade) {
        switch (grade) {
            case 'A' -> System.out.println("Excellent performance!");
            case 'B' -> System.out.println("Very good performance.");
            case 'C' -> System.out.println("Good performance.");
            case 'D' -> System.out.println("Needs improvement.");
            case 'F' -> System.out.println("Failed. Please try again.");
            default -> System.out.println("Unknown grade.");
        }
    }

    public static void main(String[] args) {
        GradeReport reporter = new GradeReport();

        System.out.println("Testing with score 95:");
        reporter.executeGradeReport(95);

        System.out.println("\nTesting with score 82:");
        reporter.executeGradeReport(82);

        System.out.println("\nTesting with score 70:");
        reporter.executeGradeReport(70);

        System.out.println("\nTesting with score 65:");
        reporter.executeGradeReport(65);

        System.out.println("\nTesting with score 45:");
        reporter.executeGradeReport(45);

        System.out.println("\nTesting with invalid score 105:");
        reporter.executeGradeReport(105);

        System.out.println("\nTesting with invalid score -5:");
        reporter.executeGradeReport(-5);
    }
}
