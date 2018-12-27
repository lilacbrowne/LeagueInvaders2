import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	

	GamePanel() {
		this.time = new Timer(1000 / 60, this);
		
	}

	Timer time;
	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2; 
	int currentState = MENU_STATE; 
	@Override

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
		repaint(); 

		if(currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState(); 
		} else if (currentState == END_STATE) {
			updateEndState(); 
		}
	}

	void startGame() {
		time.start();
	}
	public void paintComponent(Graphics g) {
		
		if(currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g); 
		} else if (currentState == END_STATE) {
			drawEndState(g); 
		}
				

			}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("message to console2");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("message to console1");
		if (e.getKeyCode() == 10) {
			currentState++; 
		}
		
		
		if(currentState > END_STATE){

            currentState = MENU_STATE;
    }


	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("message to console3");
	}
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	void drawMenuState(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(0, 0, LeagueInvaders2.width, LeagueInvaders2.height);
	}
	void drawGameState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, LeagueInvaders2.width, LeagueInvaders2.height);
	}
	void drawEndState(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, LeagueInvaders2.width, LeagueInvaders2.height);
	}

}
