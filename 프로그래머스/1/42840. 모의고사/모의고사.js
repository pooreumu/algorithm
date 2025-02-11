function solution(answers) {
    const getCorrectCount = (paper) => {
        return answers.filter((answer, i) => answer === paper[i % paper.length]).length
    }
    
    const correctCounts = 
        [   
            -1,
            getCorrectCount([1,2,3,4,5]),
            getCorrectCount([2,1,2,3,2,4,2,5]),
            getCorrectCount([3,3,1,1,2,2,4,4,5,5]),
        ]
    
    const score = Math.max(...correctCounts)
    const winner = correctCounts
    .map((correctCount,i) => correctCount === score ? i : -1)
    .filter(correctCount => correctCount !== -1)
  
    winner.sort((a,b) => a - b)
    return winner
}