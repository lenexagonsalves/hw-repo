package HW3.Exercise2Demo;
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Numbers {
    //instance variables
    int redNumber;
    int blueNumber;
    int greenNumber;

    //attach graph
    GraphView gView; 

    //constructor to initialize Numbers
    public Numbers(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.blueNumber = n2;
        this.greenNumber = n3;
    }

    //attach graph to numbers model
    public void attach(GraphView gView) {
        this.gView = gView;
    }

    //update values and graph
    public void updateValues(int n1, int n2, int n3) {
        this.redNumber = n1;
        this.blueNumber = n2;
        this.greenNumber = n3;
        gView.updateGraph(n1, n2, n3);
    }
}
