public class Main {
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	Operator opr = new Operator();

	opr.setX(4);
	opr.setY(4);

	System.out.println(cal.tambah(opr.getX(), opr.getX()));

	System.out.println(cal.kurang(opr.getY(), opr.getY()));

	}
}