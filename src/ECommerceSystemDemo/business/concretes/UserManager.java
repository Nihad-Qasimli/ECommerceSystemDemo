package ECommerceSystemDemo.business.concretes;

import ECommerceSystemDemo.business.abstracts.UserService;
import ECommerceSystemDemo.business.abstracts.UserValidatorService;
import ECommerceSystemDemo.core.abstracts.MailSenderService;
import ECommerceSystemDemo.core.abstracts.SignUpService;
import ECommerceSystemDemo.entities.concretes.User;

import java.util.List;

public class UserManager implements UserService {
    private UserValidatorService validatorService;
    private MailSenderService mailSenderService;
    private SignUpService signUpService;


    public UserManager(UserValidatorService validatorService, MailSenderService mailSenderService, SignUpService signUpService) {
        this.validatorService = validatorService;
        this.mailSenderService = mailSenderService;
        this.signUpService = signUpService;
    }

    @Override
    public void signIn(List<User> users, User signInUser) {

        for (User user : users){
            if (user.geteMail()==signInUser.geteMail()&&user.getPassword()==signInUser.getPassword()){
                System.out.println("user login was successful");
            }else{
                System.out.println("password or email is wrong");
            }
        }

    }

    @Override
    public void signUp(User user) {
        if (validatorService.isValid(user)) {
            System.out.println("account created");
            mailSenderService.sendMail(user);
        }

    }

    @Override
    public void signUpWithService(User user) {
        if (validatorService.isValid(user)) {
            signUpService.SignUpwithService(user);
        }
    }
}
