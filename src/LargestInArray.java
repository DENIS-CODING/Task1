
// Поиск наибольшего элемента в массиве
public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {48, 75, 2, 9, 1, 47, 567, 1024};
        int max = arr[0];
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Наибольший элемент в массиве: " + max);
    }
}
