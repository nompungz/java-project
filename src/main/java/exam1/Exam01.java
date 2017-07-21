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
                return "Fifteen-Fifteen";
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
                return "Thirty-Thirty";
            if (scoreB == 3)
                return "FThirty-Forty";
        }
        if (scoreA == 3) {
            if (scoreB == 0)
                return "Forty-Love";
            if (scoreB == 1)
                return "Forty-Fifteen";
            if (scoreB == 2)
                return "Forty-Thirty";
        }

        if (scoreA == 4) {
            return "Win for " + nameFirst;
        }
        if (scoreB == 4){
            return "Win for " + nameSecond;
        }
        return "Love-All";
    }


}
