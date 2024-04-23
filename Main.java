// Main Class File
public class Main {

    public static void main(String[] args) {
        int cell = 0;
        char[][] cells = new char[8][8];
        String startPieces = "RNBQKBNRPPPPPPPP////////////////////////////////PPPPPPPPRNBQKBNR";

        System.out.println("========================================");
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                if (startPieces.charAt(cell) != '/')
                    cells[row][col] = startPieces.charAt(cell);
                else
                    cells[row][col] = '-';
                if ((cell + 1) % 8 == 1)
                    System.out.print(" || ");
                // System.out.printf(" %2c ", cells[row][col]);
                System.out.printf(" %2d ", cell + 1);
                if ((cell + 1) % 8 == 0)
                    System.out.print(" || ");
                cell++;
            }
            System.out.println();
        }
        System.out.println("========================================");

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++)
                System.out.printf(" %2c ", cells[row][col]);
            System.out.println();
        }

    }

}
