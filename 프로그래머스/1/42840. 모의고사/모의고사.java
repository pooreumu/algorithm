import java.util.*;

class Solution {

	public int[] solution(int[] answers) {
		int[] firstStudentAnswer = {1, 2, 3, 4, 5};
		int[] secondStudentAnswer = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] thirdStudentAnswer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int firstStudentResult = getCorrectCount(answers, firstStudentAnswer);
		int secondStudentResult = getCorrectCount(answers, secondStudentAnswer);
		int thirdStudentResult = getCorrectCount(answers, thirdStudentAnswer);

		List<Map<String, Integer>> result = new ArrayList<>();
		Map<String, Integer> student1 = new HashMap<>();
		student1.put("studentNumber", 1);
		student1.put("correctCount", firstStudentResult);
		result.add(student1);
		result = updateResult(result, secondStudentResult, 2);
		result = updateResult(result, thirdStudentResult, 3);

		return result.stream().mapToInt(x -> x.get("studentNumber")).toArray();
	}

	private int getCorrectCount(int[] answers, int[] studentAnswers) {
		int result = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == studentAnswers[i % studentAnswers.length]) {
				result++;
			}
		}
		return result;
	}

	private List<Map<String, Integer>> updateResult(List<Map<String, Integer>> resultInput, int correctCount,
		int studentNumber) {
		List<Map<String, Integer>> result = new ArrayList<>(List.copyOf(resultInput));
		Map<String, Integer> student = new HashMap<>();
		student.put("studentNumber", studentNumber);
		student.put("correctCount", correctCount);

		if (result.get(0).get("correctCount") < correctCount) {
			result.clear();
			result.add(student);
		} else if (result.get(0).get("correctCount") == correctCount) {
			result.add(student);
		}
		return result;
	}
}
