public class AverageArithmeticalAndGeometrical {
    public static void PrintResult(int number, String msg) {
        System.out.print("*******" + msg + "*******\n");
        System.out.print("Average arithmetical = " + getAverageArithmetical(number) + ". Average geometrical = " + getAverageGeometrical(number) + "\n");
    }

    public static double getAverageArithmetical(int number) {
        return ((number % 10) + ((number /= 10) % 10) + ((number /= 10) % 10)
                + ((number /= 10) % 10) + ((number /= 10) % 10) + ((number /= 10) % 10))/6.;
    }

    public static double getAverageGeometrical(int number) {
        return Math.pow((number % 10) * ((number /= 10) % 10) * ((number /= 10) % 10)
                * ((number /= 10) % 10) * ((number /= 10) % 10) * ((number /= 10) % 10), 1./6);
    }
}
