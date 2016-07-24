
public class Fibonaci {
public static void main(String[] args) {
	int Three=0;
	int Two=1;
	int One=1;
	System.out.println(Three);
	System.out.println(Two);
	for (int i = 0; i < 23; i++) {
		int num=i%3;
		if (num==0) {
			One=Three+Two;
			System.out.println(One);
		}
		if (num==1) {
			Three=One+Two;
			System.out.println(Three);
		}
		if (num==2) {
			Two=One+Three;
			System.out.println(Two);
		}
		
		
		
		
	}
}
}
