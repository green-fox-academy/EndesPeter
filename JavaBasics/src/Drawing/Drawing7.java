package Drawing;

import javax.swing.*;

import java.awt.*;

import static java.awt.Window.getWindows;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing7 {

  public static void drawImage(Graphics graphics) {
    // Draw four different size and color rectangles
    // Avoid code duplication!
    int x;
    x = 10;
    int y;
    y = 0;
    int w;
    w = 25;
    int h;
    h = 35;

    for (int i = 0; i < 4; i++) {
      graphics.drawRect(x += 55, y += 55, w += 5, h += 5);
    }

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
