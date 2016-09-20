import java.util.Arrays;
import java.util.Scanner;

public class Kadai2_3 {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String text = "";
		double d =0.0;
		String cal ="";
		String[] calText = {"+","-","*","/"};
		double result = 0.0;
		boolean isCalc = false;
		boolean isEnd = false;

		while (true) {

			while (true) {

				try {
					System.out.println("数値を入力してください。");
					System.out.print(">");
					text = sc.next();
					if (text.startsWith("e") == true) {
						isEnd = true;
						break;
					}
					d = Double.parseDouble(text);

					if (isCalc) {
						switch  (cal) {
						case "+":
							result = result +d;
							break;
						case "-":
							result = result -d;
							break;
						case "*":
							result = result *d;
							break;
						case "/":
							if (d == 0) {
								System.out.println("入力値が不正です。");
								continue;
							}
							result = result /d;
							break;
						}

						System.out.println("計算結果⇒" + String.valueOf(result));
					} else {
						result = d;
						isCalc =true;
					}

					break;
				} catch (Exception e) {
					System.out.println("処理に失敗しました。");
				}

			}

			if (isEnd) {
				break;
			}

			while (true) {
				System.out.println("加減乗除（+ , - , * , /）を選択してください。");
				System.out.print(">");
				text = sc.next();
				if (text.startsWith("e") == true) {
					isEnd = true;
					break;
				}
				if (Arrays.asList(calText).contains(text) == false){
					System.out.println("入力値が不正です。");
					continue;
				}
				cal=text;
				break;
			}

			if (isEnd) {
				break;
			}
		}
		System.out.print("終了しました。");

		sc.close();
	}
}
