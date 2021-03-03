package GameState;

import TileMap.*;
import ee.taltech.iti0301.demo.GamePanel;

import java.awt.*;
//aaaaaa

public class LevelState extends GameState{

    private TileMap tileMap;

    public LevelState(GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    public void init() {
        tileMap = new TileMap(30);
        tileMap.loadTiles("tiles1.gif");
        tileMap.loadMap("proov.json");
        tileMap.setPosition(0, 0);

    }

    public void update() {}
    public void draw(Graphics2D g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, GamePanel.WIDTH, GamePanel.HEIGHT);
        tileMap.draw(g);
    }
    public void keyPressed(int k) {}
    public void keyReleased(int k) {}
}
