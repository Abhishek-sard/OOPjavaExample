import javax.swing.JLabel;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

class Mouse extends Frame implements MouseListner{
    static JLabel label1, label2, label3;
    public static void main(String[] args) {
        JFrame f = new JFrame("MouseListner");
        f.setSize(600,100);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        label1 = new JLabel("No event");
        label2 = new JLabel("no event");
        label3 = new JLabel("no event");
        Mouse m = new Mouse();
        f.addMouseListner(m);
        p.add(label1);
        p.add(label2);
        p.add(label3);
        f.add(p);
        f.show();
    
    }
    pubic void mousePressed(MouseEvent e){
        label1.setText("mouse pressed at point:" + e.getX() + "" + e.getY());
    }
    pubic void mouseReleased(MouseEvent e){
        label1.setText("mouse realesed at point:" + e.getX() + "" + e.getY());
    }
    pubic void mouseExited(MouseEvent e){
        label2.setText("mouse exited at point:" + e.getX() + "" + e.getY());
    }
    pubic void mouseEntered(MouseEvent e){
        label2.setText("mouse entered at point:" + e.getX() + "" + e.getY());
    }
    public void mouseClicked(MouseEvent e){
        lable3.setText("mouse clicked at point:" + e.getX()+ "" + e.getY() + "mouse clicked:" + e.getClickCount());
    }

}  
