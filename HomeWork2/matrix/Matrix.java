package matrix;

public class Matrix {
    int[][] matrix;
    public final int size;
    public final int matrixSize;

    Matrix(int[][] matrix) {
        this.size = (matrix.length - 1) / 2;
        this.matrixSize = matrix.length;
        this.matrix = matrix;
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

    public Matrix multiplyMatrix(Matrix anotherMatrix) throws Exception {
        int rowSize1 = matrix.length;
        int colSize1 = matrix[0].length;
        int rowSize2 = anotherMatrix.matrix.length;
        int colSize2 = anotherMatrix.matrix[0].length;
        if (rowSize2 != colSize1) {
            throw new Exception("Ошибка");
        }
        int[][] resultMatrix = new int[rowSize1][colSize2];
        for (int i = 0; i < rowSize1; i++) {
            for (int j = 0; j < colSize2; j++) {
                for (int k = 0; k < rowSize2; k++)
                    resultMatrix[i][j] += matrix[i][k] * anotherMatrix.matrix[k][j];
            }
        }
        return new Matrix(resultMatrix);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int[] row : matrix) {
            for (int elem : row) {
                str.append(elem + " ");
            }
            str.append("\n");
        }
        return str.toString();
    }
}
