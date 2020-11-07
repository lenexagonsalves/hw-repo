package HW3.Exercise2Demo;
import java.util.*;
import javax.swing.*;
import java.awt.*;
public class Tester {
    public static void main(String[] args) throws InterruptedException{
        int n1 = 100;
        int n2 = 150;
        int n3 = 80;

        GraphView gView = new GraphView(n1, n2, n3);
        Numbers model = new Numbers(n1, n2, n3);
        //attach graph view and model
        model.attach(gView);
        NumberView nView = new NumberView(n1, n2, n3, model);

    }
}
