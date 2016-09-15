package Graphics.Background;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

import Logic.Background.Map;

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
  }
