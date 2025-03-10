package ch6.changefunctiondeclation;

public class RefactoringMigrationProcess {
    public double circum(double radius) {
        return circumference(radius);
    }

    private static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
