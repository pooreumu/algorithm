function solution(n, t, m, p) {
    let count = 0;
    let result = "";
    for (let i = 0; i < 10000000000; i++) {
        const radix = i.toString(n);
        for (let j = 0; j < radix.length; j++) {
            if ((count % m) + 1 === p) {
                radix[j].match(/[a-z]/)
                    ? (result += radix[j].toUpperCase())
                    : (result += radix[j]);
            }
            if (result.length === t) return result;
            count++;
        }
    }
}
