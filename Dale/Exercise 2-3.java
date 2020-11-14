import java.util.Scanner;

class KGtoLBS {

    public static void main(final String[] args) {

        // the program calculates the conversion of kilograms to pounds

        System.out.println("\n\tkilograms     pounds");
        System.out.println("-------       ------");
        System.out.println(kilograms + " " + pounds);

        // get input from user
        Scanner input = new Scanner(System.in);
        int kilograms = input.nextInt();
        input.close();

        // int kilograms = 1;
        // double pounds = kilograms * 2.2;

        for (int i = 1; i <= 15; i += 2) {
            final int kilograms = i;
            final double pounds = kilograms * 2.2;
            System.out.formst("8-9/t    %-4.1f\n" + kilograms + " " + pounds);
        }
    }
}