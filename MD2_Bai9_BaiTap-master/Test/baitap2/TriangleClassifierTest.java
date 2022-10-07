package baitap2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangleClassifierTest {

    @Test
    @DisplayName("Test side 1 = 2 ; side 2 = 2 ; side 3 = 2")
    public void triangleTest1() {
        double side1 = 2;
        double side2 = 2;
        double side3 = 2;
        String expected = "Tam giac deu";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test side 1 = 3 ; side 2 = 2 ; side 3 = 2")
    public void triangleTest2() {
        double side1 = 3;
        double side2 = 2;
        double side3 = 2;
        String expected = "Tam giac can";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test side 1 = 3 ; side 2 = 4 ; side 3 = 5")
    public void triangleTest3() {
        double side1 = 3;
        double side2 = 4;
        double side3 = 5;
        String expected = "Tam giac vuong";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test side 1 = 0 ; side 2 = 1 ; side 3 = 1")
    public void triangleTest4() {
        double side1 = 0;
        double side2 = 1;
        double side3 = 1;
        String expected = "Khong phai tam giac";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test side 1 = 5 ; side 2 = 6 ; side 3 = 7")
    public void triangleTest5() {
        double side1 = 5;
        double side2 = 6;
        double side3 = 7;
        String expected = "Tam giac thuong";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test side 1 = -6 ; side 2 = 6 ; side 3 = 7")
    public void triangleTest6() {
        double side1 = -6;
        double side2 = 6;
        double side3 = 7;
        String expected = "Khong phai tam giac";

        String result = TriangleClassifier.getSideTriangle(side1,side2,side3);
        assertEquals(expected, result);
    }
}