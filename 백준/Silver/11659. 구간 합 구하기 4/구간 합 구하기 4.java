import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		List<Integer> list = Arrays.stream(br.readLine().split(" "))
			.map(Integer::parseInt)
			.collect(Collectors.toList());

		List<Integer> sumList = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				sumList.add(list.get(0));
			} else {
				sumList.add(i, sumList.get(i - 1) + list.get(i));
			}
		}

		for (int i = 0; i < m; i++) {
			StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(tokenizer.nextToken());
			int b = Integer.parseInt(tokenizer.nextToken());

			if (a == 1) {
				bw.write(sumList.get(b - 1) + "\n");
			} else {
				bw.write((sumList.get(b - 1) - sumList.get(a - 2)) + "\n");
			}
		}

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
