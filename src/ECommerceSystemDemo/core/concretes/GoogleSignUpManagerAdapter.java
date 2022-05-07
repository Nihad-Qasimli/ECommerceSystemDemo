package ECommerceSystemDemo.core.concretes;

import ECommerceSystemDemo.core.abstracts.SignUpService;
import ECommerceSystemDemo.entities.concretes.User;
import ECommerceSystemDemo.googleSignUpManager.GoogleSignUpManager;

public class GoogleSignUpManagerAdapter implements SignUpService {
    @Override
    public void SignUpwithService(User user) {

        GoogleSignUpManager googleSignUpManager = new GoogleSignUpManager();
        googleSignUpManager.signUpWithGoogle(user.getFirstName(), user.getLastName(), user.geteMail(), user.getPassword());

    }
}
