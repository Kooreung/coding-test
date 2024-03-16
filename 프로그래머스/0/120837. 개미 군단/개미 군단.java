class Solution {
    public int solution(int hp) {
        int answer = 0;
        int generalAnts = 5;
        int armyAnts = 3;
        int workerAnts = 1;
        
        while (hp > 4) {
            hp = hp - generalAnts;
            answer++;
        }
        while (hp > 2) {
            hp = hp - armyAnts;
            answer++;
        }
        while (hp > 0) {
            hp = hp - workerAnts;
            answer++;
        }
        
        return answer;
    }
}