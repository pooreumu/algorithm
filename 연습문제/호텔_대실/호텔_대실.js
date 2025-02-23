function solution(book_time) {
    const hotelRoom = []
    book_time.sort(
        (a, b) => +a[0].split(':').join('') - +b[0].split(':').join('')
    )

    for (const [startAt, endAt] of book_time) {
        const start = startAt.split(':')
        const end = endAt.split(':')

        const startMinuteTime = getMinuteTime(+start[0], +start[1])
        const endMinuteTime = getMinuteTime(+end[0], +end[1])

        const i = hotelRoom.findIndex((time) => startMinuteTime >= time + 10)

        if (i === -1) {
            hotelRoom.push(endMinuteTime)
        } else {
            hotelRoom[i] = endMinuteTime
        }
    }
    return hotelRoom.length
}

function getMinuteTime(m, s) {
    return m * 60 + s
}
