package Graphics.Background;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;

import Graphics.Elements.ElementImage;
import Logic.Background.*;
import Logic.Elements.Characters.Player;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlayFrame extends JFrame 
  {protected MapPanel panel;
   protected Play play;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayFrame frame = new PlayFrame(new Play());
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlayFrame(Play p) 
	  {
		play=p;
		Map map=play.getMap();
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) 
			  {int key=e.getKeyCode();
			   Map map=play.getMap();
			   Player player=map.getPlayer();
			   ElementImage playerImage=player.getImage();
			   int x=playerImage.getX();
			   int y=playerImage.getY();
			     switch (key)
			       {
			       case KeyEvent.VK_UP:{
			    	                    player.move(1);
			    	                    playerImage.setLocation(x, y-62);
                                        break;
                                       }
			        case KeyEvent.VK_DOWN:{
			        	                   player.move(2);
			        	                   playerImage.setLocation(x, y+62);
			                               break;
			                              }
			        case KeyEvent.VK_LEFT:{
			        	                   player.move(3);
			        	                   playerImage.setLocation(x-62, y);
	                                       break;
			                              }
			        case KeyEvent.VK_RIGHT:{
			        	                    player.move(4);
			        	                    playerImage.setLocation(x+62, y);
	                                        break;
			                               }
			        case KeyEvent.VK_SPACE:
			        	 
			       }
			  }
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new MapPanel(map);
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
		setContentPane(panel);
	  }
   
	public MapPanel getPanel()
	  {
		return panel;
	  }
  }
