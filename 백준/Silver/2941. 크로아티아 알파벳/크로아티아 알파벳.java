import java.util.*;
import java.io.*;

public class Main {

	// Exception 처리
	public static void main(String[] args) throws Exception {

		// BufferedReader 선언

		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter 선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		str = str.replace("c=", "*");
		str = str.replace("c-", "*");
		str = str.replace("dz=", "*");
		str = str.replace("d-", "*");
		str = str.replace("lj", "*");
		str = str.replace("nj", "*");
		str = str.replace("s=", "*");
		str = str.replace("z=", "*");

		bw.write(str.length() + "");
		br.close();

		// 최종 출력
		bw.flush();
		bw.close();
	}
}
