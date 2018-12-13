public class MassOfDinosaur {
    public static void PrintResult(double mass, String msg) {
        System.out.print("*******" + msg + "*******\n");
        System.out.print("Mass of dinosaur = " + mass
                + " kg = " + KilogramsToMilligrammes(mass)
                + " mg = " + KilogramsToGrammes(mass)
                + " g = " + KilogramsToTons(mass) + " t.\n");
    }

    public static double KilogramsToMilligrammes(double mass) {
        return mass*10*10*10*10*10*10;
    }
    public static double KilogramsToGrammes(double mass) {
        return mass*10*10*10;
    }
    public static double KilogramsToTons(double mass) {
        return mass/(10*10*10);
    }
}
