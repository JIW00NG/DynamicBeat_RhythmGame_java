package dynamic_beat_1;

import dynamic_beat_1.Main;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

    public DynamicBeat(){
        setTitle("Dynamic Beat");
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
