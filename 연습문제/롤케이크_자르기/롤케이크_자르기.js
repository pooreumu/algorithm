function solution(topping) {
    const [cuttingLeft, cuttingRight, leftToppingCount, rightToppingCount] =
        topping.reduce(
            (
                [
                    cuttingLeft,
                    cuttingRight,
                    leftToppingCount,
                    rightToppingCount,
                ],
                cur,
                i,
                origin
            ) => {
                cuttingLeft.add(origin[i])
                cuttingRight.add(origin[topping.length - 1 - i])

                leftToppingCount.push(cuttingLeft.size)
                rightToppingCount.push(cuttingRight.size)

                return [
                    cuttingLeft,
                    cuttingRight,
                    leftToppingCount,
                    rightToppingCount,
                ]
            },
            [new Set(), new Set(), [], []]
        )

    return leftToppingCount.reduce(
        (acc, cur, i) =>
            cur === rightToppingCount[rightToppingCount.length - 2 - i]
                ? acc + 1
                : acc,
        0
    )
}
