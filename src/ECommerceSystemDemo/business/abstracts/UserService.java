package ECommerceSystemDemo.business.abstracts;

import ECommerceSystemDemo.entities.concretes.User;

import java.util.List;

public interface UserService {
 public void signIn(List<User> users,User signInUser);
 public void signUp(User user);
 public void signUpWithService(User user);

}
