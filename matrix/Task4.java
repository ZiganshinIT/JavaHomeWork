package matrix;

public class Task4 {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(2);
        matrix.generateMatrix();
        matrix.showMatrix();
        System.out.println();
        matrix.changeUpperAndLowerTrianglesTo0();
        matrix.showMatrix();

    }
}
