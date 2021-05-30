package com.foxmula.assignment1;

class Parallelogram extends Quadrilateral
{
	int height;
	Parallelogram (int x0, int y0, int x1, int y1, int x2, int y2, int x3, int y3, int height)
	{
		set (x0, y0, x1, y1, x2, y2, x3, y3);
		this.height = height;
	}
	
	int area()
	{
		int side1 = (int)Math.sqrt((x0-x1)*(x0-x1) + (y0-y1)*(y0-y1));
		int res = (int) (side1*height);
		return res;
	}
}
