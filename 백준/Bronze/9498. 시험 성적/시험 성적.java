import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int score = Integer.parseInt(br.readLine());
		br.close();

		if (score >= 90) {
			bw.write("A");
		} else if (score >= 80) {
			bw.write("B");
		} else if (score >= 70) {
			bw.write("C");
		} else if (score >= 60) {
			bw.write("D");
		} else {
			bw.write("F");
		}

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
