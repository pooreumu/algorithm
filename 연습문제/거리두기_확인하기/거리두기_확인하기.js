function solution(places) {
    return places.map((place) => {
        return place
            .reduce((acc, e, r) => {
                return [
                    ...acc,
                    ...e
                        .split('')
                        .map((v, c) => {
                            return [r, c]
                        })
                        .filter(([r, c]) => {
                            return place[r][c] === 'P'
                        }),
                ]
            }, [])
            .every(([r1, c1], i, origin) => {
                return origin.every(([r2, c2]) => {
                    if (r1 === r2 && c1 === c2) return true
                    if (Math.abs(r1 - r2) + Math.abs(c1 - c2) > 2) return true
                    if (r1 === r2) {
                        const bigger = c1 > c2 ? c1 : c2
                        if (place[r1][bigger - 1] === 'X') return true
                    }
                    if (c1 === c2) {
                        const bigger = r1 > r2 ? r1 : r2
                        if (place[bigger - 1][c1] === 'X') return true
                    }
                    return place[r1][c2] === 'X' && place[r2][c1] === 'X'
                })
            })
            ? 1
            : 0
    })
}
