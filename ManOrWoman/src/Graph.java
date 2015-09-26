import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Graph extends JFrame {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Graph(){
	       setSize(800, 600);	
	       
	}

	
	public void paint(int x,int y,int XSIZE,int YSIZE) {
		  Graphics g = this.getGraphics();
		  g.setColor(Color.blue);
		  g.fillOval(x, y, XSIZE, YSIZE);
		  g.dispose();
		}
//	
//	public void paintWoman(int x,int y,int XSIZE,int YSIZE) {
//		  Graphics g = this.getGraphics();
//		  g.setColor(Color.red);
//		  g.fillOval(x, y, XSIZE, YSIZE);
//		  //g.dispose();
//		}
}
