package breaker;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame frame=new JFrame();
		Gameplay gamePlay=new Gameplay();
		frame.setTitle("Brick Breaker");
		frame.setBounds(10,10,700,600);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(gamePlay);
	}
	

}
