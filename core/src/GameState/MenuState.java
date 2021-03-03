package GameState;

import java.awt.*;
import java.awt.event.KeyEvent;

//aaa
import TileMap.Backround;
import com.badlogic.gdx.graphics.Texture;

public class  MenuState extends GameState{
    private Backround bg;
    private int currentChoice = 0;
    private String[] options = {
            "Start", "Help", "Quit"
    };

    private Color titleColor;
    private Font titleFont;
    //aaaaaaaaa
    private Font font;

    public MenuState(GameStateManager gsm) {
         this.gsm = gsm;
         try {
             bg = new Backround("menu1.gif", 1);
             bg.setVector(-0.1, 0);

             titleColor = new Color(128, 0, 0);
             titleFont = new Font("Century Gothic", Font.PLAIN, 28);
             font = new Font("Arial", Font.PLAIN, 12);

         } catch (Exception e) {
             e.printStackTrace();
         }
    }

    public void init() {}
    public void update() {
        bg.update();
    }
    public void draw(Graphics2D g) {
        bg.draw(g);
        g.setColor(titleColor);
        g.setFont(titleFont);
        g.drawString("Parmud Pärnus", 80, 70);

        g.setFont(font);
        for (int i = 0; i < options.length; i++) {
            if (i == currentChoice) {
                g.setColor(Color.BLUE);
            } else {
                g.setColor((Color.RED));
            }
            g.drawString(options[i], 145, 140 + i * 15);
        }
    }

    private void select() {
        if (currentChoice == 0) {
            //start
            gsm.setState(GameStateManager.LEVELSTATE);
        } if (currentChoice == 1) {
            //help
        } if (currentChoice == 2) {
            System.exit(0);
        }
    }
    public void keyPressed(int k) {
        if (k == KeyEvent.VK_ENTER) {
            select();
        } if (k == KeyEvent.VK_UP) {
            currentChoice--;
            if (currentChoice == -1) {
                currentChoice = options.length - 1;
            }
        } if (k == KeyEvent.VK_DOWN) {
            currentChoice++;
            if (currentChoice == options.length) {
                currentChoice = 0;
            }
        }
    }

    @Override
    public void keyReleased(int k) {}
}
