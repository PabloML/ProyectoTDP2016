package Logic.Elements;
import Logic.Background.Map;
import Logic.Elements.BrickWall;
import Logic.Elements.Characters.Enemy;
import Logic.Elements.Characters.Player;

public class Base extends Element
  {protected boolean life;
   protected BrickWall [] walls;
   
   public Base(Map m)
     {
	   this.createWalls();
	   life=true;
	   map=m;
	   image=new BaseImage();
     }
   
   public boolean isLife()
     {
	   return life;
     }
   
   public BrickWall[] getWalls()
     {
	   return walls;
     }
   
   public void kill()
     {
	   life=false;
	   map.getPlayer().kill();
     }
   
   public boolean collide(Player p)
     {
	   return true;
     }
   
   public boolean collide(Enemy e)
     {
	   return true;
     }
   
   private void createWalls()
     {
	   walls=new BrickWall[12];
	   for (int i=0;i<walls.length;i++)
	     {
		   BrickWall w=new BrickWall(map);
		   walls[i]= w;
	     }
     }
 }
