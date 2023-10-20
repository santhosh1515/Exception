package Java8;

public class StaticEx {
static int counter=0;
public StaticEx() {
	counter++;
	System.out.println(counter);
}
static {
	System.out.println("this bis java 8");
}
}
