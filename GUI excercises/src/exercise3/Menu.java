/**
 * Menu.java 1.0 May 5, 2019
 *
 * Copyright (c) 2019 Kayla Randall. All Rights Reserved
 * Campus Box 2320. Elon University, Elon, NC 27144
 */
package exercise3;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Start each class or interface wiht summary description line
 * 
 * @author Kayla Randall
 * @version 1.0
 *
 */
public class Menu extends JFrame {
  private JTextField kilometerField = new JTextField(23);
  private JLabel kLabel = new JLabel("Kilometers");
  private JMenuBar menuBar;
  private JTextField mileField = new JTextField(23);
  private JLabel mLabel = new JLabel("Miles");

  public Menu() {
    super();
    JMenuBar menuBar = createMenu();
    JPanel kilometerPanel = getKilometerPanel();
    JPanel milePanel = getMilePanel();
    setLayout(new FlowLayout(FlowLayout.TRAILING, 5, 5));
    setSize(150, 150);
    setJMenuBar(menuBar);
    add(milePanel, BorderLayout.CENTER);
    add(kilometerPanel, BorderLayout.SOUTH);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
  }

  public double calculateFromKilometer(double aNumber) {
    double result = aNumber / 1.609;
    return result;
  }

  public double calculateFromMiles(double aNumber) {
    double result = aNumber * 1.609;
    return result;
  }

  /**
   * @return
   */
  private JMenuBar createMenu() {
    JMenuBar menuBar = new JMenuBar();
    JMenu menu = new JMenu("Operations");
    menuBar.add(menu);

    JMenuItem kilometerAction = new JMenuItem("Calculate Kilometers");
    kilometerAction.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent aE) {
        String number = null;
        while (number == null) {
          try {
            number = mileField.getText();
            double number2 = Double.parseDouble(number);
            double answer = calculateFromMiles(number2);
            // something to display this in the mile
            String answer2 = Double.toString(answer);
            kilometerField.setText(answer2);
          } catch (NumberFormatException e) {
            kilometerField.setText("Bad entry. Could not convert");
          }
        }

      }

    });

    JMenuItem mileAction = new JMenuItem("Calculate Miles");
    mileAction.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent aE) {
        String number = null;
        while (number == null) {
          try {
            number = kilometerField.getText();
            double number2 = Double.parseDouble(number);
            double answer = calculateFromKilometer(number2);
            // something to display this in the kilometer
            String answer2 = Double.toString(answer);
            mileField.setText(answer2);
          } catch (NumberFormatException e) {
            mileField.setText("Bad entry. Could not convert");
          }
        }
      }
    });

    JMenuItem clearAction = new JMenuItem("Clear");
    clearAction.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent aE) {
        mileField.setText("");
        kilometerField.setText("");
      }

    });

    JMenuItem exitAction = new JMenuItem("Exit");
    exitAction.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent aE) {
        System.exit(0);
      }

    });
    menu.add(kilometerAction);
    menu.addSeparator();
    menu.add(mileAction);
    menu.addSeparator();
    menu.add(clearAction);
    menu.addSeparator();
    menu.add(exitAction);
    return menuBar;
  }

  /**
   * @return
   */
  private JPanel getKilometerPanel() {
    Action action = new AbstractAction() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        String number = null;
        while (number == null) {
          try {
            number = kilometerField.getText();
            double number2 = Double.parseDouble(number);
            double answer = calculateFromKilometer(number2);
            // something to display this in the kilometer
            String answer2 = Double.toString(answer);
            mileField.setText(answer2);
          } catch (NumberFormatException e) {
            mileField.setText("Bad entry. Could not convert");
          }
        }
      }

    };
    JPanel kilometer = new JPanel();
    kilometerField.setHorizontalAlignment(SwingConstants.RIGHT);
    kilometerField.addActionListener(action);
    kilometer.add(kLabel);
    kilometer.add(kilometerField);
    return kilometer;
  }

  /**
   * @return
   */
  private JPanel getMilePanel() {
    Action action = new AbstractAction() {

      @Override
      public void actionPerformed(ActionEvent aE) {
        String number = null;
        while (number == null) {
          try {
            number = mileField.getText();
            double number2 = Double.parseDouble(number);
            double answer = calculateFromMiles(number2);
            // something to display this in the mile
            String answer2 = Double.toString(answer);
            kilometerField.setText(answer2);
          } catch (NumberFormatException e) {
            kilometerField.setText("Bad entry. Could not convert");
          }
        }
      }
    };
    JPanel mile = new JPanel();
    mileField.setHorizontalAlignment(SwingConstants.RIGHT);
    mileField.addActionListener(action);
    mile.add(mLabel);
    mile.add(mileField);
    return mile;

  }
}