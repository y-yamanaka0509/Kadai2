public class Kadai2_4 {

	public static void main(String args[]) {

		String str = "";
		StringBuilder disp = new StringBuilder();
		for (int i = 1; i <= 50; i++) {

			if (i != 1) {
				str = ", ";
			}
			if (i % 15 == 0) {
				str += "FizzBuzz";
			} else if (i % 3 == 0) {
				str += "Fizz";
			} else if (i % 5 == 0) {
				str += "Buzz";
			} else {
				str += String.valueOf(i);
			}
			disp.append(str);
		}
		disp.append(", ...");
		System.out.println(disp);
	}

}
