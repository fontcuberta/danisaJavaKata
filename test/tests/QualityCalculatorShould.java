package tests;

import org.junit.Test;
import replaceConstantsWithEnum.Quality;
import replaceConstantsWithEnum.QualityCalculator;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QualityCalculatorShould {

    @Test
    public void calculate_score() throws Exception {
        QualityCalculator calculator = new QualityCalculator();
        calculator.rateFacilities(Quality.Excellent);
        calculator.rateLocation(Quality.Excellent);

        assertThat(calculator.getScore()).isEqualTo(12);
    }
}
