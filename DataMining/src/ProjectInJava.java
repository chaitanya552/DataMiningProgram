/*Complete Example:
A → aBcdE
Step 1:
A → <a><BcdE> creates 2 new non-terminals: <a> and <BcdE>
Step 2:
<a> → a
<BcdE> → B<cdE> creates new non-terminal <cdE>
repeat step 2:
<cdE> → <c><dE> creates 2 new non-terminals: <c> and <dE>
repeat step 2:
<c> → c
<dE> > <d>E creates new non-terminal <d>
repeat step 2:
<d> → d
Finished*/


import java.util.Scanner;

public class ProjectInJava {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		// take input from the console
		System.out.println("Enter the string");
		String input = scanner.nextLine();
		// separate input to left hand side and right hand side of "->"
		String lhs = getLeftHandSide(input);
		String rhs = getRightHandSide(input);
		// this gives string rhs length
		int rhs_size = rhs.length();
		int loop = 1;
		// this loop works untill the string is split into into two individual
		// characters
		while (rhs_size - loop > 0) {
			String[] buf = rhs.split("");
			StringBuilder strBuilder = new StringBuilder();
			// this b1 gives first character
			String b1 = buf[loop - 1];
			for (int i = loop; i < rhs_size; i++) {
				strBuilder.append(buf[i]);
			}
			// b2 gives the remainder excluding first character
			String b2 = strBuilder.toString();
			strBuilder.setLength(0);
			loop++;
			String p1 = b1;
			String p2 = b2;
			boolean a = false;
			// checks if first character is lower case
			if (Character.isLowerCase(b1.charAt(0))) {
				// makes the first character a non terminal
				p1 = '<' + b1 + '>';
				a = true;
			}
			if (p2.length() > 1) {
				// if no of characters to the right is more thsn 1 then add non
				// terminal to it
				p2 = '<' + b2 + '>';

			}
			String full = b1 + b2;
			String current_lhs;
			// current lhs logic and print statements
			if (rhs.equals(full)) {
				current_lhs = lhs;
			} else {
				current_lhs = '<' + b1 + b2 + '>';
			}

			System.out.println(current_lhs + "->" + p1 + p2);
			if (a) {
				System.out.println(p1 + "->" + b1);
			}

		}

	}

	// methods to separate lhs and rhs
	public static String getLeftHandSide(String s) {
		return s.split(" *-> *")[0].trim();
	}

	public static String getRightHandSide(String s) {
		return s.split(" *-> *")[1].trim();
	}
}