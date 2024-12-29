public class XShape {
    public static void main(String[] args) {
        // Print a message indicating the creation of the X shape
        System.out.println("Creating a X shape");

        // Call the createShapeX method to create an X shape of size 8 using 'X' as the pen character
        createShapeX(8, 'X');
    }

    // Method to create an X shape in a square grid
    public static void createShapeX(int size, char pen) {
        // Loop through each row
        for (int row = 0; row < size; row++) {
            // Loop through each column in the current row
            for (int col = 0; col < size; col++) {
                // Check if the current position is on the X diagonals
                if (row == col || row + col == size - 1) {
                    // Print the pen character if the current position is on the X diagonals
                    System.out.print(pen);
                } else {
                    // Print a space if the current position is not on the X diagonals
                    System.out.print(" ");
                }
            }
            // Move to the next line after printing all columns in the current row
            System.out.println();
        }
    }
}
