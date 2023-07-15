function solution(tickets) {
    const graph = {}
    tickets.forEach(([start, end]) => {
        if (graph[start]) {
            graph[start].push(end)
        } else {
            graph[start] = [end]
        }
    })

    for (const key in graph) {
        graph[key].sort()
    }

    const result = []

    function dfs(node) {
        const destinations = graph[node]

        while (destinations && destinations.length > 0) {
            const nextDestination = destinations.shift()
            dfs(nextDestination)
        }

        result.unshift(node)
    }

    dfs('ICN')

    return result
}
