
public class Kadai2_1 {

	public static void main(String args[]) {

		StringBuilder result;
		String work;

		for (int i = 1; i <= 9; i++) {
			result = new StringBuilder();
			for (int j = 1; j <= 9; j++) {
				if (j > 1) {
					result.append(" ");
				}
				work = Integer.toString(i * j);
				if (work.length() == 1) {
					work = " " + work;
				}
				result.append(work);
			}
			System.out.println(result);
		}
	}
}
