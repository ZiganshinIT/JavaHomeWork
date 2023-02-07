package matrix;

import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    private final int size;
    private final int matrixSize;

    Matrix(int size) {
        this.size = size;
        this.matrixSize = 2 * size + 1;
    }

    public void inputMatrix() {
        int[][] newMatrix = new int[matrixSize][matrixSize];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                System.out.print(i + " массив " + j + " элемент: ");
                newMatrix[i][j] = scanner.nextInt();
            }
        }
        matrix = newMatrix;
    }

    public void generateMatrix() {
        int[][] newMatrix = new int[matrixSize][matrixSize];
        for(int i = 0; i < newMatrix.length; i++) {
            for (int j = 0; j < newMatrix.length; j++) {
                newMatrix[i][j] = 1;
            }
        }
        matrix = newMatrix;
    }

    public void changeUpperAndLowerTrianglesTo0() {
        // верний треугольник
        for (int i = 0; i < size; i++) { // от первого массива до массива предшетвующией пересечению диагоналей
            int border = matrix.length - 1; // граница до побочной диагонали
            int j = 1; // граниица до основной диагонали
            // с каждой итерацией сужаем границу на 1
            if (i > 0) {
                j += i;
                border -= i;
            }
            for(; j < border; j++) {
                matrix[i][j] = 0;
            }
        }
        // нижний треугольник
        for (int i = matrix.length - 1; i > size; i--) { // нули рассталяются от самого нижнего массива до массива предшествующей пересечению диагоналей
            int j = 1; // граница до побочной диагонали
            int border = matrix.length - 1; // граница до основной диагонали
            // с каждой итерацией сужаем границу на 1
            if (i < matrix.length - 1) {
                j += (matrix.length - 1) - i;
                border -= (matrix.length - 1) - i;
            }
            for(; j < border; j++) {
                matrix[i][j] = 0;
            }
        }
    }

    public void showMatrix() {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
