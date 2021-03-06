package Graphics.Background;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Graphics.Elements.Characters.PlayerImage;
import Logic.Background.Map;
import Logic.Elements.Characters.Player;

public class MapPanel extends JPanel 
  { protected Map map;
	/**
	 * Create the panel.
	 */
	public MapPanel(Map m)
	  {
		map=m;
		setLayout(null);
	  }
	public void insertPlayer(int x,int y)
	  {
		PlayerImage player=(PlayerImage) map.getPlayer().getImage();
		player.setLocation(x*64, y*64);
	  }
  }
