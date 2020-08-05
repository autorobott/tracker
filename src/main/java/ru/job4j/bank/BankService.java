package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
        //users.put(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> buff = users.get(user);
            if (buff.contains(account)) {
                buff.add(account);
                users.put(user, buff);
            }
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User buff1 : users.keySet()) {
            if (buff1.equals(passport)) {
                rsl = buff1;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        List<Account> account = users.get(user);
        for (Account buff1 : account) {
            if (buff1.equals(requisite)) {
                rsl = buff1;
                break;
            }
        }
    return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);
        if (srcAccount != null && destAccount != null) {
            int srcIndex = users.get(srcUser).indexOf(srcAccount);
            int destIndex = users.get(destUser).indexOf(destAccount);
            double srcBalance = srcAccount.getBalance();
            double destBalance = destAccount.getBalance();
            if ((srcBalance - amount) >= 0) {
                srcBalance = -amount;
                destBalance = +amount;
                srcAccount.setBalance(srcBalance);
                destAccount.setBalance(destBalance);
                List<Account> srcList = users.get(srcUser);
                List<Account> destList = users.get(destUser);
                srcList.add(srcIndex, srcAccount);
                destList.add(destIndex, destAccount);
                users.put(srcUser, srcList);
                users.put(destUser, destList);
                rsl = true;
            }
        }
        return rsl;
    }



}
