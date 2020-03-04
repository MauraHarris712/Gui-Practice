/**
 * TicTacToe.java 1.0 May 2, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package exercise2;

import javax.swing.SwingUtilities;

/**
 * Start each class or interface wiht summary description line
 * 
 * @author mjspence101
 * @version 1.0
 *
 */
public class TicTacToe {
  /**
   * @param args
   */
  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {

      @Override
      public void run() {
        new TicTacToeLook();
      }
    });
  }
}
