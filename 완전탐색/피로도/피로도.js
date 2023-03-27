function solution(k, dungeons) {
    const posibleDungeons = (pirodo, dungeons) => {
        let count = 0
        for (const [minPirodo, feePirodo] of dungeons) {
            if (pirodo >= minPirodo) {
                pirodo -= feePirodo
                count++
            }
        }
        return count
    }

    const getPermutation = (select, arr) => {
        const result = []
        if (select === 1) return arr.map((v) => [v])
        for (const [i, e] of arr.entries()) {
            const rest = [...arr.slice(0, i), ...arr.slice(i + 1)]
            const permutation = getPermutation(select - 1, rest)
            const attached = permutation.map((v) => [e, ...v])
            result.push(...attached)
        }
        return result
    }

    const permutations = getPermutation(dungeons.length, dungeons)
    
    let answer = 0

    for (let permutation of permutations) {
        const result = posibleDungeons(k, permutation)
        if (result > answer) answer = result
    }
    return answer
}
