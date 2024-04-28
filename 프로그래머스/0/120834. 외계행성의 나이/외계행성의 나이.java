class Solution {
	public String solution(int age) {
		String answer = "";
		String ageStr = "" + age;
		for (int i = 0; i < ageStr.length(); i++) {
			int idx = ageStr.charAt(i);
			answer += (char)(idx + 49);
		}
		return answer;
	}
}
