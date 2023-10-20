package ExceptionCls;

public class ArthimaticExcp {
public static void main(String[]args) {
	System.out.println("hi");
	int a=20;
	
	int b=0;
	try {
	System.out.println(a/b);
	}
	catch(Exception ab) {
		System.out.println("Dont divied num 0");
		//System.out.println(ab);
		//ab.printStackTrace();
	}
	System.out.println("bye");
}
}
