import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		List<List<Integer>> cumulativeSum = new ArrayList<>();
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int r = Integer.parseInt(st.nextToken());
			int g = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if (i == 0) {
				ArrayList<Integer> list = new ArrayList<>();
				list.add(r);
				list.add(g);
				list.add(b);
				cumulativeSum.add(0, list);
			} else {
				List<Integer> integers = cumulativeSum.get(i - 1);
				ArrayList<Integer> list = new ArrayList<>();
				list.add(r + Math.min(integers.get(1), integers.get(2)));
				list.add(g + Math.min(integers.get(0), integers.get(2)));
				list.add(b + Math.min(integers.get(0), integers.get(1)));
				cumulativeSum.add(list);
			}
		}
		br.close();

		List<Integer> lastSum = cumulativeSum.get(n - 1);
		bw.write(Math.min(Math.min(lastSum.get(0), lastSum.get(1)), lastSum.get(2)) + "");

		bw.flush();
		bw.close();

	}

}
