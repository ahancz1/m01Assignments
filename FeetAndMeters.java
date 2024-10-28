public class FeetAndMeters  {

    /** Convert feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Convert meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
    // conversion table below
    // feet to meters
    public static void main(String[] args) {
        System.out.println("Feet to Meters:");
        for (int foot = 1; foot <= 10; foot++) {
            System.out.printf("%d feet = %.3f meters%n", foot, footToMeter(foot));
        }      
        // meters to feet
        System.out.println("\nMeters to Feet:");
        for (int meter = 20; meter <= 65; meter += 5) {
            System.out.printf("%d meters = %.3f feet%n", meter, meterToFoot(meter));
        }
    }
}
