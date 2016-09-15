package Graphics.Elements;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Logic.Elements.Element;

public abstract class ElementImage extends JLabel
  {protected ImageIcon image;
   protected Element element;
   protected int posX;
   protected int posY;
   
   public int[] getPos()
     {
	   int[] pos=new int[2];
	   pos[0]=posX;
	   pos[1]=posY;
	   return pos;
     }

   public ImageIcon getImage()
     {
	  return image;
     }
 
   public abstract void destroy();
  }
