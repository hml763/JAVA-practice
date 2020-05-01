
public class program9_int_limits {
	public static void main(String[] args) {
		int i = 1000000;
		System.out.println(i*i);
		
		long l = i;
		System.out.println(l*l);
		
		//i 는 int인데 범위를 벗어나서 오버플로우가 발생해 -값이 나옴
		//l은 그대로 나옴
	}
}
