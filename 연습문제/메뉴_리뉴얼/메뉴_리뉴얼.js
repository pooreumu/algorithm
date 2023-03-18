function solution(orders, course) {
    const answer = []
    const getCombinations = (arr, selectNumber) => {
        const results = []
        if (selectNumber === 1) return arr.map((el) => [el])

        arr.forEach((fixed, index, origin) => {
            const rest = origin.slice(index + 1)
            const combinations = getCombinations(rest, selectNumber - 1)
            const attached = combinations.map((el) => [fixed, ...el])
            results.push(...attached)
        })

        return results
    }

    for (const courseElement of course) {
        const results = {}
        for (const order of orders) {
            const arr = order.split('')
            for (let combination of getCombinations(arr, courseElement)) {
                combination = combination.sort().join('')
                if (results[combination]) results[combination] += 1
                else results[combination] = 1
            }
        }
        let combinations = []
        for (const result in results) {
            if (results[result] > 1) {
                if (!combinations[0]) combinations.push(result)
                else if (results[combinations[0]] === results[result])
                    combinations.push(result)
                else if (results[combinations[0]] < results[result])
                    combinations = [result]
            }
        }
        answer.push(...combinations)
    }

    return answer.sort()
}
