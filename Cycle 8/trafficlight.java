import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class trafficlights extends JFrame implements ItemListener
{
	JRadioButton r1,r2,r3;
	ButtonGroup b = new ButtonGroup();
	int x=0,y=0,z=0;
		
	public void itemStateChanged(ItemEvent ie)
	{
	 	if (ie.getSource()==r1){
	 		if(ie.getStateChange()==1){
	 			x=1;
	 			repaint();
	 		}
	 	}
	 	if (ie.getSource()==r2){
	 		if(ie.getStateChange()==1){
	 			y=1;
	 			repaint();
	 		}
	 	}
	 	if (ie.getSource()==r3){
	 		if(ie.getStateChange()==1){
	 			z=1;
	 			repaint();
	 		}
	 	}
	}
	
	public void paint(Graphics g)
	{
	 g.drawRect(200,200,50,150);
	 g.setColor(Color.BLACK);
	 g.fillRect(200,200,50,150);
	 g.drawOval(205,205,40,40);
	 g.drawOval(205,255,40,40);
	 g.drawOval(205,305,40,40);
	 if(x==1){
	 	g.setColor(Color.RED);
	 	g.fillOval(205,205,40,40);
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,255,40,40);
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,305,40,40);
	 	x=0;
	}
	if(y==1){
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,205,40,40);
	 	g.setColor(Color.YELLOW);
	 	g.fillOval(205,255,40,40);
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,305,40,40);
	 	y=0;
	}
	if(z==1){
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,205,40,40);
	 	g.setColor(Color.WHITE);
	 	g.fillOval(205,255,40,40);
	 	g.setColor(Color.GREEN);
	 	g.fillOval(205,305,40,40);
	 	z=0;
	}
	}
	
	trafficlights()
	{
	 	
	 	setLayout(new FlowLayout(FlowLayout.RIGHT));
	 	
	 	r1 = new JRadioButton("RED");
		r1.addItemListener(this);
		
	 	r2 = new JRadioButton("YELLOW");
	 	r2.addItemListener(this);
	 	
	 	r3 = new JRadioButton("GREEN");
	 	r3.addItemListener(this);
	 	
	 	add(r1);add(r2);add(r3);
	 	
	 	b.add(r1);b.add(r2);b.add(r3);
	 	
	 	setSize(500,500);
	 	setVisible(true);
	 }
	 public static void main(String args[])
	 {
	 	new trafficlights();
	 }
}
