function solution(board) {
    let answer = 0
    if (board.length <= 1) {
        return board[0].some((e) => e === 1) ? 1 : 0
    }
    if (board[0].length <= 1) {
        return board.some((e) => e[0] === 1) ? 1 : 0
    }
    for (const [y, ey] of board.entries()) {
        if (y === 0) continue
        for (const [x, ex] of ey.entries()) {
            if (x === 0) continue
            if (!board[y][x]) continue
            const cross = board[y - 1][x - 1]
            const up = board[y - 1][x]
            const left = board[y][x - 1]

            board[y][x] = Math.min(cross, up, left) + 1
            answer = Math.max(board[y][x], answer)
        }
    }
    return answer ** 2
}
