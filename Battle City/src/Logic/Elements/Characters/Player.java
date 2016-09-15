package Logic.Elements.Characters;
import Logic.Background.Map;
import Logic.Elements.Element;

public class Player extends Character 
  {protected int cantLife;
   protected int level;
   protected boolean vulnerability;
   
   public Player(Map m)
     {
	   map=m;
	   cantLife=3;
	   level=1;
	   vulnerability=true;
     }
   
   public int getCantLife()
     {
	   return cantLife;
     }
   
   public int getLevel()
     {
	   return level;
     }
   
   public void incrementPoint(int p)
     {
	   point=point+p;
     }
   
  public void incrementLevel()
    {
	  level++;
    }
   
	public void move(int d) 
	  {
		map.setElement(null, posX, posY, 1);
		switch (d)
		  {
		    case 1: {
		    	     if (posX-1>=0)
		    	        posX--;
		    	     break;
		            }
		    case 2: {
		    	     if (posX+1<map.getMap().length)
		    	    	posX++;
		    	     break;
		            }
		    case 3: {
		    	     if (posY-1>=0)
		    	    	posY--;
		    	     break;
		            }
		    case 4: {
		    	     if (posY+1<map.getMap().length)
		    	    	posY++;
		    	     break;
		            }
		  }
		map.setElement(this, posX, posY, 1);
		image.move(d);
	  }

	public void attack() 
	  {
		/*Shot s=new Shot(map);
		shot.move(this);
		*/
	  }

	public void kill() 
	  {
		if (vulnerability)
		   {cantLife--;
		    map.getPlay().setPlayer();
		   }
		if (cantLife==0)
		   {life=false;
		    image.destroy();
		   }
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
