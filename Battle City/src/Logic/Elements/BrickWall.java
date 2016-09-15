package Logic.Elements;
import Graphics.Elements.BrickWallImage;
import Logic.Background.Map;
import Logic.Elements.Characters.Enemy;
import Logic.Elements.Characters.Player;

public class BrickWall extends Wall 
  { 
	public BrickWall(Map m)
	  {
		map=m;
		image=new BrickWallImage(this);
	  }

	public void kill() 
	  {
		map.setElement(null, posX, posY,0);
		image.destroy();
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
