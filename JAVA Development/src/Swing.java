import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing {

	public static void main(String[] args) {
		
		new Swing();
	}
	
	public Swing() {
		JFrame f = new JFrame();
		JButton b = new JButton("click");
		b.setBounds(100,100,80,90);
		f.add(b);
		f.setSize(500,500);
		f.setLayout(null);
		f.setVisible(true);
	}

}
