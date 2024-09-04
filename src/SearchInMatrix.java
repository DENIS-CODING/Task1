// Работа с двумерными массивами: поиск элемента

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 50;
        boolean found = false;
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[i].length; ++j) {
                if (matrix[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("Элемент " + target + " найден в матрице");
        } else {
            System.out.println("Элемент " + target + " не найден в матрице");
        }
    }
}

