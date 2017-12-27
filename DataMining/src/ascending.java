public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weights[] = { 5, 20, 10, 7.5, 2.5, 8 };
		int k = 1;
		double temp = 0;
		int i=0;
		for (i = 0; i < weights.length - 1; i++) {
			for (int j = i + 1; j < weights.length; j++) {
				if (weights[i] > weights[j]) {
					temp = weights[i];
					weights[i] = weights[j];
					weights[j] = temp;
					System.out.println("true" + j);
				}
				System.out.println(weights[i] + "and " + weights[j]);
			}
			/*
			 * 
			 */

		}
		System.out.println("i value is "+i);
		for ( i = 0; i < weights.length; i++) {
			 System.out.println("Ascending Order is " + weights[i] + ","); }
	}

}
