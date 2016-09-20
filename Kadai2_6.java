import java.util.Scanner;

public class Kadai2_6 {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int year;

		try {
			System.out.println("数値を入力してください。");
			System.out.print(">");
			year = sc.nextInt();

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ) {
				System.out.println(String.valueOf(year) + "年はうるう年です。");
			} else {
				System.out.println(String.valueOf(year) + "年はうるう年ではありません。");
			}

		} catch (Exception e) {
			System.out.println("入力値が不正です。");
		} finally {
			sc.close();
		}

	}
}
