import java.util.Arrays;

public class RootNode {
	public static TreeNode<Character> makeExample() {
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
		          )),
		          new TreeNode('q', Arrays.asList(
			       new TreeNode('u', Arrays.asList(
			        new TreeNode('i', Arrays.asList(
			         new TreeNode('r', Arrays.asList(
			          new TreeNode('e', Arrays.asList(
			            new TreeNode('$')
			      ))
				  ))
			      ))
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
			      	new TreeNode('s', Arrays.asList(
			      	 new TreeNode('$')
			          ))
			          ))
		          
	        	  )),
	      	  new TreeNode('e', Arrays.asList(
	      	    new TreeNode('f', Arrays.asList(
	      	      new TreeNode('$')
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
