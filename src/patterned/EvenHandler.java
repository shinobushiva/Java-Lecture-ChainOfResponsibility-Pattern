package patterned;

public class EvenHandler extends Handler {

	public EvenHandler(String name) {
		super(name);
	}

	@Override
	public void request(int req) {
		if (req % 2 == 0) {
			System.out.println("" + req + " を受け取りました ：" + name);
		} else if (next != null) {
			next.request(req); // 責任の委譲
		} else {
			System.out.println("" + req + " を誰も受け取れませんでした");
		}
	}

}
