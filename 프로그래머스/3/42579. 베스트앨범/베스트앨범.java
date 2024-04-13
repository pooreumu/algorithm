import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	public int[] solution(String[] genres, int[] plays) {
		HashMap<String, Integer> score = new HashMap<>();
		HashMap<String, ArrayList<int[]>> genresMap = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			String genre = genres[i];
			int play = plays[i];

			if (genresMap.containsKey(genre)) {
				genresMap.get(genre).add(new int[] {i, play});
				score.put(genre, score.get(genre) + play);
			} else {
				ArrayList<int[]> list = new ArrayList<>();
				list.add(new int[] {i, play});
				genresMap.put(genre, list);
				score.put(genre, play);
			}
		}

		ArrayList<Integer> result = new ArrayList<>();
		List<Map.Entry<String, Integer>> sortedScore = new ArrayList<>(score.entrySet());
		sortedScore.sort((a, b) -> b.getValue().compareTo(a.getValue()));

		for (Map.Entry<String, Integer> entry : sortedScore) {
			ArrayList<int[]> list = genresMap.get(entry.getKey());
			list.sort((a, b) -> b[1] - a[1]);
			for (int i = 0; i < Math.min(2, list.size()); i++) {
				result.add(list.get(i)[0]);
			}
		}

		return result.stream().mapToInt(i -> i).toArray();
	}
}
