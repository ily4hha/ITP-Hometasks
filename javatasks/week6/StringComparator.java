import java.util.Scanner;

public class StringComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        boolean answer = string1.equals(string2);
        System.out.println("Are our numbers equals?? - "+answer);
        scanner.close();
    }
}
