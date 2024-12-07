import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int year = Integer.parseInt(br.readLine());
		br.close();

		if (year % 4 == 0) {
			if (year % 400 == 0 || year % 100 != 0) {
				bw.write(1 + "\n");
			} else {
				bw.write(0 + "\n");
			}
		} else {
			bw.write(0 + "\n");
		}

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
