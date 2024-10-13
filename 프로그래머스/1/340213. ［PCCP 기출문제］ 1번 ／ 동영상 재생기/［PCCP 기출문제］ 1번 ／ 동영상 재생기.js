function solution(video_len, pos, op_start, op_end, commands) {
    const doPrev = (posTime) => {
        const newPosTime = posTime - 10
        return newPosTime > 0 ? newPosTime : 0
    }
    
    const doNext = (posTime, videoLenTime) => {
        const newPosTime = posTime + 10
        return newPosTime > videoLenTime ? videoLenTime : newPosTime
    }
    
    const skipOp = (opStartTime, opEndTime, posTime) => {
        if(posTime <= opEndTime && posTime >= opStartTime) {
            return opEndTime
        } else {
            return posTime
        }
    }
    
    const transformToTime = (minuteSecond) => {
        const [minute, second] = minuteSecond.split(':')
        return +minute * 60 + +second
    }
    
    const transformToMinuteSecond = (time) => {
        const minute = parseInt(time / 60).toString().padStart(2,'0')
        const second = (time % 60).toString().padStart(2,'0')
        
        return minute + ':' + second
    }
    
    const videoLenTime = transformToTime(video_len)
    const opStartTime = transformToTime(op_start)
    const opEndTime = transformToTime(op_end)
    
    let posTime = transformToTime(pos)
    posTime = skipOp(opStartTime, opEndTime, posTime)
    
    for (const command of commands) {
        switch (command) {
            case 'next':
                posTime = doNext(posTime, videoLenTime)
                posTime = skipOp(opStartTime, opEndTime, posTime)
                break
            case 'prev':
                posTime = doPrev(posTime, videoLenTime)
                posTime = skipOp(opStartTime, opEndTime, posTime)
                break
            default:
                throw Error()
        }
    }
    
    return transformToMinuteSecond(posTime)
}