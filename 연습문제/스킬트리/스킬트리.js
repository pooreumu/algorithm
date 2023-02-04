function solution(skill, skill_trees) {
    let answer = 0;
    skill_trees.forEach((e) => {
        let skillCheck = 0;
        for (let i = 0; i < e.length; i++) {
            const skillIndex = skill.indexOf(e[i]);
            if (skillIndex !== -1) {
                if (skillIndex === skillCheck) skillCheck++;
                else break;
            }
            if (i === e.length - 1) answer++;
        }
    });
    return answer;
}
