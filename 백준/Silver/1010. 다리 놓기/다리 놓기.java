import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(br.readLine());

		for (int i = 0; i < len; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			bw.write((getFactorial(m).divide(getFactorial(m - n).multiply(getFactorial(n)))) + "\n");
		}

		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}

	public static BigInteger getFactorial(int n) {
		BigInteger result = BigInteger.valueOf(1L);

		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}
		}

		return result;

	}

}
