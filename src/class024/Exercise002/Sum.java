package class024.Exercise002;

public class Sum {

	public static int sum(int num) {
		if(num == 1) {
			return 1;
		}
		return num + sum(num -1);
	}
	
}
