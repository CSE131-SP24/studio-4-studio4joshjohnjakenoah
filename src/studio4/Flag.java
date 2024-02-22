package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
		StdDraw.clear();
		StdDraw.setXscale(-20, 20);
		StdDraw.setYscale(-20, 20);
		StdDraw.setPenColor(119,136,153);
		StdDraw.filledRectangle(0, 18, 20, 2);
		StdDraw.filledRectangle(0, 10, 20, 2);
		StdDraw.filledRectangle(0, 2, 20, 2);
		StdDraw.filledRectangle(0, -6, 20, 2);
		StdDraw.filledRectangle(0, -14, 20, 2);


		StdDraw.setPenColor(2,0,121);
		StdDraw.filledRectangle(-10, 10, 10, 10);
		StdDraw.setPenColor(65, 182, 230);
		StdDraw.filledCircle(-10, 10, 7);
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledCircle(-10, 10, 5);
		StdDraw.setPenColor(255, 209, 26);
		StdDraw.filledCircle(-10, 10, 3);
		StdDraw.filledRectangle(-10, 10, 1, 5);
		StdDraw.filledRectangle(-10, 10, 5, 1);
		StdDraw.setPenColor(230, 184, 0);
		
		double[] x1 = {-9, -11, -10};
		double[] y1 = {15, 15, 13};
		StdDraw.filledPolygon(x1, y1);
		
		double[] x2 = {-15, -15, -13};
		double[] y2 = {11, 9, 10};
		StdDraw.filledPolygon(x2, y2);
		
		double[] x3 = {-5, -5, -7};
		double[] y3 = {11, 9, 10};
		StdDraw.filledPolygon(x3, y3);
		
		double[] x4 = {-9, -11, -10};
		double[] y4 = {5, 5, 7};
		StdDraw.filledPolygon(x4, y4);
		
		StdDraw.setPenColor(255, 255, 255);
		StdDraw.filledEllipse(-10, 10, 2.50, 1.50);
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledCircle(-10, 10, 1);
		
		StdDraw.setPenColor(0, 0, 102);
		StdDraw.filledRectangle(0, 10, 1, 10);
		StdDraw.filledRectangle(-10, 0, 11, 1);
		StdDraw.filledRectangle(-20, 10, 1, 10);
		StdDraw.filledRectangle(-10, 20, 10, 1);
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(-10, 11, 0.25, 0.5);
		StdDraw.filledRectangle(-10, 9, 0.25, 0.5);
		StdDraw.filledRectangle(-10, 10, 2.5, 0.25);











		/*StdDraw.setPenColor(179, 0, 0);
		StdDraw.filledRectangle(0, -20, 20, 2);
		StdDraw.filledRectangle(0, 20, 20, 2);
		StdDraw.filledRectangle(-20, 0, 2, 20);
		StdDraw.filledRectangle(20, 0, 2, 20);*/



		
	




		/*StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
		
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);*/
	}

}