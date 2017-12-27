import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(" enter number of rows");

		int row = scan.nextInt();
		
		System.out.println(" enter number of columns");

		int col = scan.nextInt();
		double array[][] = new double[row][col];
		// initial values from question
		// user input
		System.out.println("enter the elements: first to the right and then down");
		for (int j = 1; j < col; j++) {
			array[0][j] = scan.nextDouble();
		}
		System.out.println("left to right is over");
		System.out.println();
		System.out.println("now enter top to bottom");
		;
		for (int i = 1; i < row; i++) {
			array[i][0] = scan.nextDouble();
		}
}
}