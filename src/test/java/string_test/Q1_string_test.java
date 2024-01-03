package string_test;

import static org.junit.Assert.*;

import org.junit.Test;

import string_test_java.q1_string;


public class Q1_string_test {
	
	q1_string st=new q1_string();
	@Test
	public void test_reverse() {		
		
        assertNotNull(st.reverse("hello"),"null");
        assertEquals("olleh",st.reverse("hello"));        
	}
	
	@Test
	public void test_palindrome() {
		
        assertTrue(st.isPalindrome("malayalam"));
        assertFalse(st.isPalindrome("hello"));
	}
	
	@Test
	public void test_concatenate() {
		
        assertEquals("hellohello".length(),st.concatenate("hello", "hello").length());
        assertEquals("hellohello",st.concatenate("hello", "hello"));     
        assertNotEquals("hellohello", st.concatenate("hello", "ipsita"));
	}
	
	@Test
	public void test_occurance() {
		
        assertEquals(2,st.countOccurrences("malayalam",'m'));
        assertNotEquals(3, st.countOccurrences("ipsita",'i'));
	}
}
