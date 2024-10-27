class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        int[] DP = new int[n+1];
        DP[0] = 1;


        for (int m : money) {
            for (int i = m; i <= n; i++) {
                DP[i] += DP[i - m];
            }
        }
        return DP[n];
    }
}