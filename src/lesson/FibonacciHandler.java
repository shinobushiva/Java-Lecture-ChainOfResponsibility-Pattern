package lesson;

import patterned.Handler;

/**
 * [課題] Fibonacci(フィボナッチ）数を受け取る処理機を実装してください
 * 
 * フィボナッチ数（Wikipedia)
 * https://ja.wikipedia.org/wiki/%E3%83%95%E3%82%A3%E3%83%9C%E3
 * %83%8A%E3%83%83%E3%83%81%E6%95%B0
 * 
 * @author shiva
 *
 */
public class FibonacciHandler extends Handler {

	public FibonacciHandler(String name) {
		super(name);
	}

	// 処理の以上を適切に記述する
	@Override
	public void request(int req) {

	}

	public boolean isFibonaccciNumber(int num) {
		// 引数がフィボナッチ数の場合にtrueを返すように実装する
		return false;
	}

}
