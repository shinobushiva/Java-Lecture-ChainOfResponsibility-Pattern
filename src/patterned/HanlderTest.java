package patterned;

public class HanlderTest {

	public static void main(String[] args) {
		NumberHandler nh1 = new NumberHandler("100 処理機", 100);
		NumberHandler nh2 = new NumberHandler("-50 処理機", -50);
		RangeHandler rh1 = new RangeHandler("50-99 処理機", 50, 75);
		RangeHandler rh2 = new RangeHandler("25-49 処理機", 25, 49);
		EvenHandler eh = new EvenHandler("偶数 処理機");

		// 委譲のチェーンを設定
		nh1.setNext(nh2).setNext(rh1).setNext(rh2).setNext(eh);

		nh1.request(100);
		nh1.request(-50);
		nh1.request(70);
		nh1.request(32);
		nh1.request(10);
		nh1.request(9);
	}

}
