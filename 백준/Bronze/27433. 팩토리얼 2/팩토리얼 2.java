import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		bw.write(factorial(n, 1, 1) + "");

		// 최종 출력
		bw.flush();
		bw.close();
	}

	public static long factorial(int target, int current, long result) {
		if (target == 0)
			return 1;

		result *= current;
		if (target == current) {
			return result;
		} else {
			return factorial(target, current + 1, result);
		}

	}

}
