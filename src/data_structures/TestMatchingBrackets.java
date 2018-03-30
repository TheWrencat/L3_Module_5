package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	private boolean doBracketsMatch(String b) {
		Stack<String> matching = new Stack<String>();
		for( int i = 0; i< b.length(); i++){
			if(b.substring(i, i+1).equals("{")){
				matching.push("{");
			}
			if(b.substring(i, i+1).equals("}")){
				if(matching.size() <= 0){
					return false;
				}
				matching.pop();
			}
		}
		if(matching.size() == 0) {
			return true;
		}else {
		return false;
		}
	}

}