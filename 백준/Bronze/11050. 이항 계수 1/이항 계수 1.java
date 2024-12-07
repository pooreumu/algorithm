import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		br.close();

		bw.write(getFactorial(n) / (getFactorial(k) * getFactorial(n - k)) + "\n");

		// 최종 출력
		bw.flush();
		bw.close();
	}

	public static int getFactorial(int num) {
		int result = 1;

		if (num > 1) {
			for (int i = 2; i <= num; i++) {
				result *= i;
			}
		}
		return result;
	}
}
