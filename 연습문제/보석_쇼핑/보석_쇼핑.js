function solution(gems) {
    const deduplicatedGemsLength = new Set(gems).size
    const gemsCount = new Map()
    let left = 0
    let right = 0
    let len = Number.MAX_SAFE_INTEGER
    let answer = [0, gems.length - 1]

    while (right < gems.length) {
        const gem = gems[right]

        gemsCount.set(gem, (gemsCount.get(gem) || 0) + 1)

        while (gemsCount.size === deduplicatedGemsLength) {
            if (right - left < len) {
                len = right - left
                answer = [left, right]
            }

            const leftGem = gems[left]
            gemsCount.set(leftGem, gemsCount.get(leftGem) - 1)
            if (gemsCount.get(leftGem) === 0) {
                gemsCount.delete(leftGem)
            }

            left++
        }

        right++
    }

    return [answer[0] + 1, answer[1] + 1]
}
