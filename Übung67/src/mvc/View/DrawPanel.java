package mvc.View;

import java.awt.*;
import javax.swing.JPanel;



public class DrawPanel extends JPanel implements Runnable{

	private int width, height;
	Point a;
	Point b;
	Point c;
	Point d;
	Point e;
	Point f;
	Point g1;
	Point h;
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		width = getWidth();
		height = getHeight();

		g.setColor(Color.WHITE);
		g.drawLine(width/2, 0, width/2, width);

		g.drawLine(0, height/2, height, height/2);

		for (int i = 0; i < width; i=i+10) {
			g.drawLine((width/2)-5, i, (width/2)+5, i);
		}
		for (int i = 0; i < height; i=i+10) {
			g.drawLine(i, (height/2)-5, i, (height/2)+5);
			
		}
		
		
		
		if(a!=null&&b!=null) {
			g.drawLine(a.x, a.y, b.x, b.y);
		}
		
		
		/*
		if(c!=null&&d!=null) {
			g.drawLine(c.x, c.y, d.x, d.y);
		}
		if(e!=null&&f!=null) {
			g.drawLine(e.x, e.y, f.x, f.y);
		}
		if(g1!=null&&h!=null) {
			g.drawLine(g1.x, g1.y, h.x, h.y);
		}
		
		*/
			
			
		
		
		
		
		
		
	}

	@Override
	public void run() {
	
		while(true) {
		
		for (int i = 0; i < 1000; i = i+50) {
			a = new Point(i,200);
			b = new Point(i+50,200);
			
			
			repaint();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		/*	
		a = new Point(0,200);
		b = new Point(100,200);
		repaint();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		c = new Point(100,200);
		d = new Point(150,200);
		repaint();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		e = new Point(150,200);
		f = new Point(200,200);
		repaint();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		g1 = new Point(200,200);
		h = new Point(250,200);
		repaint();
		*/
		}
		
	}

}



