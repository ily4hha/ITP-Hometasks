import java.util.Scanner;

public class ConvertorF_to_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit = scanner.nextDouble();
        double cels = (fahrenheit - 32)*5/9;
        System.out.println(fahrenheit + " F = " + cels + " C");
        scanner.close();
    }
}
