package matrix;

public class Task5 {
    public static void main(String[] args) {
        MatrixMultiply matrix1 = new MatrixMultiply(3,3);
        MatrixMultiply matrix2 = new MatrixMultiply(3,3);
        matrix1.inputMatrix();
        matrix2.inputMatrix();
        matrix1.multiplyMatrix(matrix2);
    }
}
