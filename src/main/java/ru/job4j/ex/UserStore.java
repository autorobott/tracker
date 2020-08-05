package ru.job4j.ex;


public class UserStore {
    public static User findUser(User[] pUser, String pLogin) throws UserNotFoundException{
        User rsl = null;
        for (int index = 0; index < pUser.length; index++) {
            if(pUser[index].getUserName().equals(pLogin)) {
                rsl = pUser[index];
                break;
            }
        }
        if(rsl == null) throw new UserNotFoundException();
        return rsl;
    }

    public static boolean validate(User pUser) throws UserInvalidException {
        boolean rsl = false;
        if (!pUser.isValid() && (pUser.getUserName().length() > 4)) {
            rsl = true;
        } else {
            throw new UserInvalidException();
        };
        return rsl;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Nikola Ovsiannikov", true)
        };
        try {
          if(validate(findUser(users, "Nikola Ovsiannikov"))) System.out.println("This user has an access");
        } catch (UserInvalidException ei) {
            ei.println();
        } catch (UserNotFoundException en) {
            en.println();
        }
    }
}
