
public class Kadai2_5_2 {

	public static void main(String args[]) {

		StringBuilder disp = new StringBuilder();
		String str = "";
		for (int i = 1; i <= 60; i++) {
			if (i != 1) {
				str = ", ";
			}
			str += String.valueOf(i);
			if (i % 5 == 0) {
				str += "（犬っぽく）";
			}
			disp.append(str);
		}
		System.out.println(disp);
	}
}
