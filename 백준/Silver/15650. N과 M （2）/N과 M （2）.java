import java.util.*;
import java.io.*;


public class Main {

	private static boolean[] visit;
	private static int[] arr;

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		visit = new boolean[n];
		arr = new int[m];
		dfs(n, m, 0, 0);

		// 최종 출력
		bw.flush();
		bw.close();
	}

	private static void dfs(int n, int m, int depth, int at) {
		if (depth == m) {
			for (int val : arr) {
				System.out.print(val + " ");
			}
			System.out.print("\n");
			return;
		}

		for (int i = at; i < n; i++) {

			if (!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1, i + 1);

				visit[i] = false;
			}
		}
	}

}
