
interface InterfaceName1 {
       void display();
}
interface InterfaceName2 {
    void color();
}
class Test implements InterfaceName1,InterfaceName2{
	public void display() {
		System.out.println("We Display here ");
	}
	public void color() {
		System.out.println("in balck color ");
	}
	public static void main(String args[]) {
		Test T = new Test();
		T.display();
		T.color();

	}
}