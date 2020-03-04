/**
 * ClickListener.java 1.0 Apr 29, 2019
 *
 * Copyright (c) 2019 Kayla Randall. All Rights Reserved
 * Campus Box 2320. Elon University, Elon, NC 27144
 */
package excercise1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Start each class or interface with summary description line
 * 
 * @author Kayla Randall
 * @version 1.0
 *
 */
public class ClickListener implements ActionListener {
  private HalleyListener listener1 = new HalleyListener();
  private MorganListener listener2 = new MorganListener();
  private SethListener listener3 = new SethListener();

  /*
   * (non-Javadoc)
   * 
   * @see
   * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   */
  @Override
  public void actionPerformed(ActionEvent aE) {
    listener2.actionPerformed(aE);
    listener1.actionPerformed(aE);
    listener3.actionPerformed(aE);
  }

}
