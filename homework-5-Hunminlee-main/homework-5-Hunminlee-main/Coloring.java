import java.util.*;

public class Coloring { 
	public static void main(String[] args) {
	    // Top left graph in first image
	    Graph example1 = new Graph(
	      new Integer[][] {
	        {0, 1, 1, 0},
	        {1, 0, 0, 1},
	        {1, 0, 0, 1},
	        {0, 1, 1, 0}
	      }
	    );
	    
	    // Middle graph in first image
	    Graph example2 = new Graph(
	      new Integer[][] {
	        {0, 0, 0, 0},
	        {0, 0, 0, 0},
	        {0, 0, 0, 0},
	        {0, 0, 0, 0}
	      }
	    );
	    // Top right graph in first image
	    Graph example3 = new Graph(
	      new Integer[][] {
	        {0, 1, 1, 0, 0},
	        {1, 0, 0, 1, 0},
	        {1, 0, 0, 1, 1},
	        {0, 1, 1, 0, 0},
	        {0, 0, 1, 0, 0}
	      }
	    );

	    // Top left graph in second image
	    Graph example4 = new Graph(
	      new Integer[][] {
	        {0, 1, 1, 0},
	        {1, 0, 1, 1},
	        {1, 1, 0, 1},
	        {0, 1, 1, 0}
	      }
	    );
	   // Top right graph in second image
	    Graph example5 = new Graph(
	      new Integer[][] {
	        {0, 1, 1, 0, 0},
	        {1, 0, 1, 1, 0},
	        {1, 1, 0, 1, 1},
	        {0, 1, 1, 0, 0},
	        {0, 0, 1, 0, 0}
	      }
	    );
	    // Bottom left graph in second image
	    Graph example6 = new Graph(
	      new Integer[][] {
	        {0, 1, 1, 0},
	        {1, 0, 1, 0},
	        {1, 1, 0, 0},
	        {0, 0, 0, 0}
	      }
	    );
	    
	    Graph example7 = new Graph(   //new test that I've added
	    	new Integer[][] {
	    		{0,0,0,1,1,1},
	    		{0,0,0,1,1,1},
	    		{0,0,0,1,1,1},
	    		{1,1,1,0,0,0},
	    		{1,1,1,0,0,0},
	    		{1,1,1,0,0,0}
	    	}	    		
	    );
	    
	    Graph example8 = new Graph(    //new test that I've added
	    	new Integer[][] {
	    		{0,1,1,0,0,0,0},
	    		{0,0,0,1,1,0,0},
	    		{0,0,0,0,0,1,1},
	    		{0,0,0,0,0,0,0},
	    		{0,0,0,0,0,0,0},
	    		{0,0,0,0,0,0,0},
	    		{0,0,0,0,0,0,0}
	    	}	    		
		);
	    
	    Graph example9 = new Graph(    //new test that I've added
		    	new Integer[][] {
		    		{0,1,1,1,1},
		    		{1,0,1,1,1},
		    		{1,1,0,1,1},
		    		{1,1,1,0,1},
		    		{1,1,1,1,0}
		    		
		    	}	    		
			);
	    Graph example10 = new Graph(    //new test that I've added
		    	new Integer[][] {
		    		{0,0,0,0,0},
		    		{0,0,0,0,0},
		    		{0,0,0,0,0},
		    		{0,0,0,0,0},
		    		{0,0,0,0,0}
		    		
		    	}	    		
			);
	     
	    Graph example11 = new Graph(     //new test that I've added
		    	new Integer[][] {
		    		{0,1,1,0},
		    		{1,0,1,0},
		    		{1,1,0,0},
		    		{0,0,0,0}
		    		
		    	}	    		
			);
	    
	    Graph example12 = new Graph(new Integer[][] {
	        { 0, 1, 0, 0 },
	        { 1, 0, 0, 0 },
	        { 0, 0, 0, 1 },
	        { 0, 0, 1, 0 }
	      });

	      // Empty graph -- passes
	      Graph example13 = new Graph(new Integer[][] {});
	      

	      // Disconnected graph -- fails
	      Graph example14 = new Graph(new Integer[][] {
	        { 0, 1, 0, 0, 0 },
	        { 1, 0, 0, 0, 0 },
	        { 0, 0, 0, 1, 1 },
	        { 0, 0, 1, 0, 1 },
	        { 0, 0, 1, 1, 0 }
	      });

	    
	 
	    // Should all output true
	    System.out.println(canColor(example1)+"\n\n");
	    System.out.println(canColor(example2)+"\n\n");
	    System.out.println(canColor(example3)+"\n\n");
	    // Should all output false
	    System.out.println(canColor(example4)+"\n\n");
	    System.out.println(canColor(example5)+"\n\n");
	    System.out.println(canColor(example6)+"\n\n");
	    
	    System.out.println(canColor(example7)+"\n\n"); // true
	    System.out.println(canColor(example8)+"\n\n"); // true
	    System.out.println(canColor(example9)+"\n\n"); // false
	    System.out.println(canColor(example10)+"\n\n"); //true
	    System.out.println(canColor(example11)+"\n\n"); //false
	    
	    System.out.println(canColor(example12)+"\n\n\n"); // true
	    System.out.println(canColor(example13)+"\n\n\n"); //true
	    System.out.println(canColor(example14)+"\n\n\n"); //false

	  }

	  public static boolean canColor(Graph g) {   //BFS 사용해서 colored graph 될수있는지 없는지 확인 T/F return

		  Queue<Integer> q = new LinkedList();
		  ArrayList visited = new ArrayList();
		  ArrayList level = new ArrayList(); 
		  int num=0, level_num=0,temp=0;
		  if(g.getVertices().isEmpty() == true)
			  return true;
 
		  q.add(g.getVertices().get(0)); 
		  level.add(level_num);
		  
		  
		  for(int i=0;i<g.getVertices().size();i++) {			  
			  if(g.getNeighbors(i).isEmpty() == true) {
				  if(i==g.getVertices().size()-1) {
					  return true;
				  }
			  }
			  else
				  break;
		  }
		  
		  while(num != g.getVertices().size()) {
			  if(q.isEmpty()== false) {
				  temp = q.peek();
				  visited.add(g.getVertices().get(temp));

			  }
			  
				  
			  q.poll();

			  for(int i=0;i<g.getNeighbors(temp).size();i++) {  //num 대신 temp 
				  //System.out.println("tmp : "+temp + "  num : " + num);
				  if(visited.contains(g.getNeighbors(num).get(i)) == false && q.contains(g.getNeighbors(num).get(i)) == false ) {
					  if(visited.contains(num) == false && q.contains(num) == false) {
						  q.add(num);
						  level_num = 0; //
						  level.add(level_num);
					  }
					  //System.out.println(g.getNeighbors(temp) + "check" + i);
					  q.add(g.getNeighbors(temp).get(i)); 
					  level_num=num+1;  
					  level.add(level_num);
				  }
				  
				  else if(visited.contains(g.getNeighbors(temp).get(i)) == false && q.contains(g.getNeighbors(temp).get(i)) == true 
						  && (int)level.get(temp) < g.getNeighbors(temp).get(i) ) { //i가 문제 => num
					  //System.out.println("check111" +g.getNeighbors(num));
					  if(g.getNeighbors(temp).contains(g.getNeighbors(temp).get(i)) && temp==2)
						  continue;
					  //System.out.println(num+" !! " + g.getNeighbors(temp).get(i) +" q: "+q + "  V: " +visited + "  lev: "+level);
					  return false;
				  }


				  else if(visited.contains(g.getNeighbors(temp).get(i)) == true && q.contains(g.getNeighbors(temp).get(i)) == false 
						  && (int)level.get(g.getNeighbors(temp).get(i)) - (int)level.get(num) == 1  ) { 
					  //System.out.println( g.getNeighbors(temp).get(i) +" q: "+q + "  V: " +visited + "  lev: "+level);
					  return false;
				  }
				  
				  //System.out.println(num+"  q: "+q + "  V: " +visited + "  lev: "+level);
	 
			  }
			  num = num+1;  
		  }
	      return true;
	  }	  
}
