package Protagonist;

import javax.swing.JLabel;

public abstract class Protagonist extends JLabel
  {protected boolean life;
   protected int point;
   
   /**
    * Mueve al protagonista en el mapa.
    * @param d Dirección hacia donde se mueve el protagonista: 1-Arriba
    *                                                          2-Abajo
    *                                                          3-Derecha
    *                                                          4-Izquierda
    */
   public abstract void move(int d);
   /**
    * Reacciona cuando le impacta un disparo.
    * @return Retorna los puntos que posee el protagonista al ser impactado, retorna 0 cuando no se mato el objetivo.
    */
   public abstract int kill();
   /**
    * Realiza un disparo.
    */
   public abstract void attack();
  }
