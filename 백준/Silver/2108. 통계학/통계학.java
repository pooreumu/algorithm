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

		int len = Integer.parseInt(br.readLine());

		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < len; i++) {
			int n = Integer.parseInt(br.readLine());
			if (map.containsKey(n)) {
				map.put(n, map.get(n) + 1);
			} else {
				map.put(n, 1);
			}

			list.add(n);
		}
		list.sort(Comparator.naturalOrder());

		// 첫째 줄에는 arithmeticMean을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
        int sum = list.stream().mapToInt(Integer::intValue).sum();
		bw.write(Math.round ((float)sum /list.size()) + "\n");

		// 	둘째 줄에는 중앙값을 출력한다.
		bw.write(list.get(list.size() / 2) + "\n");

		// 	셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
		// map 정렬하
		List<Map.Entry<Integer, Integer>> entryList = new LinkedList<>(map.entrySet());
		entryList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

		int mode = entryList.get(0).getValue();
		entryList = entryList.stream().filter(entry -> entry.getValue() == mode).collect(Collectors.toList());
		entryList.sort(Map.Entry.comparingByKey(Comparator.naturalOrder()));
		if (entryList.size() == 1) {
			bw.write(entryList.get(0).getKey() + "\n");
		} else {
			bw.write(entryList.get(1).getKey() + "\n");
		}

		bw.write((list.get(list.size() - 1) - list.get(0)) + "\n");

		// 최종 출력
		bw.flush();
		bw.close();
	}

}
