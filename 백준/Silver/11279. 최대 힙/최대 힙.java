import java.io.*;
import java.util.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int m = Integer.parseInt(br.readLine());
			if (m == 0) {
				if (priorityQueue.isEmpty()) {
					bw.write(0 + "\n");
				} else {
					bw.write(priorityQueue.poll() + "\n");
				}
			}else {
				priorityQueue.add(m);
			}
		}

		bw.flush();
		bw.close();

	}

}
