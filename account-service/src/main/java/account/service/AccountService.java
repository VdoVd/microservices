package account.service;

import account.domain.Account;
import account.domain.User;

public interface AccountService {
    Account findByName(String accountName);
    Account create(User user);
    void saveChanges(String name,Account update);
}
