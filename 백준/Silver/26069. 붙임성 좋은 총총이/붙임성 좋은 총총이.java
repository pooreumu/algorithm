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
		map.put("ChongChong", true);

		int len = Integer.parseInt(br.readLine());
		for (int i = 0; i < len; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String a = st.nextToken();
			String b = st.nextToken();

			if (Boolean.TRUE.equals(map.get(a))) {
				map.put(b, true);
			} else if (Boolean.TRUE.equals(map.get(b))) {
				map.put(a, true);
			}

		}

		final int[] result = {0};
		map.forEach((key, value) -> {
			if (Boolean.TRUE.equals(value)) {
				result[0] += 1;
			}
		});

		br.close();
		bw.write(result[0] + "");

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
