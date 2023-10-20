package Java8;

import java.util.Optional;

public class Optional2 {
public static void main(String[]args) {
	String a="santhosh";
	Optional<String> c=Optional.ofNullable(null);
	System.out.println(c.orElse(" this message"));
	System.out.println(c.orElseThrow(()->new ArithmeticException()));
}
}
