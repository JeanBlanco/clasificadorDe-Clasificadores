package edu.unac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeClassifierTest {

    @Test
    void testGradeA() {
        assertEquals("A", GradeClassifier.classifyGrade(95));
        assertEquals("A", GradeClassifier.classifyGrade(90));
    }

    @Test
    void testGradeB() {
        assertEquals("B", GradeClassifier.classifyGrade(85));
        assertEquals("B", GradeClassifier.classifyGrade(80));
    }

    @Test
    void testGradeC() {
        assertEquals("C", GradeClassifier.classifyGrade(75));
        assertEquals("C", GradeClassifier.classifyGrade(70));
    }

    @Test
    void testGradeD() {
        assertEquals("D", GradeClassifier.classifyGrade(65));
        assertEquals("D", GradeClassifier.classifyGrade(60));
    }

    @Test
    void testGradeF() {
        assertEquals("F", GradeClassifier.classifyGrade(59));
        assertEquals("F", GradeClassifier.classifyGrade(0));
        assertEquals("F", GradeClassifier.classifyGrade(50));
    }

    @Test
    void testOutOfRangeLow() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(-5);
        });
        assertEquals("Score must be between 0 and 100", exception.getMessage());
    }

    @Test
    void testOutOfRangeHigh() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GradeClassifier.classifyGrade(105);
        });
        assertEquals("Score must be between 0 and 100", exception.getMessage());
    }

    @Test
    void testEdgeCases() {
        assertEquals("F", GradeClassifier.classifyGrade(59));
        assertEquals("D", GradeClassifier.classifyGrade(60));
        assertEquals("C", GradeClassifier.classifyGrade(70));
        assertEquals("B", GradeClassifier.classifyGrade(80));
        assertEquals("A", GradeClassifier.classifyGrade(90));
    }
}
