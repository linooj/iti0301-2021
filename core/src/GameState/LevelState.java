package GameState;

import TileMap.*;
import ee.taltech.iti0301.demo.GamePanel;

import java.awt.*;

public class LevelState extends GameState{

    private TileMap tileMap;

    public LevelState(GameStateManager gsm) {
        this.gsm = gsm;
        init();
    }

    public void init() {
        tileMap = new TileMap(30);
        tileMap.loadTiles("tiles.gif");
        tileMap.loadMap("proov.map.json");
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
