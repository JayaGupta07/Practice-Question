
interface I1 {
       void display();
}
interface I2 {
    void color();
}
class Check implements I1,I2{
	public void display() {
		System.out.println("We Display here ");
	}
	public void color() {
		System.out.println("in balck color ");
	}
	public static void main(String args[]) {
		Check C = new Check();
		C.display();
		C.color();

	}
}