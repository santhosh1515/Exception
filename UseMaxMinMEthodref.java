package Java8;

public class UseMaxMinMEthodref {
	public static void main(String[]args) {
		 MaxMethodhref m=new  MaxMethodhref();
		 MaxminMethodhref a=m::max;
		 int[] b= {10,84,02,845,36};
	System.out.println(a.find(b));
	 MaxminMethodhref c= MaxMethodhref::min;
	 System.out.println(c.find(b));
	}

}
