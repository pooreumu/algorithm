class Solution {
	public int solution(int hp) {
		int result = 0;
        
        result += hp / Ant.GENERAL.atk;
        int remainHp = hp % Ant.GENERAL.atk;
        result += remainHp / Ant.MAJOR.atk;
        result += remainHp % Ant.MAJOR.atk;
        
        return result;
	}
}

enum Ant {
	GENERAL("GENERAL", 5),
	MAJOR("MAJOR", 3),
	WORKER_ANT("WORKER_ANT", 1);

	public String name;
	public int atk;

	Ant(String name, int atk) {
		this.name = name;
		this.atk = atk;
	}
}
