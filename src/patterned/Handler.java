package patterned;

public abstract class Handler {
	protected String name;
	protected Handler next;

	public Handler(String name) {
		this.name = name;
	}

	public Handler setNext(Handler handler) {
		this.next = handler;
		return handler;
	}

	public abstract void request(int req); // 抽象メソッド
}
