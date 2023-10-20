package ExceptionCls;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FilenotFoundExcep {
	public static void main(String[]args) throws IOException {
		File a=new File("C:\\Users\\HP\\Desktop\\san.txt");
		FileReader ab=new FileReader(a);
		int temp=0;
		while((temp=ab.read())!=-1) {
			System.out.println((char)(temp));
		}
		System.out.print((char)(temp));
	}

}
