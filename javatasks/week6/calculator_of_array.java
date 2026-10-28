public class calculator_of_array {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 10};
        double sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double average = sum/numbers.length;
        System.out.println("Среднее значение "+average);
    }
}
