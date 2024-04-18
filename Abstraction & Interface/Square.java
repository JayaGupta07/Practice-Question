
abstract class Shape {
       abstract void display();
       abstract void color();
}
 class Rectangle extends Shape{
	  void display() {
		  System.out.println("We Draw rectangle here: ");
	}
	  void color() {
		  System.out.println("We draw reactangle in Black color. ");
	  }
 }
 class Square extends Shape{
	 void display() {
		  System.out.println("We Draw Square here: ");
	}
	  void color() {
		  System.out.println("We draw reactangle in red color. ");
	  }

	 public static void main(String args[]) {
	    Rectangle R= new Rectangle();
	    Square S = new Square();
	    R.display();
	    R.color();
	    S.display();
	    S.color();
	 }
 }