package Java8;

public interface Furniture {
public String Model(String a);
public static int Price(int price) {
	return price;
}
public default String isWood(boolean a) {
	if(a==true) {
		return "isWOOD";
	}
	else {
		return "notWood";
	}
}
}
