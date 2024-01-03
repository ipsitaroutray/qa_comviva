package mail_test;

import static org.junit.Assert.*;

import org.junit.Test;

import mail_java.Q2_mail_validate;

public class Q2_mail_validate_test {
	
	Q2_mail_validate emailValidator = new Q2_mail_validate();
	 
    @Test
    public void testIsValidEmail() {
        assertTrue(emailValidator.isValidEmail("user@example.com"));
        assertFalse(emailValidator.isValidEmail("u  ser@example.com"));
        assertFalse(emailValidator.isValidEmail("invalid_email"));
        assertFalse(emailValidator.isValidEmail(null));
    }
 
    @Test
    public void testIsCorporateEmail() {
    	assertTrue(emailValidator.isValidEmail("employee@company.com"));
        assertFalse(emailValidator.isCorporateEmail("user@example.com"));
        assertTrue(emailValidator.isCorporateEmail("employee@company.com"));
        assertFalse(emailValidator.isCorporateEmail(null));
    }
 
//    @Test
//    void testIsValidEmailWithAssertions() {
//        // Using assertAll to group multiple assertions in a single test
//        assertAll("isValidEmail",
//                () -> assertTrue(emailValidator.isValidEmail("user@example.com")),
//                () -> assertFalse(emailValidator.isValidEmail("invalid_email")),
//                () -> assertFalse(emailValidator.isValidEmail(null))
//        );
//    }
// 
//    @Test
//    void testIsCorporateEmailWithAssertions() {
//        // Using assertAll to group multiple assertions in a single test
//        assertAll("isCorporateEmail",
//                () -> assertFalse(emailValidator.isCorporateEmail("user@example.com")),
//                () -> assertTrue(emailValidator.isCorporateEmail("employee@company.com")),
//                () -> assertFalse(emailValidator.isCorporateEmail(null))
//        );
//    }
 
    @Test
    public void testIsValidEmailWithMessage() {
        // Using assertWithMessage to provide a custom failure message
        assertTrue("Valid email should return true",emailValidator.isValidEmail("user@example.com"));
        assertFalse("Invalid email should return false",emailValidator.isValidEmail("invalid_email"));
        assertFalse("Null email should return false",emailValidator.isValidEmail(null));
    }
}
