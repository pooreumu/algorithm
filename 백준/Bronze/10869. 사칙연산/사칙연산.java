import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());

		bw.write((a + b) + "\n");
		bw.write((a - b) + "\n");
		bw.write((a * b) + "\n");
		bw.write((a / b) + "\n");
		bw.write((a % b) + "\n");

		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
