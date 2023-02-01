function solution(elements) {
    const answer = new Set()

    for (let i = 1; i <= elements.length; i++) {
        ;[...elements, ...elements].forEach((v, idx, origin) => {
            const continuousSubsequenceSum = getContinuousSubsequenceSum(
                idx,
                i,
                origin
            )
            if (!isNaN(continuousSubsequenceSum)) {
                answer.add(continuousSubsequenceSum)
            }
        })
    }

    return answer.size
}

function getContinuousSubsequenceSum(idx, size, arr) {
    let continuousSubsequenceSum = 0
    for (let i = idx; i < idx + size; i++) {
        continuousSubsequenceSum += arr[i]
    }
    return continuousSubsequenceSum
}
