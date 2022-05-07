package ECommerceSystemDemo.core.concretes;

import ECommerceSystemDemo.abcMailSender.AbcMailSenderManager;
import ECommerceSystemDemo.core.abstracts.MailSenderService;
import ECommerceSystemDemo.entities.concretes.User;

public class AbcMailSenderManagerAdapter implements MailSenderService {
    @Override
    public void sendMail(User user) {
        AbcMailSenderManager mailSenderManager= new AbcMailSenderManager();
        mailSenderManager.sendMail(user);

    }
}
