import java.util.*;

public class HW7 {	

  public static void main(String[] args) {

	// Q1
    System.out.println("Q1 answers");
    System.out.println(bestValue(7, new int[] {}, new int[] {})); // 0
    System.out.println(bestValue(7, new int[] {4}, new int[] {1})); // 4
    System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 1, 5, 2})); // 24
    System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 3, 5, 2})); // 25
    System.out.println(bestValue(7, new int[] {4, 10, 2, 4}, new int[] {3, 5, 5, 2})); // 35
    System.out.println();

	      
    // Q2
    System.out.println("Q2 answers");
    System.out.println(bestValueForFused(4, new int[] {}, new int[] {})); // 0
    System.out.println(bestValueForFused(4, new int[] {4}, new int[] {1})); // 4
    System.out.println(bestValueForFused(4, new int[] {4, 10, 2}, new int[] {3, 1, 5})); // 12
    System.out.println(bestValueForFused(4, new int[] {4, 2, 2}, new int[] {3, 2, 5})); // 14
    System.out.println(bestValueForFused(6, new int[] {4, 2, 1}, new int[] {3, 3, 5})); // 18
    System.out.println(bestValueForFused(6, new int[] {4, 2, 1}, new int[] {3, 2, 9})); // 21
    System.out.println();

    // Q3 (Optional)
    System.out.println("Q3 answers");
    bestPicksForFused(4, new int[] {}, new int[] {}); // []
    bestPicksForFused(4, new int[] {4}, new int[] {1}); // [true]
    bestPicksForFused(4, new int[] {4, 10, 2}, new int[] {3, 1, 5}); // [true, false, false]
    bestPicksForFused(4, new int[] {4, 2, 2}, new int[] {3, 2, 5}); // [false, true, true]
    bestPicksForFused(6, new int[] {4, 2, 1}, new int[] {3, 3, 5}); // [true, true, false]
    bestPicksForFused(6, new int[] {4, 2, 1}, new int[] {3, 2, 9}); // [true, false, true]
    System.out.println();
  }

  
 //-------------------------------------------1-----------------------------------------------

  public static int bestValue(int W, int[] counts, int values[]) {
	  int total=0, temp=0;
	  if(values.length == 0)
		  return 0;
	  
	  mergeSort(values, counts, 0, values.length - 1);
	  //System.out.println("Values sort : "+Arrays.toString(values));
	  //System.out.println("Counts sort : "+Arrays.toString(counts));  
	  
	  if(counts[counts.length-1] > W) {
		  total = values[values.length-1]*W;		  
		  return total;
	  }
		  
	  
	  else if(counts[counts.length-1] <= W) {
		  for(int i=counts.length-1;i>=0;i--) {  
			  total = counts[i]*values[i] + total;
			  W = W-counts[i];
	
			  if(i>0) {
				  if(W-counts[i-1]<=0) { 
					  temp = i-1;
					  break;
				  }
			  }
			  
			  else
				  return total;		  
		  }
		  
		  for(int i=0;i<W;i++) {		  
			  W--;
			  total = values[temp] + total;
			  
			  if(W==0)
				  break;
		  } 
	  }
	   
	  
    return total;
  }
  
  
  //-------------------------------------------2-----------------------------------------------

  public static int bestValueForFused(int W, int[] counts, int values[]) {
	  int cnt=0;
	  
	  int total_2 = 0;
	  boolean[] visited = new boolean[counts.length];

	  ArrayList<Integer> tmp = new ArrayList<Integer>();
	  ArrayList<Integer> counts_2 = new ArrayList<Integer>();
	  ArrayList<Integer> values_2 = new ArrayList<Integer>();
	  	  
	  if(counts.length == 0)
		  return 0;
	      
      for(int i = 0; i <= counts.length; i++) {
          combination(counts, values, counts_2,values_2, visited, 0, i);
      }
      //System.out.println("COUNTS_2 :"+ counts_2);
      //System.out.println("VALUES_2 :"+ values_2);

      for(int i=0;i<counts_2.size();i++) {
    	  if(counts_2.get(i) <= W) {
    		  tmp.add(values_2.get(i));
    		  total_2 = values_2.get(i);
    		  cnt++;
    	  }
      }
      
      if(cnt > 1) 
    	  total_2 = Collections.max(tmp);
            
    return total_2;
  } 
  
  //-----------------------------------3-------------------------------------------------------------

  public static void bestPicksForFused(int W, int[] counts, int values[]) {
	  
	  int cnt=0;
	  int total_2 = 0;
	  boolean[] visited = new boolean[counts.length];
	  
	  ArrayList<Integer> tmp = new ArrayList<Integer>();
	  ArrayList<Integer> counts_2 = new ArrayList<Integer>();
	  ArrayList<Integer> values_2 = new ArrayList<Integer>();
	  ArrayList<Integer> counts_3 = new ArrayList<Integer>();
	  ArrayList<Integer> values_3 = new ArrayList<Integer>();
	  
	  for(int i = 0; i <= counts.length; i++) {
          combination(counts, values, counts_2,values_2, visited, 0, i);
      }	  	 
	  
	  for(int i=0;i<counts_2.size();i++) {
    	  if(counts_2.get(i) <= W) {
    		  tmp.add(values_2.get(i));
    		  total_2 = values_2.get(i);
    		  cnt++;
    	  }
      }
      
      if(cnt > 1) 
    	  total_2 = Collections.max(tmp);  
          
      
	  for(int i = 0; i <= counts.length; i++) {
			combination2(counts, values,counts_3,values_3, visited, 0, i,total_2);
	  }  
   }
  
  
  
 //------------------------------------------- help function 1(Q1)-----------------------------------------------

	public static void mergeSort(int arr[], int arr2[], int start, int length) {
		if(start<length) {
			int mid = (start+length)/2;
			mergeSort(arr, arr2, start, mid);
			mergeSort(arr, arr2, mid+1, length);
			merge(arr, arr2, start, mid, length);
		}
	}
  
   //------------------------------------------- help function 2(Q1)-----------------------------------------------

	public static void merge(int arr[], int arr2[], int start, int mid, int length) {
		int i = start;
		int i2 = start;
		int j = mid+1;
		int j2 = mid+1;
		int k = start;
		int k2 = start;
		int temp[] = new int[arr.length];
		int temp2[] = new int[arr2.length];

		while(i<=mid && j<=length) {
			if(arr[i] < arr[j]) {
				temp[k++] = arr[i++];
				temp2[k2++] = arr2[i2++];

			}
			else {
				temp[k++] = arr[j++];
				temp2[k2++] = arr2[j2++];
			}
		}
		while(i<=mid) {
			temp[k++] = arr[i++];
			temp2[k2++] = arr2[i2++];
		}
		
		while(j<=length) {
			temp[k++] = arr[j++];
			temp2[k2++] = arr2[j2++];
		}
		for(int index=start; index<k; index++) {
			arr[index] = temp[index];
			arr2[index] = temp2[index];
		}
	}
  
   //------------------------------------------- help function 3(Q2, Q3)-----------------------------------------------

	
	public static void combination(int[] counts, int[] values, ArrayList<Integer> counts_2, ArrayList<Integer> values_2, boolean[] visited, int start, int r) {
		int tmp=0, sum=0;

        if(r == 0) {
        	for(int i = 0; i < counts.length; i++) {
                if(visited[i] == true) {
            		tmp = counts[i]+tmp;
            		sum = sum + values[i]*counts[i];
            		
                }
            }
        	
        	counts_2.add(tmp);	
        	values_2.add(sum);        	
        } 
        
        else {
            for(int i = start; i < counts.length; i++) {
                visited[i] = true;
                combination(counts, values, counts_2, values_2, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
	}
	
	 //------------------------------------------- help function 4(Q3)-----------------------------------------------

	public static boolean[] combination2(int[] counts, int[] values, ArrayList<Integer> counts_3, ArrayList<Integer> values_3, boolean[] visited, int start, int r,int total_2) {
		int tmp=0,sum=0;

        if(r == 0) {
        	for(int i = 0; i < counts.length; i++) {
                if(visited[i] == true) {
            		tmp = counts[i]+tmp;
            		sum = sum + values[i]*counts[i];
                }
            }
        	
        	counts_3.add(tmp);
        	values_3.add(sum);        	        	
        	
        	if(total_2 == values_3.get(values_3.size()-1)) {
        		System.out.println(Arrays.toString(visited));
        		return visited;        		
        	}
        } 
        
        else {
            for(int i = start; i < counts.length; i++) {
                visited[i] = true;
                combination2(counts, values, counts_3, values_3, visited, i + 1, r - 1,total_2);
                visited[i] = false;
            }
        }
        
        return visited;
	}
	
	
	
/*       Just for some additional works that I've commited. 
I know these answers are not the best way(especially q3), but I've worked really hard on it to get good grades, and the outcome seems to be correct.
I really hope I could get some credit on it. Thank you professor.




	public static int combination2(int[] counts, int[] values, ArrayList<Integer> counts_2, ArrayList<Integer> values_2, boolean[] visited2, int start, int r, int cnts, int index) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		int pls = 0;
        //System.out.println("Here-------------- : " + ++pls);
		
        if(r == 0) {
        	             
        	for(int i = 0; i < counts.length; i++) {
                if(visited2[i] == true) { // && cnts == index
//                    System.out.println("wat " + wat);

                }

            }
        	cnts++;

            //System.out.println(Arrays.toString(visited2) + "  " + (cnts));

//        	return cnts;
        } 
        
        else {
            for(int i = start; i < counts.length; i++) {
                visited2[i] = true;
                //for(int j=0;j<counts_2.size();j++) {
                //if(values_2.get(i)==index && counts_2.get(i)<=W) {}
                
                
                System.out.println("!! : "+combination2(counts, values, counts_2, values_2, visited2, i + 1, r - 1, cnts, index));
                visited2[i] = false;

            }
            
        }
        return cnts;
        
        //System.out.println(Arrays.toString(visited2) + "check!!!");

        //System.out.println("COUNTS_2 :"+ counts_2);
        //System.out.println("VALUES_2 :"+ values_2);
	}

	
	*/
}
