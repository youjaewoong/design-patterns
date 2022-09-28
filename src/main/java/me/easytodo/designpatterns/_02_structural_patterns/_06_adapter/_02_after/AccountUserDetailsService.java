package me.easytodo.designpatterns._02_structural_patterns._06_adapter._02_after;

import me.easytodo.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetails;
import me.easytodo.designpatterns._02_structural_patterns._06_adapter._02_after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

	//adaptee에 해당하는 class
    private AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        return new AccountUserDetails(accountService.findAccountByUsername(username));
    }
}
