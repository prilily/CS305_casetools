package palindrome_package;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.Test;

class PalindromeTest {

	@Test
	public void palindrometest1() {
		Palindrome p1= new Palindrome();
		assertEquals(true,p1.checkPalindrome("madam"));
	}
	
	@Test
	public void palindrometest2() {
		Palindrome p1= new Palindrome();
		assertEquals(false,p1.checkPalindrome("ruby"));
	}
	
	
	@Test
	public void palindrometest4() {
		Throwable exception =assertThrows(IllegalArgumentException.class,() ->{
				Palindrome p1= new Palindrome();
				assertEquals(true,p1.checkPalindrome(" "));
			
		});
		
		assertEquals("must be supplied a valid input string",exception.getMessage());
	}
}


// https://www.codejava.net/testing/junit-test-exception-examples-how-to-assert-an-exception-is-thrown




	

