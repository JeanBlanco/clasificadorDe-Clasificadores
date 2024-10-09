package edu.unac;

public class GradeClassifier {
    public static String classifyGrade(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be between 0 and 100");
        }

        if (score > 89) {
            return "A";
        } else if (score > 79) {
            return "B";
        } else if (score > 69) {
            return "C";
        } else if (score > 59) {
            return "D";
        } else {
            return "F";
        }
    }
}
