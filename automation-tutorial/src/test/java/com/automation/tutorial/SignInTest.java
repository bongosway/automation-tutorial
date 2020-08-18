package com.automation.tutorial;


import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInTest {


    @Test
    public void can_create_account_successfully(){
        Account bizAccount = CreateAccountForm.create("a@a.com");
        Assert.assertNotNull(bizAccount);
        Assert.assertEquals(bizAccount.getAddress(), "My Address");
    }

   
    @Test
    public void emptytest(){
        
    }
   
} 

/**
* This is a comment from Sheyi
**/

}  

} 
