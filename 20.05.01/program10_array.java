
public class program10_array {

	public static void main(String[] args) {
		
		int[] alpha_arr = new int[3];	//항상 이런식으로 배열 선언을 해야함
		int bravo_arr[] = {1,2,3};
		int i;
		
		for(i=0;i<alpha_arr.length;i++)
			alpha_arr[i] = bravo_arr[i];
		
		for(i=0;i<alpha_arr.length;i++)
			System.out.print(alpha_arr[i] + " ");
		
		System.out.println();
		
		
		
	}

}
