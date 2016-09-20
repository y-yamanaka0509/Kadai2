import java.util.Scanner;

public class Kadai2_2_2 {

	public static void main(String args[]) {

		Kadai2_2_2 kadai = new Kadai2_2_2();
		Scanner sc = new Scanner(System.in);
		String star = "";
		int i;
		int j;

		try {
			System.out.println("ピラミッドの段数を指定してください。");
			System.out.print(">");
			j = sc.nextInt();
			if (j > 0) {
				for (i = 1; i < j + 1; i++) {
					star = kadai.repeat("　", i - 1) + kadai.repeat("☆", (j + 1 - i) * 2 - 1) + kadai.repeat("　", i - 1);
					System.out.println(star);
				}
			} else {
				System.out.print("1以上の数値を入力してください。");
			}

		} catch (Exception e) {
			System.out.print("処理に失敗しました。");
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
