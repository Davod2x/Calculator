import javax.swing.*;
import java.awt.*;

public class Calculator extends CalcPanel {
    public Calculator() {
        setLayout(new BorderLayout());


        JPanel jay = new JPanel();

        jay.setLayout(new GridLayout(2,0));
        JPanel numss = new JPanel();
        numss.setLayout(new GridLayout(3,3));

        JPanel jaye = new JPanel();
        jaye.setLayout(new GridLayout(2,2));
        BoxLayout bl = new BoxLayout(this,BoxLayout.Y_AXIS);




        JTextField c1 = new JTextField(63);
      //  c1.setColumns(10000);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;



        JButton b17 = new JButton("MC");
        JButton b18 = new JButton ("MR");
        JButton b19 = new JButton ("MS");
        JButton b20 = new JButton ("M+");
        JButton b21 = new JButton ("M-");
        JButton b22 = new JButton ("<-");
        JButton b23 = new JButton ("CE");
        JButton b24 = new JButton ("C");
        JButton b25 = new JButton ("√");
        JButton b27 = new JButton ("±");






        JButton b1 = new JButton ("7");
        JButton b2 = new JButton ("8");
        JButton b3 = new JButton ("9");
        JButton b4 = new JButton ("/");
        JButton b9 = new JButton ("%");
        JButton b5 = new JButton ("4");
        JButton b6 = new JButton ("5");
        JButton b7 = new JButton ("6");
        JButton b8 = new JButton ("*");
        JButton b12 = new JButton ("1/x");
        JButton b10 = new JButton ("1");
        JButton b11 = new JButton ("2");
        JButton b13 = new JButton ("3");
        JButton b14 = new JButton (".");
        JButton b15 = new JButton ("0");
        JButton b16 = new JButton ("+");
        JButton b28 = new JButton ("-");
        JButton b29 = new JButton ("=");



       /* add(c1);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(b21);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b9);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b12);
        add(b10);
        add(b11);
        add(b13);
        add(b14);


        */
        jay.add(c1);
        jay.add(b17,gbc);
        jay.add(b18,gbc);
        jay.add(b19,gbc);
        jay.add(b20,gbc);
        jay.add(b21,gbc);
        jay.add(b22,gbc);
        jay.add(b23,gbc);
        jay.add(b24,gbc);

        jaye.add(b27,gbc);
        jaye.add(b25,gbc);
        jaye.add(b4,gbc);
        jaye.add(b9,gbc);
        jaye.add(b8,gbc);
        jaye.add(b12,gbc);
        jaye.add(b16,gbc);
        jaye.add(b28,gbc);
        jaye.add(b29,gbc);

        numss.add(b1,gbc);
        numss.add(b2,gbc);
        numss.add(b3,gbc);
        numss.add(b5,gbc);
        numss.add(b6,gbc);
        numss.add(b7,gbc);
        numss.add(b10,gbc);
        numss.add(b11,gbc);
        numss.add(b13,gbc);
        numss.add(b15,gbc);
        numss.add(b14,gbc);







        add(c1,BorderLayout.NORTH);
        add(numss, BorderLayout.CENTER);
        add(jaye, BorderLayout.EAST);

       /* add(b17, BorderLayout.NORTH);
        add(b18, BorderLayout.NORTH);
        add(b19, BorderLayout.NORTH);
        add(b20, BorderLayout.NORTH);
        add(b21, BorderLayout.NORTH);

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.CENTER);
        add(b3, BorderLayout.CENTER);
        add(b5, BorderLayout.CENTER);
        add(b6, BorderLayout.CENTER);
        add(b7, BorderLayout.CENTER);
        add(b10, BorderLayout.CENTER);
        add(b11, BorderLayout.CENTER);
        add(b13, BorderLayout.CENTER);
        add(b15, BorderLayout.CENTER);
        add(b14, BorderLayout.CENTER);

        */
    }
}
