package billiard;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	private Model m;
	private View v;
	private Controller c;
	private Klikk klikk;
	
	public MyFrame() {
		
		this.m = new Model();
		this.v = new View(m);
		this.c = new Controller(v,m);
		this.setLayout(new GridLayout());
		
		this.klikk = new Klikk();
		klikk.setKlikkelve(false);
		this.add(v);
		Thread thread = new Thread(c);
		thread.start();
		
		this.setSize(1000, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
