import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		Map<String, Integer> map = new HashMap<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		for (int i = 0; i < a; i++) {
			String key = br.readLine();
			if (key.length() >= b) {
				map.put(key, map.getOrDefault(key, 0) + 1);
			}

		}
		br.close();

		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());
		entryList.sort((e1, e2) -> {
			int freqCompare = e2.getValue().compareTo(e1.getValue());
			if (freqCompare != 0) {
				return freqCompare;
			}
			int lenCompare = Integer.compare(e2.getKey().length(), e1.getKey().length());
			if (lenCompare != 0) {
				return lenCompare;
			}
			return e1.getKey().compareTo(e2.getKey());
		});

		for (Map.Entry<String, Integer> entry : entryList) {
			bw.write(entry.getKey() + "\n");
		}

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
