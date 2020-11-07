package HW3.Exercise2Demo;
import java.util.*;

import javax.swing.*;
import java.awt.*;

public class NumberView extends JFrame {
    Numbers model;

    public NumberView(int n1, int n2, int n3, Numbers model) {

        // NumberView -> Model -> GraphView
        this.model = model;

        //red text field 
        add(new JLabel("Red"));
        JTextField redNumber = new JTextField(10);
        redNumber.setText(n1 + "");
        add(redNumber);

        //blue text field 
        add(new JLabel("Blue"));
        JTextField blueNumber = new JTextField(10);
        blueNumber.setText(n2 + "");
        add(blueNumber);
        
        //green text field 
        add(new JLabel("Green"));
        JTextField greenNumber = new JTextField(10);
        greenNumber.setText(n3 + "");
        add(greenNumber);
        
        JButton submit = new JButton("Submit");
        add(submit);
        setVisible(true);
        setSize(500, 500);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        submit.addActionListener(event -> {
            int number1 = Integer.parseInt(redNumber.getText());
            model.updateValues(number1, number1, number1);
        });


    }
}
