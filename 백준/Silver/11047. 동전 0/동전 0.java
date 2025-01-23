import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int target = Integer.parseInt(st.nextToken());

		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(0, Integer.parseInt(br.readLine()));
		}

		int result = 0;
		for (int coin : list) {
			int coinCount = target / coin;
			target -= coinCount * coin;
			result += coinCount;
			if (target == 0) {
				break;
			}
		}

		bw.write(result + "");

		bw.flush();
		bw.close();

	}

}
