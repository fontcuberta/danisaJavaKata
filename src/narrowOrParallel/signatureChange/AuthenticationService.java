package narrowOrParallel.signatureChange;

public class AuthenticationService {
    public boolean isAuthenticated(Id id) {
        return id.isEqual(12345);
    }
}

