function solution(numbers) {
    return numbers.map((number) => {
        if (number % 2 === 0) return number + 1
        number = number
            .toString(2)
            .padStart(number.toString(2).length + 1, '0')
            .split('')
            .reverse()

        number.some((e, i) => {
            if (e === '0') {
                number[i] = '1'
                number[i - 1] = '0'
                return true
            }
            return false
        })

        return +parseInt(number.reverse().join(''), 2)
    })
}
