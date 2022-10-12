package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.31, 0.21);
		//black outline
		StdDraw.setPenColor(164,57,230);
		StdDraw.filledRectangle(0.5, 0.5, 0.3, 0.2);
		//purple filled
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.filledRectangle(.5, 0.5, 0.21, 0.11);
		//black outline for green
		StdDraw.setPenColor(47, 163, 72);
		StdDraw.filledRectangle(0.5, 0.5, 0.2, 0.1);
		//green filled
		StdDraw.setPenColor(179, 117, 70);
		StdDraw.filledEllipse(0.40, 0.5, 0.07, 0.07);
		StdDraw.filledEllipse(0.6, 0.5, 0.07, 0.07);
		//brown circles
	}
}