// 첫번째 풀이
function solution(arr1, arr2) {
    const answer = Array.from(arr1, () => [...Array.from(arr2[0], () => 0)])
    answer.forEach((e, i) => {
        e.forEach((el, idx) => {
            for (let index = 0; index < arr2.length; index++) {
                answer[i][idx] += arr1[i][index] * arr2[index][idx]
            }
        })
    })
    return answer
}

// 두번째 풀이
function solution(arr1, arr2) {
    const answer = Array.from(arr1, () => [
        ...Array.from(arr2[0], () => 0),
    ]).map((e, i) =>
        e.map((el, idx) =>
            arr2.reduce(
                (acc, cur, index) => acc + arr1[i][index] * arr2[index][idx],
                0
            )
        )
    )
    return answer
}
