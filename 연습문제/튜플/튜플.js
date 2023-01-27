function solution(s) {
    return s
        .slice(2, s.length - 2)
        .split('},{')
        .map((v) => v.split(','))
        .sort((a, b) => a.length - b.length)
        .map((v, i, ori) =>
            i === 0
                ? Number(...v)
                : Number(...v.filter((e) => !ori[i - 1].includes(e)))
        )
}
