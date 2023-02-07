package matrix;

import java.util.Scanner;

class MatrixMultiply {

    int[][] matrix;
    int rowSize;
    int colSize;

    MatrixMultiply(int rowSize, int colSize) {
        this.rowSize = rowSize;
        this.colSize = colSize;
    }

    public void inputMatrix() {
        int[][] newMatrix = new int[rowSize][colSize];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++) {
                System.out.print((i + 1) + " строка " + (j + 1) + " колонка: ");
                newMatrix[i][j] = scanner.nextInt();
            }
        }
        matrix = newMatrix;
    }

    public void multiplyMatrix(MatrixMultiply anotherMatrix) {
        if (anotherMatrix.rowSize != colSize) {
            System.out.println(" Multiplication Not Possible");
            return;
        }
        int[][] resultMatrix = new int[rowSize][anotherMatrix.colSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < anotherMatrix.colSize; j++) {
                for (int k = 0; k < anotherMatrix.rowSize; k++)
                    resultMatrix[i][j] += matrix[i][k] * anotherMatrix.matrix[k][j];
            }
        }
        for (int[] i : resultMatrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}