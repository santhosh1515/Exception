package ExceptionCls;

public class Car {
	public static void main(String[]args)throws AgeException {
		String name="san";
		int Age=21
				;
		if(Age>=25) {
			System.out.println("eligible for drive");
		}
		else {
			throw new AgeException("not eligible");
		}
		long b=9894892289l;
		System.out.println(b);
	}

}
