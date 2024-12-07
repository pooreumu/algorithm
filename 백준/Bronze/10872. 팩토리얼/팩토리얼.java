import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();

		int result = 1;
		if (n > 1) {
			for (int i = 2; i <= n; i++) {
				result *= i;
			}
		}
		bw.write(result + "\n");

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
