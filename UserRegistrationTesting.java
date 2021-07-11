package com.Usergistration;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test case for First name, Last name, Email, Mobile number and Password.
 */
public class UserRegistrationTesting {
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("Shubham");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.firstNameValidate("shubham");
        Assert.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("Patil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.lastNameValidate("patil");
        Assert.assertFalse(result);
    }


    @Test
    public void givenEmail_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("91 8412855655");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.phoneNumberValidate("919752132553");
        Assert.assertFalse(result);
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("tdudAd21$");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse() {
        UserRegistrationRegEx userRegistrationRegEx = new UserRegistrationRegEx();
        boolean result = userRegistrationRegEx.passwordValidate("Jhjsh23#%");
        Assert.assertFalse(result);
    }

}