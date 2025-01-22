import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		long result = 0;
		long[] S = new long[N + 1];
		long[] cnt = new long[M];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i < N + 1; i++) {
			S[i] = (S[i - 1] + Integer.parseInt(st.nextToken())) % M;
			if (S[i] == 0) {
				result++;
			}
			cnt[(int)S[i]]++;
		}

		for (int i = 0; i < M; i++) {
			if (cnt[i] > 1) {
				result += (cnt[i] * (cnt[i] - 1) / 2);
			}
		}
		bw.write(result + " ");

		bw.flush();
		bw.close();

	}

}
