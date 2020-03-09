package dynamic_beat_2;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class DynamicBeat extends JFrame {

    //더블버퍼링을 위함
    private Image screenImage;
    private Graphics screenGraphic;

    private Image introBackground;

    public DynamicBeat(){
        setTitle("Dynamic Beat");
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        introBackground = new ImageIcon(Main.class.getResource("../images/introBackground(Title).jpg")).getImage();
    }

    public void paint(Graphics g){
        screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        screenGraphic = screenImage.getGraphics();
        screenDraw(screenGraphic);
        g.drawImage(screenImage,0,0,null);
    }

    public void screenDraw(Graphics g){
        g.drawImage(introBackground,0,0,null);
        this.repaint();
    }
}
