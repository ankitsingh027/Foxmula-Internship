package com.foxmula.assignment1;

class Rectangle extends Quadrilateral
{
	Rectangle (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
	}
	
	int area()
	{
		int side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		int side2 = (int)Math.sqrt((x0-x3)*(x0-x3) + (y0-y3)*(y0-y3));
		return side1*side2;
	}
}
