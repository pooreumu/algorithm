
import java.util.*;
import java.io.*;

public class Main {
	private static List<Integer> memo = new ArrayList<>();

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();

		memo.add(0, 1);
		memo.add(1, 1);
		memo.add(2, 2);
		memo.add(3, 3);

		System.out.println(fibo(n));

		// 최종 출력
		bw.flush();
		bw.close();
	}

	static int fibo(int n) {
		if (memo.size() <= n) {
			memo.add(n, (fibo(n - 1) + fibo(n - 2)) % 15746);
		}
		return memo.get(n);

	}

}
