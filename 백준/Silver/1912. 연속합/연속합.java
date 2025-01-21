

import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int[] dp = new int[n];
		int max = arr[0];
		dp[0] = arr[0];
		for (int i = 1; i < n; i++) {
			dp[i] = Math.max(arr[i], dp[i - 1] + arr[i]);
			max = Math.max(dp[i], max);
		}
		bw.write(max + "");

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
