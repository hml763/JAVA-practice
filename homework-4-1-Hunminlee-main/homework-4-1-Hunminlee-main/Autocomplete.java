//Submitted by Hunmin Lee, 2020.10.09

import java.util.*;

public class test2 {

  public static List<String> candidates(TreeNode<Character> root, String prefix) {
	    //throw new UnsupportedOperationException();
	  	List <String> results = new ArrayList();
	  	results = findNode(root, prefix, 0, results);

	  	return results;
  }

  private static List<String> findNode(TreeNode<Character> root, String prefix, int index, List<String> lst){
	  
	  for(TreeNode <Character> child: root.getChildren()) { 
		  if(prefix.length() == index) {			  
			  for(TreeNode <Character> childs: root.getChildren()) {
				  inside(childs, prefix+childs.getValue() ,lst);
			  }
			  return lst;
		  }
		  
		  if(child.getValue() == prefix.charAt(index)) {
			  findNode(child, prefix, index+1,lst);			 
		  }		  		  
	  }

	  return lst;
  }
  
  public static void inside(TreeNode<Character> root, String wordsoFar, List<String> lst) {
	  if(root.getValue() == '$') {
		  lst.add(wordsoFar.substring(0, wordsoFar.length()-1));
	  }
	  
	  else {
		  for(TreeNode <Character> child: root.getChildren()) {
			  inside(child, wordsoFar+child.getValue(), lst);
		  }
	  }
	  
	  
  }
  
  
  
  public static void main(String[] args) {
		TreeNode<Character> example = makeExample();
		    
	    System.out.println(candidates(example, "c")); // Outputs ["cat", "cow", "cut"]  c
	    System.out.println(candidates(example, "ca")); // Outputs ["cat"]
	    System.out.println(candidates(example, "an")); // Outputs ["and", "andrew"]
	 
	    // Outputs ["ace", "acne", "and", "andrew", "beam", "beef", "cat", "cow", "cut"]
	    System.out.println(candidates(example, ""));
	    System.out.println(candidates(example, "deer")); // Outputs []
	    System.out.println(candidates(example, "bean")); // Outputs []
	
	    //List<String> myList = new ArrayList();
	    //allWords(example, myList);
	    //System.out.println(myList);
  }
  
  
  private static TreeNode<Character> makeExample() {
	    return
	      new TreeNode('*', Arrays.asList(
	        new TreeNode('a', Arrays.asList(
	          new TreeNode('c', Arrays.asList(
	            new TreeNode('e', Arrays.asList(
	              new TreeNode('$')
	           )),
	           new TreeNode('n', Arrays.asList(
	              new TreeNode('e', Arrays.asList(
	                new TreeNode('$')
	              ))
	           ))
	         )),
	          new TreeNode('n', Arrays.asList(
	           new TreeNode('d', Arrays.asList(
	             new TreeNode('$'),
	                new TreeNode('r', Arrays.asList(
	                  new TreeNode('e', Arrays.asList(
	                    new TreeNode('w', Arrays.asList(
	                      new TreeNode('$')
	                  ))
	                   ))
	                 ))
	               ))
	             ))
	            )),
	        new TreeNode('b', Arrays.asList(
	          new TreeNode('e', Arrays.asList(
	           new TreeNode('a', Arrays.asList(
	             new TreeNode('m', Arrays.asList(
	               new TreeNode('$')
	               ))
	             )),
	            new TreeNode('e', Arrays.asList(
	              new TreeNode('f', Arrays.asList(
	               new TreeNode('$')
	             ))
	           ))
	         ))
	        )),
	        new TreeNode('c', Arrays.asList(
	          new TreeNode('a', Arrays.asList(
	            new TreeNode('t', Arrays.asList(
	             new TreeNode('$')
	           ))
	         )),
	          new TreeNode('o', Arrays.asList(
	            new TreeNode('w', Arrays.asList(
	             new TreeNode('$')
	           ))
	          )),
	         new TreeNode('u', Arrays.asList(
	            new TreeNode('t', Arrays.asList(
	             new TreeNode('$')
	           ))
	         ))
	       ))
	      ));
	  }
	
}
