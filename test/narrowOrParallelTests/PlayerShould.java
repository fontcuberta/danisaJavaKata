package narrowOrParallelTests;

import narrowOrParallel.constructorFusion.Player;
import narrowOrParallel.constructorFusion.Role;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class PlayerShould {
    @Test
    public void increase_score_when_dragon_plays() throws Exception {
        Player player = new Player(Role.Dragon, 1800, 0);

        player.play();

        assertThat(player.getScore()).isEqualTo(20);
    }

    @Test
    public void sets_the_initial_score() throws Exception {
        Player player = new Player(Role.Dragon, 1800, 0);

        assertThat(player.getScore()).isEqualTo(0);
    }
}
