package hashcode;

public class Scoring {
    private int score = 0;
    private int scoreForFinish;
    Scoring(final int pointsForFinishing) {
        score = 0;
        scoreForFinish = pointsForFinishing;
    }

    public void carFinished(final int timeRemaining) {
        score += scoreForFinish + timeRemaining;
    }

    public int getScore() {
        return score;
    }
}
