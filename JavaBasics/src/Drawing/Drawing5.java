package Drawing;

import javax.swing.*;

import java.awt.*;
import org.w3c.dom.css.RGBColor;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing5 {
  public static void drawImage(Graphics graphics) {
    int x = 50;
    int y = 50;

    for (int i = 0; i < 8; i++) {
      graphics.setColor(new Color(50, 100, 84));
      diagonals(i * 50, i * 050, graphics);

    }

  }


  public static void diagonals(int x, int y, Graphics g) {
    g.fillRect(x, y, 50, 50);


  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 320;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    ImagePanel panel = new ImagePanel();
    panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
    jFrame.add(panel);
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
    jFrame.pack();
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      drawImage(graphics);
    }
  }
}