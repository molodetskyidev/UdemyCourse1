 
public class Hello {
public static void main(String [] args) {
	String myName;
	myName="Alex";
	int value=0;
	while (value<5) {
	System.out.println(value+". Hello, " + myName);
	value=value+1;
	}
	System.out.println("----------------------------");
	for(int i=0;i<5;i++) {
		System.out.println(i+". Hello, " + myName);
	}
}
}
