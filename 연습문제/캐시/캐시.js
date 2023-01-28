function solution(cacheSize, cities) {
    let executionTime = 0
    const cache = []
    cities.forEach((v) => {
        v = v.toUpperCase()
        const hitIndex = cache.indexOf(v)
        if (hitIndex !== -1) {
            executionTime += 1
            const hit = cache.splice(hitIndex, 1)
            cache.push(...hit)
        } else {
            executionTime += 5
            if (cache.length >= cacheSize) cache.shift()
            if (cache.length < cacheSize) cache.push(v)
        }
    })
    return executionTime
}
