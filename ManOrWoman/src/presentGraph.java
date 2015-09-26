import java.io.IOException;
import java.util.LinkedList;

import javax.swing.JFrame;

public class presentGraph extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Graph frame;
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		frame = new Graph();
        frame.setVisible(true);
        float th;
        float phi;
        LinkedList<Sample> samples = parser.getData("res/menFile.txt");
        for(Sample smp : samples){
        	th = smp.getTheta()+300;
        	phi = smp.getPhi()+300;
        	frame.paint(((int)th),((int)phi),500,500);
        }
//        samples = parser.getData("res/womanFile.txt");
//        for(Sample smp : samples){
//        	th = smp.getTheta()+300;
//        	phi = smp.getPhi()+300;
//        	System.out.println((int)th + " " + (int)phi);
//        	frame.paintWoman(((int)th),((int)phi),1000,100);
//        }

	}
	

}
