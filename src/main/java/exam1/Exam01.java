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
        scoreB++;
    }

    public String getScore() {

        if (scoreA == 0) {
            if (scoreB == 1)
                return "Love-Fifteen";
            if (scoreB == 2)
                return "Love-Thirty";
            if (scoreB == 3)
                return "Love-Forty";
        }
        if (scoreA == 1) {
            if (scoreB == 0)
                return "Fifteen-Love";
            if (scoreB == 1)
                return "Fifteen-All";
            if (scoreB == 2)
                return "Fifteen-Thirty";
            if (scoreB == 3)
                return "Fifteen-Forty";
        }
        if (scoreA == 2) {
            if (scoreB == 0)
                return "Thirty-Love";
            if (scoreB == 1)
                return "Thirty-Fifteen";
            if (scoreB == 2)
                return "Thirty-All";
            if (scoreB == 3)
                return "Thirty-Forty";
        }
        if (scoreA == 3) {
            if (scoreB == 0)
                return "Forty-Love";
            if (scoreB == 1)
                return "Forty-Fifteen";
            if (scoreB == 2)
                return "Forty-Thirty";
            if (scoreB == 3)
                return "Deuce";
        }

        if (scoreA == 4 && scoreB < 3) {
            return "Win for " + nameFirst;
        }
        if (scoreB == 4 && scoreA < 3){
            return "Win for " + nameSecond;
        }
        if (scoreA == scoreB && scoreA >=3){
            return "Deuce";
        }
        if(scoreA >=4 || scoreB>=4){
            if (scoreA - scoreB == 1){
                return "Advantage Player A";
            }
            if ( scoreB - scoreA == 1){
                return "Advantage Player B";
            }
            if ( scoreA - scoreB >= 2){
                return "Win for " + nameFirst;
            }

        }
        return "Love-All";
    }


}
