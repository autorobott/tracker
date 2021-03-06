package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> buff = users.get(user);
            if (!buff.contains(account)) {
                buff.add(account);
                users.put(user, buff);
            }
        }
    }

    public User findByPassport(String passport) {
        User rsl = null;
        for (User buff1 : users.keySet()) {
            if (buff1.getPassport().equals(passport)) {
                rsl = buff1;
                break;
            }
        }
        return rsl;
    }

    public Account findByRequisite(String passport, String requisite) {
        Account rsl = null;
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> account = users.get(user);
            for (Account buff1 : account) {
                if (buff1.getRequisite().equals(requisite)) {
                    rsl = buff1;
                    break;
                }
            }
        }
    return rsl;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null) {
            if ((srcAccount.getBalance() - amount) >= 0) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                rsl = true;
            }
        }
        return rsl;
    }



}
