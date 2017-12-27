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
		scan.close();
		/*
		 * array[0][0] = 0; array[0][1] = 0.3; array[0][2] = 0.4; array[0][3] = 0.5;
		 * array[0][4] = 0.55; array[0][5] = 0.65; array[0][6] = 0.7; array[0][7] = 0.8;
		 * array[1][0] = 0.2; array[2][0] = 0.3; array[3][0] = 0.5; array[4][0] = 0.4;
		 * array[5][0] = 0.4; array[6][0] = 0.6;
		 */
		// square of differences
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				double x = (array[0][j] - array[i][0]) * (array[0][j] - array[i][0]);

				array[i][j] = Math.round(x * 100.0) / 100.0;
			}
		}

		System.out.println("initial matrix");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		double array2[][] = new double[row][col];
		array2[0][0] = 0;
		for (int j = 1; j < col; j++) {
			array2[0][j] = 99;
		}
		for (int i = 1; i < row; i++) {
			array2[i][0] = 99;
		}

		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				// min of 3 adjacent values
				double gamma = Math.min(Math.min(array2[i - 1][j], array2[i][j - 1]), array2[i - 1][j - 1]);
				// System.out.println(gamma);
				array2[i][j] = Math.round((array[i][j] + gamma) * 100.0) / 100.0;
			}

		}

		// final matrix
		System.out.println();
		System.out.println("final matrix is here");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();

		}

	}

}
