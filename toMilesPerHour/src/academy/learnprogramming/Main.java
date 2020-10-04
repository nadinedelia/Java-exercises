package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        printConversion(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        }

        return Math.round(kilometersPerHour * 0.62137);
    }

    public static void printConversion(double kilometersPerHour) {

        if(kilometersPerHour <0) {
            System.out.println("Invalid value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }
}
