function solution(maps) {
    let answer = -1
    const dx = [0, 0, 1, -1]
    const dy = [1, -1, 0, 0]

    const q = [[0, 0, 1]]
    while (q.length !== 0) {
        const [y, x, count] = q.shift()
        if (y === maps.length - 1 && x === maps[0].length - 1) {
            answer = count
            break
        }
        for (let i = 0; i < 4; i++) {
            const yp = y + dy[i]
            const xp = x + dx[i]

            if (yp < 0 || xp < 0 || xp >= maps[0].length || yp >= maps.length) {
                continue
            }
            if (maps[yp][xp] == 0) {
                continue
            }
            if (maps[yp][xp] == 2) {
                continue
            }
            maps[yp][xp] = 2
            q.push([yp, xp, count + 1])
        }
    }
    return answer
}
