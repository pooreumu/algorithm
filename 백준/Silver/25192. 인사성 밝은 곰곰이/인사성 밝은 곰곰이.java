import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Boolean> map = new HashMap<>();

		int result = 0;

		int len = Integer.parseInt(br.readLine());
		for (int i = 0; i < len; i++) {
			String nickname = br.readLine();
			if (nickname.equals("ENTER")) {
				result += map.size();
				map.clear();
				continue;
			}
			map.put(nickname, true);

		}
		result += map.size();
		br.close();
		bw.write(result + "");

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
