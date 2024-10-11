public class MileToKilometerTable {
    public static void main(String[] args) {
        double kilometers = 0;
        System.out.println("Miles           Kilometers");
        for (int miles = 1; miles <= 10; miles++) {
            kilometers = miles * 1.609;
            System.out.printf("%-10d %10.3f%n", miles, kilometers);
        }
    }
}