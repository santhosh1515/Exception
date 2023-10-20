package ExceptionCls;

public class UserDefieExcep  {
public static void main(String[] args)throws AgeException{
	String name="samliya";
	int age=17;
	if(age>=18) {
		System.out.println("wlcm");
	}
	else {
		
		throw new AgeException(" not valid");
	}

	String gender="male";
	System.out.println(gender);
	}
}
