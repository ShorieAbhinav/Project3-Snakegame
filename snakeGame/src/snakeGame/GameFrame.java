package snakeGame;



import javax.swing.JFrame;
/**
 * This class represents the game Frame for the Snake Game.
 * Author: Abhinav Shorie
 */

public class GameFrame extends JFrame {
	
	GameFrame(){
		this.add(new GamePanel());
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}

}
