package Java8;

public class MaxMethodhref {
public int max(int[] a) {
	int b=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>b) {
			b=a[i];
		}}
		return b;
	
}
public static int min(int[] a) {
	int b=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]<b) {
			b=a[i];
		}}
		return b;
}
}
