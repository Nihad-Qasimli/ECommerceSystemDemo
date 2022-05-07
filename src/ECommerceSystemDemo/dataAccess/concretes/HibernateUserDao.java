package ECommerceSystemDemo.dataAccess.concretes;

import ECommerceSystemDemo.dataAccess.abstracts.UserDao;
import ECommerceSystemDemo.entities.concretes.User;

import java.util.List;

public class HibernateUserDao implements UserDao {
    @Override
    public void add(User user) {
      System.out.println("added!"+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("deleted!"+user.getFirstName()+" "+user.getLastName());

    }

    @Override
    public void update(User user) {
        System.out.println("updated!"+user.getFirstName()+" "+user.getLastName());
    }

    @Override
    public User get() {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }
}
