import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class DrawPanel extends JPanel{
	public void paintComponent(Graphics g){
		Scanner nput = new Scanner(System.in);
		super.paintComponent(g);
		int width = getWidth();
		int height = getHeight();
		//int numberOfSteps = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of steps to divide the screen."));
		int numberOfSteps = 15;
		int stepCounter = 1;
		int stepXLoc = 0;
		int stepYLoc = height;
		
		int stepSizeWidth = width/numberOfSteps;
		int stepSizeHeight = height/numberOfSteps;
		
		while (stepCounter <= 16){
			g.drawLine(0, 0, stepXLoc, stepYLoc);
			stepXLoc = stepXLoc + stepSizeWidth;
			stepYLoc = stepYLoc - stepSizeHeight;
			stepCounter = stepCounter + 1;
		}
		
		g.drawLine(0,0,width,height);
		g.drawLine(0, height, width, 0);
	}
}
