package Drawing;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Drawing11 {
  public static void drawImage(Graphics graphics) {
    // Fill the canvas with a checkerboard pattern
    int x;
    x = 0;
    int y;
    y = 0;
    int size;
    size = 40;


    for (int a = 0; a < 4; a++) {


      for (int p = 0; p < 2; p++) {

        //rajzol 4 negyzetet egy sorban
        for (int j = 0; j < 4; j++) {
          graphics.setColor(Color.black);
          graphics.fillRect(x, y, size, size);
          x += 80;
        }
        // visszaallitja az x erteket a kovetkezo sorhoz amit y tengelyen is eltol 40-el
        x -= 280;
        y += 40;


      }
      // A mar elkeszult fenti ket sort ismetli mikozben x-et korrigalja a kezdopontra
      for (int b = 0; b < 1; b++) {
        x -= 80;

      }

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
