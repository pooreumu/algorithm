function solution(msg) {
    const dictionary = [
        'A',
        'B',
        'C',
        'D',
        'E',
        'F',
        'G',
        'H',
        'I',
        'J',
        'K',
        'L',
        'M',
        'N',
        'O',
        'P',
        'Q',
        'R',
        'S',
        'T',
        'U',
        'V',
        'W',
        'X',
        'Y',
        'Z',
    ]
    if (msg.length === 1) return [dictionary.indexOf(msg) + 1]
    const answer = []
    for (let i = 0; i < msg.length; i++) {
        let word = msg[i]
        answer[i] = dictionary.indexOf(word) + 1
        for (let j = i + 1; j < msg.length; j++) {
            word += msg[j]
            if (dictionary.indexOf(word) === -1) {
                dictionary.push(word)
                break
            }
            answer[i] = dictionary.indexOf(word) + 1
        }
        if (dictionary[dictionary.length - 1] !== word) i += word.length - 1
        else if (word.length - 2 > 0) i += word.length - 2
    }

    return answer.filter(Boolean)
}
