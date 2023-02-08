package matrix;

public class Task5 {
    public static void main(String[] args) throws Exception {
        int[][] mt1 = {{1,2,3}, {1,2,3}, {1,2,3}};
        int[][] mt2 = {{1}, {2}, {3}};
        Matrix matrix1 = new Matrix(mt1);
        Matrix matrix2 = new Matrix(mt2);
        Matrix matrix3 = matrix1.multiplyMatrix(matrix2);
        System.out.println(matrix3.toString());
    }
}
