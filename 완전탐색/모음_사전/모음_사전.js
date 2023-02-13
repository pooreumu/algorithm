function solution(word) {
    const sample = ['A', 'E', 'I', 'O', 'U']

    const add = (arr) => {
        const result = []
        for (let i = 0; i < 5; i++) {
            result.push(...arr.map((v) => v + sample[i]))
        }
        return result
    }

    for (let i = 0; i < 4; i++) {
        sample.push(...add(sample))
    }

    const mySet = new Set(sample)
    const dictionary = [...mySet].sort()
    return dictionary.indexOf(word) + 1
}
