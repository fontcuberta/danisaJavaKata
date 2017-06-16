package narrowOrParallelTests;
import narrowOrParallel.cart.ExternalCartClient;
import org.junit.Assert;
import org.junit.Test;

public class ExternalCartClientTest {


    @Test
    public void singleItem_numberOfProductsInTheCart() throws Exception {
        ExternalCartClient client = new ExternalCartClient();

        Assert.assertEquals("Total price is 50 euro", client.formattedTotalPrice(50));
    }

}
