package exam1;

public class Exam01 {
    private int scoreA = 0;
    private int scoreB = 0;
    private String nameFirst = "";
    private String nameSecond = "";
    private String[] sScore ={
            "Love",
            "Fifteen",
            "Thirty",
            "Forty",
            "Deuce",
            "Advantage ",
            "Win for "};

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

        if (IsLoveAll()){
            return String.format("%s-All", getScoreString(scoreA));
        }
        else if (IsNormal()){
            return getScoreString(scoreA)+"-"+getScoreString(scoreB);
        }
        else if (IsDeuce()){
            return sScore[4];
        }
        else if (IsAdvantage()){
            if (scoreA > scoreB){
                return String.format("%s%s", sScore[5], nameFirst);
            }
            else{
                return String.format("%s%s", sScore[5], nameSecond);
            }
        }
        else if (IsWinner()){
            if (scoreA > scoreB){
                return String.format("%s%s", sScore[6], nameFirst);
            }else{
                return String.format("%s%s", sScore[6], nameSecond);
            }
        }
        return "Love-All";
    }




    public String getScoreString(int score){
        return sScore[score];

    }
    public boolean IsLoveAll(){
        if (scoreA == scoreB && scoreA <3){
            return true;
        }
        return false;

    }
    public boolean IsNormal() {
        if (scoreA != scoreB && scoreA<=3 && scoreB<=3){
            return true;
        }
        return false;
    }
    public boolean IsDeuce() {
        if ( scoreA == scoreB && scoreA>=3 && scoreA>=3){
            return true;
        }
        return false;
    }
    public boolean IsAdvantage() {
        if (Math.abs(scoreA-scoreB)==1 ) {
                return true;
        }
        return false;
    }
    public boolean IsWinner() {
        if (Math.abs(scoreA-scoreB) >=2) {
            return true;
        }
        return false;
    }
    
}
