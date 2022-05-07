package ECommerceSystemDemo.business.abstracts;

import ECommerceSystemDemo.entities.concretes.User;

public interface UserValidatorService {

    public boolean checkEMail(User user);
    public boolean checkPassword(User user);
    public boolean checkName(User user);
    public boolean uniqueEMail(User user);
    public boolean isValid(User user);
}
