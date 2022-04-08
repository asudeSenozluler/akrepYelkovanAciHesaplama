import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Saat giriniz: ");
        int s = scanner.nextInt();

        System.out.println("Dakika giriniz: ");
        int d=scanner.nextInt();

        int a = 0, y = 0;

        s = s % 12;
        a = s * 30;
        a = (int)(a + (d * 0.5));
        y = d * 6;

        if (a>y)
        {
            System.out.println(a - y);
        }
        else
        {
            System.out.println(y-a);
        }
	// write your code here
    }
}
