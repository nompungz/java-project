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
            else if (scoreB == 2)
                return "Love-Thirty";
            else if (scoreB == 3)
                return "Love-Forty";
        }
        else if (scoreA == 1) {
            if (scoreB == 0)
                return "Fifteen-Love";
            else if (scoreB == 1)
                return "Fifteen-All";
            else if (scoreB == 2)
                return "Fifteen-Thirty";
            else if (scoreB == 3)
                return "Fifteen-Forty";
        }
        else if (scoreA == 2) {
            if (scoreB == 0)
                return "Thirty-Love";
            else if (scoreB == 1)
                return "Thirty-Fifteen";
            else if (scoreB == 2)
                return "Thirty-All";
            else if (scoreB == 3)
                return "Thirty-Forty";
        }
        else if (scoreA == 3) {
            if (scoreB == 0)
                return "Forty-Love";
            else if (scoreB == 1)
                return "Forty-Fifteen";
            else if (scoreB == 2)
                return "Forty-Thirty";
            else if (scoreB == 3)
                return "Deuce";
        }


        if (scoreA == 4 && scoreB < 3) {
            return "Win for " + nameFirst;
        }
        else if (scoreB == 4 && scoreA < 3){
            return "Win for " + nameSecond;
        }
        else if (scoreA == scoreB && scoreA >=3){
            return "Deuce";
        }
        else if(scoreA >=4 || scoreB>=4){
            if (scoreA - scoreB == 1){
                return "Advantage Player A";
            }
            else if ( scoreB - scoreA == 1){
                return "Advantage Player B";
            }
            else if ( scoreA - scoreB >= 2){
                return "Win for " + nameFirst;
            }
            else if ( scoreB - scoreA >= 2){
                return "Win for " + nameSecond;
            }

        }
        return "Love-All";
    }


}
