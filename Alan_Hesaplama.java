import java.util.Scanner;

public class Alan_Hesaplama {
    public static void main(String[] args) {
        int a, b, c;
        double alan, cevre, u;

        Scanner imp = new Scanner(System.in);

        System.out.println("1. kenarı giriniz");
        a = imp.nextInt();
        System.out.println("2. kenarı igriniz");
        b= imp.nextInt();
        System.out.println("3. kenarı giriniz");
        c= imp.nextInt();

        u = ((a+b+c)/2);
        cevre = 2*u;
        alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));

        System.out.println("üçgenin çevresi : " + cevre);
        System.out.println("üçgenin alanı : " + alan);


    }
}
