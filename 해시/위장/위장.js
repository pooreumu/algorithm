function solution(clothes) {
    const obj = {}
    for (let cloth of clothes) {
        if (obj[cloth[1]]) obj[cloth[1]] = [...obj[cloth[1]], cloth[0]]
        else obj[cloth[1]] = [cloth[0]]
    }
    const arr = []
    for (let object in obj) {
        arr.push(obj[object].length + 1)
    }
    return arr.reduce((acc, cur) => acc * cur) - 1
}
