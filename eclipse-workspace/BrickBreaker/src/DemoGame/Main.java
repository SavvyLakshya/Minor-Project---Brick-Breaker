package DemoGame;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    JFrame obj= new JFrame();
GamePlay game= new GamePlay();

obj.setBounds(10,10,700,600);
obj.setTitle("BrickBreaker");
obj.setResizable(false);
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.add(game);

	}

}
