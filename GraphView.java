package HW3.Exercise2Demo;
import java.util.*; 
import javax.swing.*;
import java.awt.*;

public class GraphView extends JFrame {
    //instance variables
    int n1;
    int n2;
    int n3;

    //constructor for GraphView
    public GraphView(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        setSize(500, 500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    //update graph based on numbers
    public void updateGraph(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        repaint();
    }

    //paint the graph on frame
    @Override
    public void paint(Graphics g) {
        super.paint(g); // to clear the previous stuff if any (for repainting)
        Graphics2D g2 = (Graphics2D) g;

        // find y coordinate with padding
        int y1 = getHeight() - n1 - 15;
        int y2 = getHeight() - n2 - 15;
        int y3 = getHeight() - n3 - 15;

        //red rectangle
        g2.setColor(Color.RED);
        Rectangle rec1 = new Rectangle(10, y1, 50, n1);
        g2.draw(rec1);
        g2.fill(rec1);

        //blue rectangle
        g2.setColor(Color.BLUE);
        Rectangle rec2 = new Rectangle(10, y2, 50, n2);
        g2.draw(rec2);
        g2.fill(rec2);

        //green rectangle
        g2.setColor(Color.GREEN);
        Rectangle rec3 = new Rectangle(10, y3, 50, n3);
        g2.draw(rec3);
        g2.fill(rec3);
    }
}
