import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// 첫번째 라인 값 3 입력
		StringTokenizer st = new StringTokenizer(br.readLine());

        int result = 0;
		while (st.hasMoreTokens()) {
            result += Integer.parseInt(st.nextToken());
			//분할된 문자열 데이터를 가공할 코드
		}
        bw.write(""+result);
		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
