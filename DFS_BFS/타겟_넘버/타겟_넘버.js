function solution(numbers, target) {
    return numbers
        .reduce(
            (acc, number) => [
                ...acc.map((e) => e + number),
                ...acc.map((e) => e - number),
            ],
            [0]
        )
        .filter((e) => e === target).length
}
