package Java8;

@FunctionalInterface;
public interface Calcukator {
public int find(int a,int v);
public static  int mul(int a,int b) {
	return a+b;
}
public default void pro() {
	System.out.println("wlcm");
}
}
