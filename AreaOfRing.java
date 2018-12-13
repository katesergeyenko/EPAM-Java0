public class AreaOfRing {
    public static void PrintResult(double outerRadius, double innerRadius, String msg) {
        System.out.print("*******" + msg + "*******\n");
        System.out.print("Area of ring = " + getArea(outerRadius, innerRadius) + "\n");
    }

    public static double getArea(double outerRadius, double innerRadius){
        return 3.141592653 * (outerRadius * outerRadius - innerRadius * innerRadius);
    }
}
