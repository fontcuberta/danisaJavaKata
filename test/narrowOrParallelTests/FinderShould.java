package narrowOrParallelTests;

import narrowOrParallel.finder.Finder;
import narrowOrParallel.finder.UserRepository;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FinderShould {

    @Test
    public void find_users_by_querying_profile() throws Exception {
        UserRepository repository = new UserRepository();
        Finder finder = new Finder(repository);

        assertThat(finder.find("programmer").size())
                .isEqualTo(1);
    }
}
