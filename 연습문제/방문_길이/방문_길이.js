function solution(dirs) {
    const move = {
        U: ([x, y]) => {
            return y + 1 <= 5 ? [x, y + 1] : [x, y]
        },
        D: ([x, y]) => {
            return y - 1 >= -5 ? [x, y - 1] : [x, y]
        },
        R: ([x, y]) => {
            return x + 1 <= 5 ? [x + 1, y] : [x, y]
        },
        L: ([x, y]) => {
            return x - 1 >= -5 ? [x - 1, y] : [x, y]
        },
    }
    let coordinate = [0, 0]
    const route = new Set()
    for (let i of dirs) {
        const start = JSON.stringify(coordinate)
        coordinate = move[i](coordinate)
        const end = JSON.stringify(coordinate)
        if (start !== end) {
            route.add(start + end)
            route.add(end + start)
        }
    }
    return route.size / 2
}
