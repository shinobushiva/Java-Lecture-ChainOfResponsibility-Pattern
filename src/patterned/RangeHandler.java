package patterned;

public class RangeHandler extends Handler {

	private int min;
	private int max;

	public RangeHandler(String name, int min, int max) {
		super(name);
		this.min = min;
		this.max = max;
	}

	@Override
	public void request(int req) {
		if (req >= min && req <= max) {
			System.out.println("" + req + " を受け取りました ：" + name);
		} else if (next != null) {
			next.request(req); // 責任の委譲
		} else {
			System.out.println("" + req + " を誰も受け取れませんでした");
		}
	}

}
