
public class Kadai2_5_1 {

	public static void main(String args[]) {

		StringBuilder disp = new StringBuilder();
		String str = "";
		for (int i = 1; i <= 40; i++) {
			if (i != 1) {
				str = ", ";
			}
			str += String.valueOf(i);
			if (i % 3 == 0 || String.valueOf(i).contains("3")) {
				str += "（アホっぽく）";
			}
			disp.append(str);
		}
		System.out.println(disp);
	}
}
