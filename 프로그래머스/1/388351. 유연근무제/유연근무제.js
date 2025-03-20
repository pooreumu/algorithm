function solution(schedules, timelogs, startday) {
    let result = 0
    schedules.forEach((schedule, i) => {
        let today = startday
        const isSuccess = timelogs[i].every((timelog) => {
            if (today === 6) {
                today++
                return true
            }
            if (today === 7){
                today = 1
                return true
            }
            today++
            return (convertTime(schedule) + 10) >= convertTime(timelog)
        }) 
        if (isSuccess) result++
    })
    return result
}

function convertTime(n) {
    return n % 100 + parseInt(n / 100) * 60
}