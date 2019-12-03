package com.thebetadecays;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.net.URL;
import javax.swing.ImageIcon;

class TestDashboard extends JFrame {

    // JFrame
    static JFrame f;
    private JLabel label;
    private Icon icon;
    private URL url;

    // JButton
    static JButton db, db2;

   // JPanel contentPane;
    // label to display text
    //static JLabel l;

    // main class
    public TestDashboard() {

            // create a new frame to store text field and button
            f = new JFrame("Dash Test");

            // banner code
            Border b = BorderFactory.createLineBorder(Color.green); // set border color to green
            JPanel um = new JPanel();
            LayoutManager l = new FlowLayout();
            um.setLayout(l);
            JPanel um2 = new JPanel();
            String spaces = "                   ";
            um2.add(new JLabel(spaces + "Welcome to Saving Cents" + spaces));
            um2.setBorder(b);
            um.add(um2);

            f.getContentPane().add(um, BorderLayout.CENTER);

        try {
            url = new URL("https://gfycat.com/gifs/search/mario+coin");
        } catch (Exception e) {
            icon=new ImageIcon(url);
            label= new JLabel(icon);
            f.add(label);

            // create a new buttons

            db = new JButton("Add Expense");
            db2 = new JButton("Settings");

            // create a panel to add buttons
            JPanel dash = new JPanel();

            // image Gif code
            //contentPane = (JPanel) getContentPane();
            //JLabel imageLabel = new JLabel();
            //JPanel contentPane = new JPanel();
            //ImageIcon ii = new ImageIcon(this.getClass().getResource(
              //      "ShallowWastefullrishdraughthorse-small.gif"));
            //imageLabel.setIcon(ii);
            //contentPane.add(imageLabel, java.awt.BorderLayout.CENTER);

            // add buttons to panel
            dash.add(db);
            dash.add(Box.createHorizontalGlue());
            dash.add(db2);
        //

            // add panel to frame
            f.add(dash, BorderLayout.SOUTH);
            f.add(um, BorderLayout.NORTH);
            //f.add(contentPane, BorderLayout.CENTER);
            f.add(label, BorderLayout.CENTER);

            // set the size of frame
            f.setSize(647, 400);

        }
    }
        public static void main(String[] args) {
        new TestDashboard();
    }
}