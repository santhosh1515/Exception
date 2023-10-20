package ExceptionCls;

public class NullPointExcep {
	public static void main(String[]args) {
		System.out.println("hiii");
		String name=null;
		try {
		System.out.println(name.toUpperCase());
	}
		catch(Exception a){
			System.out.println("not define null value");
			System.out.println(a);
			a.printStackTrace();
			
		}
		}

}
