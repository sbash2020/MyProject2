package project1stSelenium;

public class controlStatement {

	public static void main(String[] args) throws InterruptedException {
		int x = 5;
		
		if (x==5) {
			System.out.println("Statment will print");
		}
		 if (x>10) {
			 System.out.println("Statement will not print");
		 }
			int y = 10;
			
			if (y==5) {
				System.out.println("Statment will print");
			}	
				else {
				 System.out.println("Statement will not print");
				 }
			
			//Incrementing value by 1 using for loop
	for (x=2; x<5; x++) {
		Thread.sleep(1000);
	System.out.println("Hello World");}
	for (x=20; x<10; x++) {
		Thread.sleep(1000);
		System.out.println(x);}
	
	//decrementing the value by 1 using for loop
	for (y=20; y>10; y--) {
		Thread.sleep(1000);
		System.out.println(y);}
	//decrementing by 2
	for (y=30; y>20; y-=2) {
		Thread.sleep(1000);
		System.out.println(y);}
}

	
}
