function solution(land) {
    land.forEach((e, i) => {
        e.forEach((el, idx) => {
            if (i !== 0) {
                let max = 0;
                land[i - 1].forEach((ele, index) => {
                    if (index !== idx) {
                        const num = el + ele;
                        max = max > num ? max : num;
                    }
                });
                land[i][idx] = max;
            }
        });
    });
    return land[land.length - 1].sort((a, b) => b - a)[0];
}
