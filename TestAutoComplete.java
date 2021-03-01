import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

class TestAutoComplete {

	TreeNode<Character> example = RootNode.makeExample();
	
	@Test
	public void testSinglePrefix() {
		//fail("Not yet implemented");
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("ace");
		list1.add("acne");
		list1.add("and");
		list1.add("andrew");
		list1.add("acquire");
		assertTrue(checkEqualityOfLists(list1, Autocomplete.candidates(example, "a")), 
				"Failed:Expected result is ace, acne, and, andrew in any order");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("beam");
		list2.add("bees");
		list2.add("bef");
		assertTrue(checkEqualityOfLists(list2, Autocomplete.candidates(example, "b")), 
				"Failed:Expected result is beam, bef in any order");
		
		ArrayList<String> list3 = new ArrayList<String>();
		list3.add("cat");
		list3.add("cow");
		list3.add("cut");
		assertTrue(checkEqualityOfLists(list3, Autocomplete.candidates(example, "c")),
				"Failed:Expected result is cat, cow, cut in any order");
		
	}
	
	@Test
	 public void testDoublePrefix() {
		 ArrayList<String> list1 = new ArrayList<String>();
		 list1.add("ace");
		 list1.add("acne");
		 list1.add("acquire");
		 assertTrue(checkEqualityOfLists(list1, Autocomplete.candidates(example, "ac")), 
				 "Failed:Expected result is ace, acne in any order");
		 
		 ArrayList<String> list2 = new ArrayList<String>();
		 list2.add("and");
		 list2.add("andrew");
		 assertTrue(checkEqualityOfLists(list2, Autocomplete.candidates(example, "an")), 
				 "Failed:Expected result is and, andrew in any order");
		 
		 ArrayList<String> list3 = new ArrayList<String>();
		 list3.add("cat");
		 assertTrue(checkEqualityOfLists(list3, Autocomplete.candidates(example, "ca")), 
				 "Failed:Expected result is cat");
		 
		 ArrayList<String> list4 = new ArrayList<String>();
		 list4.add("cow");
		 assertTrue(checkEqualityOfLists(list4, Autocomplete.candidates(example, "co")),
				 "Failed:Expected result is cow");
		 
		 ArrayList<String> list5 = new ArrayList<String>();
		 list5.add("cut");
		 assertTrue(checkEqualityOfLists(list5, Autocomplete.candidates(example, "cu")),
				 "Failed:Expected result is cut");
	 }
	
	 @Test
	 public void testEmptyPrefix() {
		 
		 ArrayList<String> list1 = new ArrayList<String>();
		 list1.add("ace");
		 list1.add("acne");
		 list1.add("acquire");
		 list1.add("and");
		 list1.add("andrew");
		 list1.add("beam");
		 list1.add("bees");
		 list1.add("bef");
		 list1.add("cat");
		 list1.add("cow");
		 list1.add("cut");
		 assertTrue(checkEqualityOfLists(list1, Autocomplete.candidates(example, "")),
				 "Failed:Expected result is ace, acne, and, andrew, beam, bef, cat, cow, cut in any order");
	 }
	 
	 @Test
	 public void testInvalidPrefix() {
		 ArrayList<String> list1 = new ArrayList<String>();
		 assertEquals(list1, Autocomplete.candidates(example, "deer"), "Failed:Expected result is null");
		 assertEquals(list1, Autocomplete.candidates(example, "bean"), "Failed:Expected result is null");
	 }

	 private static boolean checkEqualityOfLists(List<String> a, List<String> b){
	        
	        if(a == b)
	            return true;
	        
	        if(a == null || b == null)
	            return false;
	        
	        if(a.size() != b.size())
	            return false;
	        
	        Collections.sort(a);
	        Collections.sort(b);
	        
	        return a.equals(b);
	    }
}
