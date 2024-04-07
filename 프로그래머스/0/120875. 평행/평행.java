class Solution {
    public int solution(int[][] dots) {
        for (int i = 0; i < dots.length; i++) {
            for (int j = i+1; j < dots.length; j++) {
                int a = -1;
                int b = -1;
                
                for(int k = 0; k<4; k++){
                    if(k != i && k != j) {
                        if(a == -1) {
                            a = k;
                        } else {
                            b = k;
                        }
                    }
                }
                if(
                    (double)(dots[i][0] - dots[j][0])/(double)(dots[i][1] - dots[j][1]) == 
                    (double)(dots[a][0] - dots[b][0])/(double)(dots[a][1] - dots[b][1])
                ) {
                    return 1;
                }
            }
        }
        return 0;
    }
}