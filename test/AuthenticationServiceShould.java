import narrowOrParallel.signatureChange.AuthenticationService;
import narrowOrParallel.signatureChange.Id;
import org.junit.Assert;
import org.junit.Test;

public class AuthenticationServiceShould {

    @Test
    public void distinguish_administrator_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Id adminId = new Id(12345);
        Assert.assertTrue(service.isAuthenticated(adminId));
    }
    @Test
    public void distinguish_non_admin_role() throws Exception {
        AuthenticationService service = new AuthenticationService();
        Id normalUserId = new Id(11111);
        Assert.assertFalse(service.isAuthenticated(normalUserId));
    }
}
