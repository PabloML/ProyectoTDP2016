package Graphics.Elements;

import javax.swing.ImageIcon;

import Logic.Elements.Element;

public class BrickWallImage extends WallImage
  {
	
	 public BrickWallImage(Element e)
       {
   	    image=new ImageIcon(BaseImage.class.getResource("/Images/Walls/BrickWall.png"));
   	    element=e;
       }

	public void destroy() 
	  {	
	  }

  }
