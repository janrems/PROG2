
public class Test {

	public static void main(String[] args) {
		Graf g = Graf.cikel(5);
		g.razporedi(200, 200, 100);
		Okno okno = new Okno();
		okno.pack();
		okno.setVisible(true);
		okno.platno.narisi(g);


	}

}
