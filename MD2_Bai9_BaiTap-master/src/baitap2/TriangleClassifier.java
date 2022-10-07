package baitap2;

public class TriangleClassifier {
    public static String getSideTriangle(double side1, double side2, double side3) {
        if (side1 + side2 < side3+0.0000001 || side1 + side3 < side2+0.0000001 || side3 + side2 < side1+0.0000001) {
            return "Khong phai tam giac";
        }
        if (side1 == side2 && side2 == side3) {
            return "Tam giac deu";
        }
        if (Math.pow(side3, 2) == Math.pow(side1, 2) + Math.pow(side2, 2)
                || Math.pow(side1, 2) == Math.pow(side2, 2) + Math.pow(side3, 2)
                || Math.pow(side2, 2) == Math.pow(side1, 2) + Math.pow(side3, 2)) {
            return "Tam giac vuong";
        }
        if (side1 == side3 || side1 == side2 || side2 == side3) {
            return "Tam giac can";
        }
        else {
            return "Tam giac thuong";
        }
    }
}

