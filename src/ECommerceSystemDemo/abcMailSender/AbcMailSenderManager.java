package ECommerceSystemDemo.abcMailSender;

import ECommerceSystemDemo.entities.concretes.User;

public class AbcMailSenderManager {

    public void sendMail(User user){
        System.out.println("please, check your email : "+user.geteMail());
    }
}
