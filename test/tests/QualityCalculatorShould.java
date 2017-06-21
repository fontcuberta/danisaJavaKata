package tests;

import org.junit.Test;
import replaceConstantsWithEnum.Quality;
import replaceConstantsWithEnum.QualityCalculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QualityCalculatorShould {

    @Test
    public void calculate_score() throws Exception {
        QualityCalculator analizer = new QualityCalculator();
        analizer.rateFacilities(Quality.Excellent);
        analizer.rateLocation(Quality.Excellent);

        assertThat(analizer.getScore()).isEqualTo(12);
    }
}
