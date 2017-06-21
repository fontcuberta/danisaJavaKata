package replaceConstantsWithEnum;

public class QualityCalculator {
    private int score = 0;

    public void rateLocation(String quality){
        if (quality == Quality.Excellent){
            score += 10;
        }
        if (quality == Quality.Good){
            score += 7;
        }
        if (quality == Quality.Bad){
            score -= 2;
        }
        if (quality == Quality.Terrible){
            score -= 10;
        }
    }

    public void rateFacilities(String quality){
        if (quality == Quality.Excellent){
            score += 2;
        }
        if (quality == Quality.Good){
            score += 1;
        }
        if (quality == Quality.Bad){
            score -= 1;
        }
        if (quality == Quality.Terrible){
            score -= 2;
        }
    }

    public int getScore() {
        return score;
    }
}
