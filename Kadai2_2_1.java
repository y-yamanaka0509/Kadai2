
public class Kadai2_2_1 {

	public static void main(String args[]) {

		Kadai2_2_1 kadai = new Kadai2_2_1();
		String star = "";
		int i;

		for (i = 1; i < 7; i++) {
			star = kadai.repeat("　", i - 1) + kadai.repeat("☆", (7 - i) * 2 - 1) + kadai.repeat("　", i - 1);
			System.out.println(star);
		}

	}

	private String repeat(String s, int times) {
		String result = "";
		for (int i = 1; i <= times; i++) {
			result += s;
		}
		return result;
	}

}
