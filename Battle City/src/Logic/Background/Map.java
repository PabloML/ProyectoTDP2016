package Logic.Background;
import Logic.Elements.*;
import Graphics.Background.MapPanel;
import java.util.Random;
import Logic.Elements.Characters.Enemy;
import Logic.Elements.Characters.Player;

public class Map 
  {protected Play play;
   protected Base base;
   protected Player player;
   protected Enemy [] enemies;
   protected Element [][][] map;
   protected int cantEnemy;
   protected MapPanel panel;
   
   public Map(Play p, Player pl,MapPanel m)
     {play=p;
      player=pl;
      base=new Base(this);
      map=new Element [29][11][2];
      panel=m;
      this.insertBase();
      this.insertElement();
      this.insertPlayer();
      this.insertEnemies();
     }
   
   public Play getPlay()
     {
	   return play;
     }
   
   public Player getPlayer()
     {
	   return player;
     }
   
   public Enemy[] getEnemies()
     {
	   return enemies;
     }
   
   public Element[][][] getMap()
     {
	   return map;
     }
   
   public Element getElement(int x,int y,int z)
     {
	   return map[x][y][z];
     }
   
   public void setElement(Element e,int x,int y,int z)
     {
	   map[x][y][z]=e;
     }
   
   public void fullEnemyKill()
     {
	   for (int i=0;i<enemies.length;i++)
	     {
		   Enemy enemy=enemies[i];
		   int x=enemy.getPos()[0];
		   int y=enemy.getPos()[1];
		   map[x][y][1]=null;
		   enemies=null;
		   enemy.getImage().destroy();
	     }
     }
   
   private void insertBase()
     {
	   Wall[] walls=base.getWalls();
	   int x=map.length-1;
	   int y=map[0].length-1;
	   map[x][y/2][0]=base;
	   base.setPos(x,x/2);
	   map[x][y/2-1][0]=walls[0];
	   walls[0].setPos(x,y/2-1);
	   map[x][y/2-2][0]=walls[1];
	   walls[1].setPos(x,y/2-2);
	   map[x-1][y/2-1][0]=walls[2];
	   walls[2].setPos(x-1,y/2-1);
	   map[x-1][y/2-2][0]=walls[3];
	   walls[3].setPos(x-1,y/2-2);
	   map[x-2][y/2-1][0]=walls[4];
	   walls[4].setPos(x-2,y/2-1);
	   map[x-2][y/2-2][0]=walls[5];
	   walls[5].setPos(x-2,y/2-2);
	   map[x-1][y/2][0]=walls[6];
	   walls[6].setPos(x-1,y/2);
	   map[x-2][y/2][0]=walls[7];
	   walls[7].setPos(x-2,y/2);
	   map[x-1][y/2+1][0]=walls[8];
	   walls[8].setPos(x-1,y/2+1);
	   map[x-2][y/2+1][0]=walls[9];
	   walls[9].setPos(x-2,y/2+1);
	   map[x][y/2+1][0]=walls[10];
	   walls[10].setPos(x,y/2+1);
	   map[x][y/2+2][0]=walls[11];
	   walls[11].setPos(x,y/2+2);
	   panel.insertBase();
     }
   
   private void insertPlayer()
     {
	   map[map.length-1][map[0].length-4][1]=player;
	   panel.insertPlayer(map.length-1,map[0].length-4);
     }
   
   private void insertElement()
     {
	   Random rnd=new Random();
	   int line=map.length;
	   int column=map[0].length;
	   for (int i=0;i<line;i++)
		 for (int j;j<column;j++)
		   {
			 int x=rnd.nextInt(line-1);
			 int y=rnd.nextInt(column-1);
			 Element e=map[x][y][0];
			 if (e==null)
			    {
				 int element=rnd.nextInt(3);
				 Element elem;
				 switch (element)
				   {
				    case 0:{
				    	     int wall=rnd.nextInt(2);
				    	     if (wall==0)
				    	    	{elem=new BrickWall(this);
				    	    	 panel.insertBrickWall(x,y);
				    	    	}
				    	      
				    	     break;
				           }
				    case 1:{
	                         break;			    	
				           }
				    case 2:{
				    	     break;
				           }
				   }
				 map[x][y][0]=elem;
			    }
		   }
     }
   
   private void insertEnemies()
     {
	   Random rnd=new Random();
	   int line=map.length;
	   int column=map[0].length;
	   int i=0;
	   int j=0;
	   while (i<line && cantEnemy<5)
		 {while (j<column && cantEnemy<5)
		   {
			 int x=rnd.nextInt(line-1);
			 int y=rnd.nextInt(column-1);
			 Element e1=map[x][y][0];
			 Element e2=map[x][y][1];
			 if (e1==null && e2==null)
				{play.createEnemy();
				 cantEnemy++;
				}
			 j++;
		   }
		   i++;
		 }
     }
  }
