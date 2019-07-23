package com.automation.tutorial;

/**
 * Created by eatumah on 23/07/2019.
 */
public class CreateAccountForm{

    public static Account create(String email) {
        RegisterAccount.createWithDefault(email);
        return new PersonalAccount();
    }
}
