package ExceptionCls;

public class StringIndexOutOfBoundExcep {
public static void main(String[]args) {
	System.out.println("byee");
	String  num="tn72";
	try {
	System.out.println(num.charAt(7));
}
	//catch(Exception a) {
		//a.printStackTrace();
	//}
	finally{
		System.out.println("out of bound");
	}
	System.out.println("hiii");
	}
}
