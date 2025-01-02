import java.util.*;
import java.io.*;

public class Main {

	private static int[] arr;
	private static StringBuilder sb = new StringBuilder();

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		arr = new int[m];
		dfs(n, m, 0);

		// 최종 출력
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}

	private static void dfs(int n, int m, int depth) {

		if (depth == m) {
			for (int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}

		for (int i = 0; i < n; i++) {
			arr[depth] = i + 1;
			dfs(n, m, depth + 1);
		}

	}

}
