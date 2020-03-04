/**
 * MainWindow.java 1.0 Apr 29, 2019
 *
 * Copyright (c) 2019 Kayla Randall. All Rights Reserved
 * Campus Box 2320. Elon University, Elon, NC 27144
 */
package excercise1;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Start each class or interface with summary description line
 * 
 * @author Kayla Randall
 * @version 1.0
 *
 */
public class MainWindow extends JFrame {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private final int HEIGHT = 300;
  private final int WIDTH = 200;

  /**
   * 
   */
  public MainWindow() {
    super();
    setSize(WIDTH, HEIGHT);
    setTitle("CSC 230 Frame with Button and 3 Listeners");
    setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    JButton goButton = new JButton("Go");
    ActionListener listener = new ClickListener();
    goButton.addActionListener(listener);

    add(goButton);
  }
}
