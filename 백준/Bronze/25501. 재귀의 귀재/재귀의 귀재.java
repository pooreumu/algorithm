import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int len = Integer.parseInt(br.readLine());
		for (int i = 0; i < len; i++) {
			String str = br.readLine();

			Map<Integer, Integer> result = isPalindrome(str);
			int key = result.keySet().iterator().next();
			bw.write(key + " " + result.get(key) + "\n");
		}

		// 최종 출력
		bw.flush();
		bw.close();
	}

	public static Map<Integer, Integer> recursion(String s, int l, int r, int numberOfCalls) {
		if (l >= r) {
			Map<Integer, Integer> map = new HashMap<>(1, numberOfCalls);
			map.put(1, numberOfCalls);
			return map;
		} else if (s.charAt(l) != s.charAt(r)) {
			Map<Integer, Integer> map = new HashMap<>(0, numberOfCalls);
			map.put(0, numberOfCalls);
			return map;
		} else {
			return recursion(s, l + 1, r - 1, numberOfCalls + 1);
		}
	}

	public static Map<Integer, Integer> isPalindrome(String s) {
		return recursion(s, 0, s.length() - 1, 1);
	}

}
