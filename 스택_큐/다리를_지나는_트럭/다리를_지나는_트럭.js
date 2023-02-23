function solution(bridge_length, weight, truck_weights) {
    const bridge = Array.from({ length: bridge_length }, () => 0)
    let time = 0
    let bridgeWeight = 0
    while (true) {
        if (bridgeWeight === 0 && truck_weights.length === 0) return time
        time++
        bridgeWeight -= bridge.shift()

        if (bridgeWeight + truck_weights[0] <= weight) {
            const curTruck = truck_weights.shift() || 0
            bridge.push(curTruck)
            bridgeWeight += curTruck
            continue
        }
        bridge.push(0)
    }
}
