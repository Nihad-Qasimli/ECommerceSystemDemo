package ECommerceSystemDemo.dataAccess.abstracts;

import ECommerceSystemDemo.entities.concretes.User;

import java.util.List;

public interface UserDao {
    void add(User user);
    void delete(User user);
    void update(User user);
    User get();
    List<User> getAll();
}
