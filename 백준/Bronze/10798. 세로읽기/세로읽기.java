import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<String[]> list = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			String[] strList = br.readLine().split("");
			list.add(strList);
		}
		br.close();

		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 5; j++) {
				if (list.get(j).length <= i) {
					continue;
				}
				bw.write(list.get(j)[i]);

			}

		}

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
