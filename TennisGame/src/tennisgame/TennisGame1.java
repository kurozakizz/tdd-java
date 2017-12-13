package tennisgame;

public class TennisGame1 implements TennisGame {

    private int player1Score = 0;
    private int player2Score = 0;
    private final String player1Name;
    private final String player2Name;

    private final String[] scores = new String[]{"Love", "Fifteen", "Thirty", "Forty"};

    public TennisGame1(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    @Override
    public void wonPoint(String playerName) {
        if (playerName.equals(player1Name)) {
            player1Score += 1;
        } else {
            player2Score += 1;
        }
    }

    private String setWinner(String playerName) {
        return "Win for " + playerName;
    }

    private String setAdvantage(String playerName) {
        return "Advantage " + playerName;
    }

    @Override
    public String getScore() {
        String score = "";

        final boolean equalScore = (player1Score == player2Score);
        final boolean morethanThirtyScore = player1Score >= 4 || player2Score >= 4;

        if (equalScore) {
            if (player1Score <= 2) {
                score = scores[player1Score] + "-All";
            } else {
                score = "Deuce";
            }
        } else if (morethanThirtyScore) {
            int scoreDifferent = Math.abs(player1Score - player2Score);
            String advantagePlayer = player1Score > player2Score ? player1Name : player2Name;
            if (scoreDifferent == 1) {
                score = setAdvantage(advantagePlayer);
            } else {
                score = setWinner(advantagePlayer);
            }
        } else {
            score = scores[player1Score] + "-" + scores[player2Score];
        }
        return score;
    }
}
