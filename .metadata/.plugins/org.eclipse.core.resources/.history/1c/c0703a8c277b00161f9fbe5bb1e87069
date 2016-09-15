package Graphics.Background;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.EmptyBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class PlayFrame extends JFrame {

	private MapPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayFrame frame = new PlayFrame();
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
	public PlayFrame() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) 
			  {int key=e.getKeyCode();
			  int x=panel.player.getX();
			     int y=panel.player.getY();
			     switch (key)
			       {case KeyEvent.VK_DOWN:{panel.player.setLocation(x, y+62);
			                               break;
			                              }
			        case KeyEvent.VK_UP:{panel.player.setLocation(x, y-62);
	                                    break;
			                            }
			        case KeyEvent.VK_LEFT:{panel.player.setLocation(x-62, y);
	                                      break;
			                              }
			        case KeyEvent.VK_RIGHT:{panel.player.setLocation(x+62, y);
	                                       break;
			                               }
			        case KeyEvent.VK_SPACE:
			        	 
			       }
			  }
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		panel = new MapPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		panel.setLayout(new BorderLayout(0, 0));
		setContentPane(panel);
	}

}
