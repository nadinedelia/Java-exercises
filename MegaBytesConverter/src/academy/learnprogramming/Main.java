package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes = kiloBytes / 1024;
        int remainBytes = kiloBytes % 1024;

        if(kiloBytes <0) {
            System.out.println("Invalid Value");
        } else
        System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainBytes + " KB");
    }
}
