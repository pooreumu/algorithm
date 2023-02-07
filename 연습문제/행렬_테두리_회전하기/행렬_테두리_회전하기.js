function solution(rows, columns, queries) {
    const answer = []
    const arr = []
    let num = 1
    for (let i = 0; i < rows; i++) {
        const rowOfArr = []
        for (let j = 1; j <= columns; j++) {
            rowOfArr.push(num)
            num++
        }
        arr.push(rowOfArr)
    }
    for (query of queries) {
        const q = []
        q.push(arr[query[0] - 1][query[1] - 1])
        const basket = []
        basket.push([arr[query[0] - 1][query[1] - 1]])

        for (let i = query[1]; i < query[3] - 1; i++) {
            q.push(arr[query[0] - 1][i])
            basket.push(arr[query[0] - 1][i])
            arr[query[0] - 1][i] = q.shift()
        }
        for (let i = query[0] - 1; i < query[2] - 1; i++) {
            q.push(arr[i][query[3] - 1])
            basket.push(arr[i][query[3] - 1])
            arr[i][query[3] - 1] = q.shift()
        }
        for (let i = query[3] - 1; i > query[1] - 1; i--) {
            q.push(arr[query[2] - 1][i])
            basket.push(arr[query[2] - 1][i])
            arr[query[2] - 1][i] = q.shift()
        }
        for (let i = query[2] - 1; i > query[0] - 2; i--) {
            q.push(arr[i][query[1] - 1])
            basket.push(arr[i][query[1] - 1])
            arr[i][query[1] - 1] = q.shift()
        }
        answer.push(Math.min(...basket))
    }
    return answer
}
