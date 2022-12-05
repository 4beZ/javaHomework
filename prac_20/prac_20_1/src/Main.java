public class Main {
    public static void main(String[] args) {
        Integer[][] a = {{1, 2, 3},
                         {3, 4, 6}};
        Integer[][] b = {{5, 6},
                         {9, 7},
                         {1, 2}};
        double[][] res = Matrix.mult(a, b);
        for (double[] line : res) {
            for (double num : line) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}