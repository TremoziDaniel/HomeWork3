import java.util.Scanner;

public class hWork4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = (a << 1);
        System.out.println(a);
        System.out.println(b);
        //Побитовый сдвиг в лево на 1 просто умножает число на 2
    }
}
