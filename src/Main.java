import ECommerceSystemDemo.business.concretes.UserManager;
import ECommerceSystemDemo.business.concretes.UserValidatorManager;
import ECommerceSystemDemo.core.concretes.AbcMailSenderManagerAdapter;
import ECommerceSystemDemo.core.concretes.GoogleSignUpManagerAdapter;
import ECommerceSystemDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        User user = new User("Aysel", "Temrazova", "pero@gmail.com", "Lavinia<3");
        User user2 = new User("Nihad", "Qasimli", "perolab@gmail.com", "Perolab288r");

        List<User> users=new ArrayList<>();
        users.add(user);
        UserManager userManager = new UserManager(new UserValidatorManager(), new AbcMailSenderManagerAdapter(), new GoogleSignUpManagerAdapter());
        userManager.signUp(user);
        userManager.signUpWithService(user);
        userManager.signIn(users,user);
        userManager.signIn(users,user2);

    }
}

