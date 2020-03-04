/**
 * MorganListener.java 1.0 Apr 29, 2019
 *
 * Copyright (c) 2019 Kayla Randall. All Rights Reserved
 * Campus Box 2320. Elon University, Elon, NC 27144
 */
package excercise1;

import java.awt.event.ActionEvent;
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
public class MorganListener extends JFrame implements ActionListener {
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  private final int HEIGHT = 300;
  private final int WIDTH = 200;

  /*
   * (non-Javadoc)
   * 
   * @see
   * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent aE) {
    setSize(WIDTH, HEIGHT);
    setTitle("CSC 230 Frame with Button and 3 Listeners");
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setLocation(200, 200);
    JButton goButton = new JButton("Go");
    ActionListener listener = new ClickListener();
    goButton.addActionListener(listener);
    add(goButton);
    setVisible(true);
  }
}
