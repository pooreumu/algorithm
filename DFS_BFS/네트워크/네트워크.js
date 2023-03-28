function solution(n, computers) {
    const dfs = (graph, start) => {
        const checked = []
        const willCheck = []

        willCheck.push(start)

        while (willCheck.length !== 0) {
            const node = willCheck.pop()
            if (!checked.includes(node)) {
                checked.push(node)
                willCheck.push(...graph[node].reverse())
            }
        }
        return checked
    }

    const graph = Object.fromEntries(
        computers.map((computer, i) => [
            i,
            computer.reduce((acc, cur, idx) => {
                if (i !== idx && cur) return [...acc, idx]
                return acc
            }, []),
        ])
    )

    let answer = 0

    const isLinked = Array.from({ length: n }, () => false)

    for (let i = 0; i < n; i++) {
        if (!isLinked[i]) {
            dfs(graph, i).forEach((e) => {
                isLinked[e] = true
            })
            answer++
        }
    }
    return answer
}
