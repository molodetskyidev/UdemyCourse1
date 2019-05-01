 
public class Hello {
public static void main(String [] args) {
	String myName;
	myName="Alex";
	int value=0;
	while (value<5) {
	System.out.println(value+". Hello, " + myName);
	if (value==3) {
		System.out.println("OK");
	} else {
		System.out.println("000000000000000000000000");	
	}
	value=value+1;
	}
	System.out.println("----------------------------");
	for(int i=0;i<5;i++) {
		System.out.println(i+". Hello, " + myName);
	}
	
}
}
