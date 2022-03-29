import javax.swing.*;
import java.awt.*;

public class SnakeFrame extends JFrame {

    public SnakeFrame() throws HeadlessException {
        this.add(new SnakePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}
