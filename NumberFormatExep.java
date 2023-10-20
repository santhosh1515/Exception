package ExceptionCls;

public class NumberFormatExep {
public static void main(String[]args) {
	System.out.println("haii");
	String num="tn72";
	try {
	int n1=Integer.parseInt(num);
	System.out.println(n1);
}
	catch(Exception a) {
		//System.out.println("ok");
		a.printStackTrace();
	}
	finally{
		System.out.println("this is imporatan message");
	}
	System.out.println("bye");
	}
}
