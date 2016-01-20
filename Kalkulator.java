import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Toolkit;

public class Kalkulator {

    private JFrame frmKalkulator;
    private JTextField textFieldNum1;
    private JTextField textFieldNum2;
    private JButton btnNewButton_1;
    private JTextField textFieldAns;
    private JButton btnNewButton_2;
    private JButton btnNewButton_3;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Kalkulator window = new Kalkulator();
                    window.frmKalkulator.setSize(450, 490);
                    window.frmKalkulator.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public Kalkulator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmKalkulator = new JFrame();
        frmKalkulator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Bunek\\workspace\\Nauka\\src\\Calculator-icon.png"));
        frmKalkulator.setTitle("Kalkulator");
        frmKalkulator.setBounds(100, 100, 438, 480);
        frmKalkulator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmKalkulator.getContentPane().setLayout(null);

        textFieldNum1 = new JTextField(); // left textField
        textFieldNum1.setBounds(23, 31, 171, 41);
        frmKalkulator.getContentPane().add(textFieldNum1);
        textFieldNum1.setColumns(10);

        textFieldNum2 = new JTextField(); // right textField
        textFieldNum2.setBounds(232, 31, 171, 41);
        frmKalkulator.getContentPane().add(textFieldNum2);
        textFieldNum2.setColumns(10);

        JButton btnNewButton = new JButton("Add"); // mathematical operations buttons
        btnNewButton.setToolTipText("Click to add two numbers");
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1, num2, ans;
                try {
                    num1 = Double.parseDouble(textFieldNum1.getText());
                    num2 = Double.parseDouble(textFieldNum2.getText());
                    ans = num1 + num2;

                    textFieldAns.setText(Double.toString(ans));
                } catch (Exception w) {
                    JOptionPane.showMessageDialog(null, "Please enter number");
                }

            }
        });
        btnNewButton.setBounds(34, 196, 114, 41);
        frmKalkulator.getContentPane().add(btnNewButton);

        btnNewButton_1 = new JButton("Substract");
        btnNewButton_1.setToolTipText("Click to substract two numbers");
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1, num2, ans;
                try {
                    num1 = Double.parseDouble(textFieldNum1.getText());
                    num2 = Double.parseDouble(textFieldNum2.getText());
                    ans = num1 - num2;

                    textFieldAns.setText(Double.toString(ans));
                } catch (Exception w) {
                    JOptionPane.showMessageDialog(null, "Please enter number");
                }
            }
        });
        JButton btnMultiply = new JButton("Multiply");
        btnMultiply.setToolTipText("Click to multiply two numbers");
        btnMultiply.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1, num2, ans;
                try {
                    num1 = Double.parseDouble(textFieldNum1.getText());
                    num2 = Double.parseDouble(textFieldNum2.getText());
                    ans = num1 * num2;

                    textFieldAns.setText(Double.toString(ans));
                } catch (Exception w) {
                    JOptionPane.showMessageDialog(null, "Please enter number");
                }
            }
        });
        btnMultiply.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnMultiply.setBounds(34, 282, 114, 39);
        frmKalkulator.getContentPane().add(btnMultiply);

        JButton btnDivide = new JButton("Divide");
        btnDivide.setToolTipText("Click to divide two numbers");
        btnDivide.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double num1, num2, ans;
                try {
                    num1 = Double.parseDouble(textFieldNum1.getText());
                    num2 = Double.parseDouble(textFieldNum2.getText());
                    ans = num1 / num2;

                    textFieldAns.setText(Double.toString(ans));
                } catch (Exception w) {
                    JOptionPane.showMessageDialog(null, "Please enter number");
                }

            }
        });
        btnDivide.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnDivide.setBounds(276, 282, 114, 39);
        frmKalkulator.getContentPane().add(btnDivide);

        JLabel lblNewLabel = new JLabel("The answer is");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
        lblNewLabel.setBounds(44, 378, 128, 48);
        frmKalkulator.getContentPane().add(lblNewLabel);

        textFieldAns = new JTextField(); // textField with answer
        textFieldAns.setEditable(false);
        textFieldAns.setBounds(156, 380, 239, 48);
        frmKalkulator.getContentPane().add(textFieldAns);
        textFieldAns.setColumns(10);

        btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnNewButton_1.setBounds(276, 196, 114, 39);
        frmKalkulator.getContentPane().add(btnNewButton_1);

        btnNewButton_2 = new JButton("1");// input buttons on left side
        btnNewButton_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NumberButtons("1");
            }
        });
        btnNewButton_2.setBounds(23, 83, 55, 16);
        frmKalkulator.getContentPane().add(btnNewButton_2);

        btnNewButton_3 = new JButton("2");
        btnNewButton_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons("2");
            }
        });
        btnNewButton_3.setBounds(82, 83, 55, 16);
        frmKalkulator.getContentPane().add(btnNewButton_3);

        JButton btnNewButton_4 = new JButton("3");
        btnNewButton_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons("3");
            }
        });
        btnNewButton_4.setBounds(145, 83, 55, 16);
        frmKalkulator.getContentPane().add(btnNewButton_4);

        JButton button = new JButton("4");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons("4");
            }
        });
        button.setBounds(23, 110, 55, 16);
        frmKalkulator.getContentPane().add(button);

        JButton button_1 = new JButton("5");
        button_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
            NumberButtons("5");
            }
        });
        button_1.setBounds(82, 110, 55, 16);
        frmKalkulator.getContentPane().add(button_1);

        JButton button_2 = new JButton("6");
        button_2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons("6");
            }
        });
        button_2.setBounds(145, 110, 55, 16);
        frmKalkulator.getContentPane().add(button_2);

        JButton button_3 = new JButton("7");
        button_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             NumberButtons("7");
            }
        });
        button_3.setBounds(23, 133, 55, 16);
        frmKalkulator.getContentPane().add(button_3);

        JButton button_4 = new JButton("8");
        button_4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             NumberButtons("8");
            }
        });
        button_4.setBounds(82, 133, 55, 16);
        frmKalkulator.getContentPane().add(button_4);

        JButton button_5 = new JButton("9");
        button_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             NumberButtons("9");
            }
        });
        button_5.setBounds(145, 133, 55, 16);
        frmKalkulator.getContentPane().add(button_5);

        JButton button_6 = new JButton("0");
        button_6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             NumberButtons("0");
            }
        });
        button_6.setBounds(82, 155, 55, 16);
        frmKalkulator.getContentPane().add(button_6);

        JButton button_17 = new JButton(".");
        button_17.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = textFieldNum1.getText();
                StringBuilder builder = new StringBuilder(str);

                if (str.contains(".")) {
                    JOptionPane.showMessageDialog(null, "Please enter number");

                } else {

                    builder.append(".");
                    String nowy = builder.toString();
                    textFieldNum1.setText(nowy);
                }
            }

        });
        button_17.setBounds(145, 155, 55, 16);
        frmKalkulator.getContentPane().add(button_17);

        JButton btnC = new JButton("C");
        btnC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldNum1.setText("");
            }
        });
        btnC.setBounds(23, 155, 55, 16);
        frmKalkulator.getContentPane().add(btnC);

        JButton button_7 = new JButton("1");// input buttons on right side
        button_7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons2("1");
        }
        });
        button_7.setBounds(232, 83, 55, 16);
        frmKalkulator.getContentPane().add(button_7);

        JButton button_8 = new JButton("2");
        button_8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
             NumberButtons2("2");
            }
        });
        button_8.setBounds(297, 83, 55, 16);
        frmKalkulator.getContentPane().add(button_8);

        JButton button_9 = new JButton("3");
        button_9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons2("3");
            }
        });
        button_9.setBounds(359, 83, 55, 16);
        frmKalkulator.getContentPane().add(button_9);

        JButton button_10 = new JButton("4");
        button_10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NumberButtons2("4");
            }
        });
        button_10.setBounds(232, 107, 55, 16);
        frmKalkulator.getContentPane().add(button_10);

        JButton button_11 = new JButton("5");
        button_11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons2("5");
            }
        });
        button_11.setBounds(297, 107, 55, 16);
        frmKalkulator.getContentPane().add(button_11);

        JButton button_12 = new JButton("6");
        button_12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NumberButtons2("6");
            }
        });
        button_12.setBounds(359, 107, 55, 16);
        frmKalkulator.getContentPane().add(button_12);

        JButton button_13 = new JButton("7");
        button_13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons2("7");
            }
        });
        button_13.setBounds(232, 130, 55, 16);
        frmKalkulator.getContentPane().add(button_13);

        JButton button_14 = new JButton("8");
        button_14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NumberButtons2("8");
            }
        });
        button_14.setBounds(297, 130, 55, 16);
        frmKalkulator.getContentPane().add(button_14);

        JButton button_15 = new JButton("9");
        button_15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                NumberButtons2("9");
            }
        });
        button_15.setBounds(359, 130, 55, 16);
        frmKalkulator.getContentPane().add(button_15);

        JButton button_16 = new JButton("0");
        button_16.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            NumberButtons2("0");
            }
        });
        button_16.setBounds(297, 155, 55, 16);
        frmKalkulator.getContentPane().add(button_16);


        JButton button_18 = new JButton("C");
        button_18.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldNum2.setText("");
            }
        });
        button_18.setBounds(232, 155, 55, 16);
        frmKalkulator.getContentPane().add(button_18);

        JButton button_19 = new JButton(".");
        button_19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str = textFieldNum2.getText();
                StringBuilder builder = new StringBuilder(str);

                if (str.contains(".")) {
                    JOptionPane.showMessageDialog(null, "Please enter number");

                } else {

                    builder.append(".");
                    String nowy = builder.toString();
                    textFieldNum2.setText(nowy);
                }

            }
        });
        button_19.setBounds(359, 155, 55, 16);
        frmKalkulator.getContentPane().add(button_19);

        JButton btnC_1 = new JButton("C");// button which removes everything
        btnC_1.setToolTipText("Click to remove all numbers");
        btnC_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldNum1.setText("");
                textFieldNum2.setText("");
                textFieldAns.setText("");
            }
        });
        btnC_1.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnC_1.setBounds(156, 239, 114, 41);
        frmKalkulator.getContentPane().add(btnC_1);
    }

    private void NumberButtons(String buttonValue) {
        String str = textFieldNum1.getText();
        StringBuilder builder = new StringBuilder(str);
        builder.append(buttonValue);
        String nowy = builder.toString();
        textFieldNum1.setText(nowy);
    }

    private void NumberButtons2(String buttonValue) {
        String str = textFieldNum2.getText();
        StringBuilder builder = new StringBuilder(str);
        builder.append(buttonValue);
        String nowy = builder.toString();
        textFieldNum2.setText(nowy);
    }
}
