package week2;


import java.awt.event.MouseEvent;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.program.GraphicsProgram;


public class DrawingLines extends GraphicsProgram
{
  @Override
  public void run()
  {
    readInstructions();
    addMouseListeners();
  }

  private void readInstructions()
  {
    GLabel instructions = new GLabel("Click the mouse to draw a line", 20, 20);
    add(instructions);
  }

  private GLine line;

  @Override
  public void mousePressed(MouseEvent e)
  {
    double x = e.getX();
    double y = e.getY();
    line = new GLine(x, y, x, y);
    add(line);
  }

  @Override
  public void mouseDragged(MouseEvent e)
  {
    double x = e.getX();
    double y = e.getY();
    line.setEndPoint(x, y);
  }
}