public class PerformancePredictor {

    public static String predict(Employee e) {
        double score = e.calculateFinalScore();

        if (score >= 80) {
            return "Excellent";
        } else if (score >= 60) {
            return "Good";
        } else {
            return "Needs Improvement";
        }
    }
}
