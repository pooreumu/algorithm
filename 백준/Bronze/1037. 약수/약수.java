import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(br.readLine());

		List<Integer> list = new ArrayList<>();

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < len; i++) {
			int n = Integer.parseInt(st.nextToken());
			list.add(n);
		}
		list.sort(Integer::compareTo);
		if (len == 1) {
			bw.write(list.get(0) * list.get(0) + "");
		} else {
			bw.write(list.get(list.size() - 1) * list.get(0) + "");
		}

		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
