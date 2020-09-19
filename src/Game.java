

import java.awt.GridLayout;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Game {

	private static JFrame f; 
	
	private static ArrayList<JButton> buttons = new ArrayList<JButton>();
	
	private static String winner = null;
	
	private static void MyGridLayout(){  
		
	    f = new JFrame();  
	      
	    JButton b1 = new JButton(" "); 
	    buttons.add(b1);
	    JButton b2 = new JButton(" ");
	    buttons.add(b2);
	    JButton b3 = new JButton(" "); 
	    buttons.add(b3);
	    JButton b4 = new JButton(" ");  
	    buttons.add(b4);
	    JButton b5 = new JButton(" ");  
	    buttons.add(b5);
	    JButton b6 = new JButton(" ");
	    buttons.add(b6);
	    JButton b7 = new JButton(" ");
	    buttons.add(b7);
	    JButton b8 = new JButton(" ");
	    buttons.add(b8);
	    JButton b9 = new JButton(" ");  
	    buttons.add(b9);
	    
	    f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);  
	    f.add(b6);f.add(b7);f.add(b8);f.add(b9);  
	  
	    f.setLayout(new GridLayout(3,3));  
	    //setting grid layout of 3 rows and 3 columns  
	  
	    f.setSize(300,300);  
	    f.setVisible(true);  
	    
	}  
	
	public static void main(String[] args) {  
		
		infoBox("Player 1 Is X, Player 2 is O", "Tic Tac Toe", false);
		
	    MyGridLayout();
	    
	    Player player1 = new Player(true, "X");
	    Player player2 = new Player(false, "O");
	    
	    playGame(player1, player2);
	    
	    
	}  
	
	private static void playGame(Player p1, Player p2) {
		
		for (JButton b : buttons) {
			b.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (p1.isPlayerTurn()) {
						b.setText("x");
						b.setEnabled(false);
						p1.changeTurn(false);
						p2.changeTurn(true);
					}
					else if (p2.isPlayerTurn()) {
						b.setText("o");
						b.setEnabled(false);
						p1.changeTurn(true);
						p2.changeTurn(false);
					}
					
					if (testCases()) {
						
						if (winner == "tie") {
							infoBox("You have Tied!. Would you like to play again?", "Tic Tac Toe", true);
						}
						else {
							infoBox("Winner is " + winner + ". Would you like to play again?", "Tic Tac Toe", true);
						}
					}
				}
			});
		}	
		
	}
	
	private static void restartGame() {
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.dispose();
		
		buttons.clear();
		
		infoBox("Player 1 Is X, Player 2 is O", "Tic Tac Toe", false);
		
	    MyGridLayout();
	    
	    Player player1 = new Player(true, "X");
	    Player player2 = new Player(false, "O");
	    
	    playGame(player1, player2);
		
	}
	
	private static boolean testCases() {
		
		if (buttons.get(0).getText() == "x" && buttons.get(1).getText() == "x" && buttons.get(2).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(3).getText() == "x" && buttons.get(4).getText() == "x" && buttons.get(5).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(6).getText() == "x" && buttons.get(7).getText() == "x" && buttons.get(8).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(0).getText() == "x" && buttons.get(3).getText() == "x" && buttons.get(6).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(1).getText() == "x" && buttons.get(4).getText() == "x" && buttons.get(7).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(2).getText() == "x" && buttons.get(5).getText() == "x" && buttons.get(8).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(0).getText() == "x" && buttons.get(4).getText() == "x" && buttons.get(8).getText() == "x" ) {
			winner = "x";
			return true;
		}
		else if (buttons.get(2).getText() == "x" && buttons.get(4).getText() == "x" && buttons.get(6).getText() == "x" ) {
			winner = "x";
			return true;
		}
		
		else if (buttons.get(0).getText() == "o" && buttons.get(1).getText() == "o" && buttons.get(2).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(3).getText() == "o" && buttons.get(4).getText() == "o" && buttons.get(5).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(6).getText() == "o" && buttons.get(7).getText() == "o" && buttons.get(8).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(0).getText() == "o" && buttons.get(3).getText() == "o" && buttons.get(6).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(1).getText() == "o" && buttons.get(4).getText() == "o" && buttons.get(7).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(2).getText() == "o" && buttons.get(5).getText() == "o" && buttons.get(8).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(0).getText() == "o" && buttons.get(4).getText() == "o" && buttons.get(8).getText() == "o" ) {
			winner = "o";
			return true;
		}
		else if (buttons.get(2).getText() == "o" && buttons.get(4).getText() == "o" && buttons.get(6).getText() == "o" ) {
			winner = "o";
			return true;
		}
		
		int i = 0;
		
		for (JButton b : buttons) {
			
			if (!b.isEnabled()) {
				i++;
			}
			
		}
		
		if (i > 8) {
			winner = "tie";
			return true;
		}
		
		return false;
	}
	
	private static void infoBox(String infoMessage, String titleBar, boolean confirm)
    {
		if (confirm) {
			int res = JOptionPane.showConfirmDialog(null, infoMessage, titleBar, JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
			
			if(res == 0) {
		         restartGame();
		      } else if (res == 1) {
		    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    	f.dispose();
		      }
		}
		else {
			JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
		} 
    }


}
