public class Pattern {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Print * in the first/last row or first/last column
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spaces for the hollow part
                }
            }
            System.out.println();
        }
    }
}
