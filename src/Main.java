import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("FAT CALCULATOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JTabbedPane p = new JTabbedPane();
        p.addTab("view",new Calculator());
      p.addTab("edit",new Calculator());
        p.addTab("help",new Calculator());
        frame.getContentPane().add(p);
        frame.pack();
        frame.setVisible(true);




        System.out.println("Hello world!");
    }
}