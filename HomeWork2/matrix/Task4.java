package matrix;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrx = {{1,2,3}, {1,2,3,}, {1,2,3}};
        Matrix matrix = new Matrix(matrx);
        System.out.println(matrix.toString());
        matrix.changeUpperAndLowerTrianglesTo0();
        System.out.println(matrix.toString());

    }
}
