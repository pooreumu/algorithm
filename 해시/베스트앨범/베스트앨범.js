function solution(genres, plays) {
    const objByGenre = {}
    const score = {}

    genres.forEach((genre, i) => {
        if (objByGenre[genre]) {
            objByGenre[genre].push([i, plays[i]])
            score[genre] += plays[i]
        } else {
            objByGenre[genre] = [[i, plays[i]]]
            score[genre] = plays[i]
        }
    })

    const result = []
    Object.entries(score)
        .sort((a, b) => b[1] - a[1])
        .forEach((v) => {
            const [genre, counts] = v
            result.push(
                ...objByGenre[genre]
                    .sort((a, b) => b[1] - a[1])
                    .slice(0, 2)
                    .map((v) => v[0])
            )
        })
    return result
}
