
public class Kadai2_7 {

	public static void main(String args[]) {
		Kadai2_7 kadai = new Kadai2_7();
		kadai.calcFibonacci(0, 1);
	}

	private int calcFibonacci(int result, int i) {
		System.out.println(result);
		if (result < 500) {
			result += calcFibonacci(result + i, result);
		}
		return result;
	}
}
