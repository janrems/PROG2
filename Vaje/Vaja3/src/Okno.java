import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Okno extends JFrame {
	protected Platno platno;

	public Okno(){
		super();
		this.platno = new Platno(600, 600);
		this.setTitle("Graf");
		add(platno);
	}
	
	
	
}
