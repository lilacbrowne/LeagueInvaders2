import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders2 {
	LeagueInvaders2() {
		this.frame = new JFrame();
		GP = new GamePanel();
	}

	final static int width = 500;
	final static int height = 800;
	JFrame frame;
	GamePanel GP;

	public static void main(String[] args) {
		LeagueInvaders2 LI = new LeagueInvaders2();
		LI.setup();
	}

	void setup() {
		frame.addKeyListener(GP);
		frame.getContentPane().setPreferredSize(new Dimension(500, 800));
		frame.pack();
		frame.add(GP);
		frame.setVisible(true);
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GP.startGame();
	}
}
