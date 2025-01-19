import java.io.*;
import java.util.*;

public class Main {

	private static int countFib = 1;
	private static int countFibonacci = 0;

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();
		fib(n);
		fibonacci(n);
		bw.write(countFib + " " + countFibonacci);

		bw.flush();
		bw.close();
	}

	private static int fib(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			countFib++;
			return fib(n - 1) + fib(n - 2);
		}
	}

	private static int fibonacci(int n) {
		List<Integer> memo = new ArrayList<>();
		memo.add(1);
		memo.add(1);
		memo.add(1);
		for (int i = 3; i <= n; i++) {
			countFibonacci++;
			memo.add(i, memo.get(i - 1) + memo.get(i - 2));
		}
		return memo.get(n);
	}

}
