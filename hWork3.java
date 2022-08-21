import java.util.Scanner;

public class hWork3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r = scan.nextDouble();
        double S = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь окружности радиусом " + r + " равняется " + S);
    }
}
