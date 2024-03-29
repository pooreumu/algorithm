function solution(sticker) {
    if (sticker.length === 1) return sticker[0]

    const dp1 = new Array(sticker.length).fill(0)
    const dp2 = new Array(sticker.length).fill(0)

    dp1[0] = sticker[0]
    dp1[1] = dp1[0]
    for (let i = 2; i < sticker.length - 1; i++) {
        dp1[i] = Math.max(dp1[i - 2] + sticker[i], dp1[i - 1])
    }

    dp2[1] = sticker[1]
    for (let i = 2; i < sticker.length; i++) {
        dp2[i] = Math.max(dp2[i - 2] + sticker[i], dp2[i - 1])
    }

    return Math.max(dp1[sticker.length - 2], dp2[sticker.length - 1])
}
