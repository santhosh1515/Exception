package ExceptionCls;

public class ArrayIndexOutOfBoundExcp {
	public static void main(String[]args) {
		System.out.println("jhaii");
		int[] a= {2,5,4};
		try {
		System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ab) {
			ab.printStackTrace();
		}
		System.out.println("ArrayIndexOutOfBoundException");
	}
}
