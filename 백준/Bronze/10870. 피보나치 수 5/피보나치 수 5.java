import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static final Map<Integer, Long> memo = new HashMap<>();

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		memo.put(0, 0L);
		memo.put(1, 1L);
		memo.put(2, 1L);

		int n = Integer.parseInt(br.readLine());
		bw.write(getFibonacci(n) + "");

		// 최종 출력
		bw.flush();
		bw.close();
	}

	public static long getFibonacci(int target) {
		if (!memo.containsKey(target)) {
			long fibonacciN1 = memo.containsKey(target - 1) ? memo.get(target - 1) : getFibonacci(target - 1);
			long fibonacciN2 = memo.containsKey(target - 2) ? memo.get(target - 2) : getFibonacci(target - 2);

			memo.put(target, fibonacciN1 + fibonacciN2);
		}
		return memo.get(target);

	}

}
