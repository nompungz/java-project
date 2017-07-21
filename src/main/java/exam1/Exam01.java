package exam1;

public class Exam01 {
    int scoreA = 0;
    int scoreB = 0;


    public Exam01(String firstPerson, String secondPerson) {
    }


    public void playerAWin() {
        scoreA++;
    }

    public void playerBWin() {
        scoreA++;
    }

    public String getScore() {
        if(scoreA == 1){
            return "Fifteen-Love";
        }
        if(scoreA == 2){
            return "Thirty-Love";
        }

        return "Love-All";
    }

}
