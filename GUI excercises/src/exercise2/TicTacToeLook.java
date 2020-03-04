/**
 * TicTacToeLook.java 1.0 May 2, 2019
 *
 * Copyright (c) 2019 Jazz Harris. All Rights Reserved
 * Campus Box 12302. Elon University, Elon, NC 27144
 */
package exercise2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * Start each class or interface wiht summary description line
 * 
 * @author mjspence101
 * @version 1.0
 *
 */
public class TicTacToeLook extends JFrame {
  /**
   * 
   */
  private JButton[] board;
  private String currentPlayer;
  private JMenu menu;
  private JMenuBar menuBar;
  private JMenuItem newGame;
  private JPanel pane;
  private JPanel panel;
  private String playerDes;
  private JLabel playerTurn;
  private JMenuItem quit;

  /**
   * 
   */
  public TicTacToeLook() {
    super();
    pane = new JPanel();
    panel = new JPanel();
    panel.setLayout(new GridLayout(3, 3));
    setTitle("CSC230 TicTacToe");
    setSize(500, 500);
    setResizable(false);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    currentPlayer = "X";
    board = new JButton[9];
    playerTurn = new JLabel("Player x turn");
    intializeBoard();
    add(pane, BorderLayout.SOUTH);
    add(panel, BorderLayout.CENTER);
    setVisible(true);

  }

  private void intializeBoard() {
    for (int i = 0; i < 9; i++) {
      {
        JButton btn = new JButton();
        board[i] = (btn);
        btn.addActionListener(new ActionListener() {
          /**
           * @param e
           */
          @Override
          public void actionPerformed(ActionEvent e) {
            if (((JButton) e.getSource()).getText().equals("")) {
              btn.setText(currentPlayer);
              togglePlayer();
            }

          }
        });
        panel.add(btn);
      }
    }

    pane.add(playerTurn);
  }

  private void togglePlayer() {
    if (currentPlayer.equals("X")) {
      currentPlayer = "O";
      playerTurn.setText("Player O turn");
    } else {
      currentPlayer = "X";
      playerTurn.setText("Player X turn");

    }

  }
}
