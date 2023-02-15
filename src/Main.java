public class Main {
    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 14;
        numbers[1] = 12;
        numbers[2] = 1;
        numbers[3] = 4;
        numbers[4] = 100;

        for (int i = 0; i < numbers.length; i++) {
            int min = i;
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            swap(numbers, i, min);
        }

        printArray(numbers);
    }

    public static void swap(int[] a, int indexOne, int indexTwo) {
        int temp = a[indexOne];
        a[indexOne] = a[indexTwo];
        a[indexTwo] = temp;
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " " );
        }
        System.out.println();
    }
}