function solution(files) {
    return files
        .map((file) => {
            let state = 0
            return file.split('').reduce(
                (acc, cur) => {
                    if (!/[0-9]/.test(cur) && state === 0) acc.HEAD.push(cur)
                    else if (/[0-9]/.test(cur) && state === 0) {
                        acc.NUMBER.push(cur)
                        state = 1
                    } else if (/[0-9]/.test(cur) && state === 1)
                        acc.NUMBER.push(cur)
                    else if (!/[0-9]/.test(cur) && state === 1) {
                        acc.TAIL.push(cur)
                        state = 2
                    } else if (state === 2) acc.TAIL.push(cur)
                    return acc
                },
                { HEAD: [], NUMBER: [], TAIL: [] }
            )
        })
        .map((file) => ({
            HEAD: file.HEAD.join(''),
            NUMBER: file.NUMBER.join(''),
            TAIL: file.TAIL.join(''),
        }))
        .sort((a, b) => {
            if (a.HEAD.toUpperCase() > b.HEAD.toUpperCase()) return 1
            else if (a.HEAD.toUpperCase() < b.HEAD.toUpperCase()) return -1
            return +a.NUMBER - +b.NUMBER
        })
        .map((file) => file.HEAD + file.NUMBER + file.TAIL)
}
