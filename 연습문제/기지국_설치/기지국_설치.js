function solution(n, stations, w) {
    let result = 0
    let stationsIndex = 0
    for (let i = 0; i < n; i++) {
        if (
            stations[stationsIndex] - w - 1 <= i &&
            i <= stations[stationsIndex] + w
        ) {
            i = stations[stationsIndex] + w - 1
            stationsIndex++
            continue
        }
        result++
        i += w * 2
    }
    return result
}
