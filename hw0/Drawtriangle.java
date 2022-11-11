public class Drawtriangle {
    public static void Drawtriangle(int N) {
        int col = 0;
        int row = 0;
        int size = N;
        while (row <= N) {
            row += 1;
            col = 0;
            while (col < row) {
                col += 1;
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Drawtriangle(10);
    }
}
