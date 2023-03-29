function solution(begin, target, words) {
    const dfs = (graph, start) => {
        const checked = []
        const willCheck = [start]

        while (willCheck.length !== 0) {
            const node = willCheck.pop()
            if (!checked.includes(node)) {
                checked.push(node)

                willCheck.push(...graph[node])
            }
        }
        return checked
    }

    const graph = Object.fromEntries(
        [...words, begin].map((word, i, origin) => {
            return [
                word,
                origin.filter((e) => {
                    if (e === word) return false
                    let diffLength = 0
                    e.split('').map((e, i) => {
                        if (e !== word[i]) diffLength++
                    })
                    return diffLength <= 1
                }),
            ]
        })
    )

    const result = dfs(graph, begin).indexOf(target)

    return result > 0 ? result : 0
}
