package exam1;

public class Exam01 {
    int scoreA = 0;
    int scoreB = 0;
    String nameFirst = "";
    String nameSecond = "";

    public Exam01(String firstPerson, String secondPerson) {
        nameFirst = firstPerson;
        nameSecond = secondPerson;
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
        if(scoreA == 1){
            return "Fifteen-Love";
        }
        if(scoreA == 3){
            return "Forty-Love";
        }
        if(scoreA == 4){
            return "Win for "+nameFirst;
        }
        return "Love-All";
    }

}
