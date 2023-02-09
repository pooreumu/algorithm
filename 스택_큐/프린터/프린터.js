function solution(priorities, location) {
    priorities = priorities.map((v, i) => {
        return {
            index: i,
            value: v,
        }
    })
    let k = true
    let count = 0
    while (k) {
        const sh = priorities.shift()
        const check = priorities.some((v) => sh.value < v.value)
        if (check) priorities.push(sh)
        else {
            k = sh.index === location ? false : true
            count++
        }
    }
    return count
}
