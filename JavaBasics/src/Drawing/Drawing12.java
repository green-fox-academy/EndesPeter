package Drawing;


import javax.swing.*;

import java.awt.*;
import org.w3c.dom.css.RGBColor;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing12 {
  public static void drawImage(Graphics graphics) {
    // Create a function that takes 3 parameters and draws a single line
    // Parameters: the x and y coordinates of the line's starting point and the graphics
    // The function shall draw a line from that point to the center of the canvas
    // Fill the canvas with lines from the edges (every 20 px) to the center


    int x;
    int y;
    x = 20;
    y = 20;
    int a;
    int b;
    int c;
    a = 10;
    b = 10;
    c = 60;


    StarMaker(graphics, x, y, a, b, c);
  }

  private static void StarMaker(Graphics graphics, int x, int y, int a, int b, int c) {


    for (int i = 0; i < 14; i++) {

      Color mine;
      mine = new Color(a, b, c);
      graphics.setColor(mine);

      graphics.drawLine(x, y, 160, 160);
      x += 20;
      a += 15;
    }

    for (int i = 0; i < 14; i++) {
      Color mine;
      mine = new Color(a, b, c);
      graphics.setColor(mine);


      graphics.drawLine(x, y, 160, 160);
      y += 20;
      b += 15;

    }

    for (int i = 0; i < 14; i++) {
      Color mine;
      mine = new Color(a, b, c);
      graphics.setColor(mine);

      graphics.drawLine(x, y, 160, 160);
      x -= 20;
      c -= 2;
    }

    for (int i = 0; i < 14; i++) {
      Color mine = new Color(a, b, c);
      graphics.setColor(mine);

      graphics.drawLine(x, y, 160, 160);
      y -= 20;
      a += 2;

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