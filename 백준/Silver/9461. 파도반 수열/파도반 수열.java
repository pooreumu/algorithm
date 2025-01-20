

import java.util.*;
import java.io.*;

public class Main {
	private static List<Long> memo = new ArrayList<>();

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		memo.add(0L);
		memo.add(1L);
		memo.add(1L);
		memo.add(1L);
		memo.add(2L);
		memo.add(2L);
		memo.add(3L);
		memo.add(4L);
		memo.add(5L);
		memo.add(7L);
		memo.add(9L);
		memo.add(12L);
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			bw.write(cur(m) + "\n");
		}
		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}

	static long cur(int n) {
		if (memo.size() <= n) {
			memo.add(n, cur(n - 1) + cur(n - 5));
		}
		return memo.get(n);

	}

}
