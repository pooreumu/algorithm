function solution(topping) {
    let result = 0
    const cuttingLeft = new Set()
    const cuttingRight = new Set()
    const leftToppingCount = []
    const rightToppingCount = []
    for (let i = 0; i < topping.length; i++) {
        cuttingLeft.add(topping[i])
        cuttingRight.add(topping[topping.length - 1 - i])

        leftToppingCount.push(cuttingLeft.size)
        rightToppingCount.push(cuttingRight.size)
    }

    for (let i = 0; i < leftToppingCount.length; i++) {
        if (
            leftToppingCount[i] ===
            rightToppingCount[rightToppingCount.length - 2 - i]
        )
            result++
    }

    return result
}
