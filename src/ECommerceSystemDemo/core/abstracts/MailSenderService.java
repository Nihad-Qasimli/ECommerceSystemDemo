package ECommerceSystemDemo.core.abstracts;

import ECommerceSystemDemo.entities.concretes.User;

public interface MailSenderService {
  public void sendMail(User user);
}
