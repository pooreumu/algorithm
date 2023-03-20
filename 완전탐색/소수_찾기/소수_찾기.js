function solution(numbers) {
    const getPermutations = (arr, selectNumber) => {
        const results = []
        if (selectNumber === 1) return arr.map((el) => [el])

        arr.forEach((fixed, index, origin) => {
            const rest = [...origin.slice(0, index), ...origin.slice(index + 1)]
            const permutations = getPermutations(rest, selectNumber - 1)
            const attached = permutations.map((el) => [fixed, ...el])
            results.push(...attached)
        })

        return results
    }

    const mySet = new Set()
    for (let i = 1; i <= numbers.length; i++) {
        const permutation = getPermutations(numbers.split(''), i)
        permutation.forEach((v) => mySet.add(Number(v.join(''))))
    }

    const prime = [...mySet].filter((num) => {
        if (num === 2) return true
        if (num < 2) return false
        for (let i = 2; i <= Math.floor(Math.sqrt(num)); i++) {
            if (num % i === 0) return false
        }
        return true
    })
    return prime.length
}
