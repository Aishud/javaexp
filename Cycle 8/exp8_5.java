import java.awt.*;
import javax.swing.*;
class draw extends Canvas{
        int a;
        draw(){
         a=1;
        }
        public void paint(Graphics g){
        	if(a==1){
        		g.setColor(Color.GREEN);
        		g.drawRect(20,30,100,150);
        		g.fillRect(20,30,100,150);
        		g.setColor(Color.WHITE);
        		g.drawRect(30,40,80,130);
        		g.fillRect(30,40,80,130);
        		g.setColor(Color.BLUE);
        		g.drawOval(45,75,50,50);
        		g.fillOval(45,75,50,50);
        		g.setColor(Color.RED);
        		g.drawLine(140,30,140,100);
        		g.drawLine(180,30,180,100);
        		g.drawLine(140,30,180,100);
        		g.drawLine(180,30,140,100);
        	        g.drawLine(140,100,180,100);
        		g.drawLine(140,30,180,30);
        	}
        }
	public static void main (String args[]){
		draw d=new draw();
		JFrame f=new JFrame();
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	f.add(d);
        	f.setSize(300, 300);
        	f.setVisible(true);
	}
}
