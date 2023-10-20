package Java8;

import java.util.Optional;

public class Optinal {
public static void main(String[]args) {
	String a="san";
	Optional<String> c=Optional.ofNullable(a);
	if(c.isEmpty()) {
		System.out.println(a.toUpperCase());
	}else {
	System.out.println("hdjh");
}}
}
