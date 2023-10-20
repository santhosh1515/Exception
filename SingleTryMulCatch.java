package ExceptionCls;

public class SingleTryMulCatch {
public static void main(String[]args) {
	String a=null;
	try {
	System.out.println(a.toUpperCase());
}
catch(ArithmeticException b) {
	System.out.println("jifj");
}
catch(NullPointerException c) {
	System.out.println("null pont");
}
	catch(NumberFormatException d) {
		System.out.println("not valid number");
	}
	catch(Exception e)
	system.out.println("handle");
	}
	}
}
