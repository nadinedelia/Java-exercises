package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        toMilesPerHour(1.5);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1;
        } else {
            return printConversion(kilometersPerHour);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        double milesPerHour = kilometersPerHour * 0.62137;
        System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
    }
}
