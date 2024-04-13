import java.util.*;

class Solution {
	public int[] solution(int[] answers) {
		int[] student1Answer = {1, 2, 3, 4, 5};
		int[] student2Answer = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] student3Answer = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int student1Result = getCorrectCount(answers, student1Answer);
		int student2Result = getCorrectCount(answers, student2Answer);
		int student3Result = getCorrectCount(answers, student3Answer);

		List<Map<String, Integer>> result = new ArrayList<>();
		Map<String, Integer> student1 = new HashMap<>();
		student1.put("studentNumber", 1);
		student1.put("correctCount", student1Result);
		result.add(student1);
		if (result.get(0).get("correctCount") < student2Result) {
			Map<String, Integer> student2 = new HashMap<>();
			student2.put("studentNumber", 2);
			student2.put("correctCount", student2Result);

			result.clear();
			result.add(student2);
		} else if (result.get(0).get("correctCount") == student2Result) {
			Map<String, Integer> student2 = new HashMap<>();
			student2.put("studentNumber", 2);
			student2.put("correctCount", student2Result);

			result.add(student2);
		} 
        if (result.get(0).get("correctCount") < student3Result) {
			Map<String, Integer> student3 = new HashMap<>();
			student3.put("studentNumber", 3);
			student3.put("correctCount", student3Result);

			result.clear();
			result.add(student3);
		} else if (result.get(0).get("correctCount") == student3Result) {
			Map<String, Integer> student3 = new HashMap<>();
			student3.put("studentNumber", 3);
			student3.put("correctCount", student3Result);

			result.add(student3);
		}

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
}
