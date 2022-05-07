package ECommerceSystemDemo.business.concretes;

import ECommerceSystemDemo.business.abstracts.UserValidatorService;
import ECommerceSystemDemo.entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidatorManager implements UserValidatorService {

    List<String> listOfEmails = new ArrayList<>();

    @Override
    public boolean checkEMail(User user) {

        String EMailFormat = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(EMailFormat);
        Matcher matcher = pattern.matcher(user.geteMail());

        if (!matcher.matches()) {
            System.out.println("not a valid email fotmat");
            return false;
        }
        return true;

    }

    @Override
    public boolean checkPassword(User user) {

        if (user.getPassword().length() < 8) {
            System.out.println("password cannot be less than 8 characters");
            return false;
        }

        return true;
    }

    @Override
    public boolean checkName(User user) {

        if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
            System.out.println("firstname or lastname cannot be less than 2 characters");
            return false;
        }
        return true;


    }

    @Override
    public boolean uniqueEMail(User user) {
        if (listOfEmails.contains(user.geteMail())) {
            System.out.println("this email has already been used before");
            return false;
        }
        return true;
    }

    @Override
    public boolean isValid(User user){

        if (checkEMail(user) && checkName(user) && checkPassword(user) && uniqueEMail(user)){
            return true;
        }


        return false;
    }
}
