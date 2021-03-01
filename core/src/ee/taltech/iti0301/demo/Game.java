package ee.taltech.iti0301.demo;

import javax.swing.JFrame;
//aaa

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame("Fire n Water");
        window.setContentPane(new GamePanel());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.pack();
        window.setVisible(true);
    }
}

