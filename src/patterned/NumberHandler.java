package patterned;

public class NumberHandler extends Handler {
	private int num;

	public NumberHandler(String name, int num) {
		super(name);
		this.num = num;
	}

	@Override
	public void request(int req) {
		if (req == num) {
			System.out.println("" + req + " を受け取りました ：" + name);
		} else if (next != null) {
			next.request(req); // 責任の委譲
		} else {
			System.out.println("" + req + " を誰も受け取れませんでした");
		}
	}

}
