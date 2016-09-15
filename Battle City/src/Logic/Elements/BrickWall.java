package Logic.Elements;
import Logic.Background.Map;
import Logic.Elements.Characters.Enemy;
import Logic.Elements.Characters.Player;

public class BrickWall extends Wall 
  { 
	public BrickWall(Map m)
	  {
		map=m;
	  }

	public void kill() 
	  {
		map.setElement(null, posX, posY,0);
		image.destroy(posX,posY);
	  }


	public boolean collide(Player p) 
      {
	    return true;
      }


	public boolean collide(Enemy e) 
	  {		
	    return true;
	  }
  }
