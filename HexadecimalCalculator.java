import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.Border;

public class HexadecimalCalculator extends JFrame {
    int num;
    int ans;
    int calculation;
    private JButton additionButton;
    private JButton clearButton;
    private JButton deleteButton;
    private JTextField displayField;
    private JButton divisionButton;
    private JButton equalButton;
    private JTextField jLabel1;
    private JLabel jLabel2;
    private JButton multiplicationButton;
    private JButton subtractionButton;
    private JButton var0;
    private JButton var1;
    private JButton var10;
    private JButton var11;
    private JButton var12;
    private JButton var13;
    private JButton var14;
    private JButton var15;
    private JButton var2;
    private JButton var3;
    private JButton var4;
    private JButton var5;
    private JButton var6;
    private JButton var7;
    private JButton var8;
    private JButton var9;

    public void arithmetic_operation() {
        switch(this.calculation) {
            case 1:
                this.ans = this.num + Integer.parseInt(this.displayField.getText(), 16);
                this.displayField.setText(Integer.toHexString(this.ans).toUpperCase());
                break;
            case 2:
                this.ans = this.num - Integer.parseInt(this.displayField.getText(), 16);
                this.displayField.setText(Integer.toHexString(this.ans).toUpperCase());
                break;
            case 3:
                this.ans = this.num * Integer.parseInt(this.displayField.getText(), 16);
                this.displayField.setText(Integer.toHexString(this.ans).toUpperCase());
                break;
            case 4:
                this.ans = this.num / Integer.parseInt(this.displayField.getText(), 16);
                this.displayField.setText(Integer.toHexString(this.ans).toUpperCase());
        }

    }

    public HexadecimalCalculator() {
        this.initComponents();
    }

    private void initComponents() {
        this.displayField = new JTextField();
        this.var1 = new JButton();
        this.var2 = new JButton();
        this.var3 = new JButton();
        this.var4 = new JButton();
        this.var5 = new JButton();
        this.var6 = new JButton();
        this.var7 = new JButton();
        this.var8 = new JButton();
        this.var11 = new JButton();
        this.var12 = new JButton();
        this.var9 = new JButton();
        this.var10 = new JButton();
        this.var15 = new JButton();
        this.equalButton = new JButton();
        this.var13 = new JButton();
        this.var14 = new JButton();
        this.additionButton = new JButton();
        this.subtractionButton = new JButton();
        this.multiplicationButton = new JButton();
        this.divisionButton = new JButton();
        this.clearButton = new JButton();
        this.deleteButton = new JButton();
        this.var0 = new JButton();
        this.jLabel1 = new JTextField();
        this.jLabel2 = new JLabel();
        this.setDefaultCloseOperation(3);
        this.setTitle("Calculator");
        this.setBackground(new Color(255, 255, 255));
        this.setLocation(new Point(299, 394));
        this.setResizable(false);
        this.setType(Type.UTILITY);
        this.displayField.setEditable(false);
        this.displayField.setBackground(new Color(51, 51, 51));
        this.displayField.setFont(new Font("Yu Gothic UI Light", 0, 24));
        this.displayField.setForeground(new Color(255, 255, 255));
        this.displayField.setHorizontalAlignment(4);
        this.displayField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.displayFieldActionPerformed(evt);
            }
        });
        this.var1.setText("1");
        this.var1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var1ActionPerformed(evt);
            }
        });
        this.var2.setText("2");
        this.var2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var2ActionPerformed(evt);
            }
        });
        this.var3.setText("3");
        this.var3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var3ActionPerformed(evt);
            }
        });
        this.var4.setText("4");
        this.var4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var4ActionPerformed(evt);
            }
        });
        this.var5.setText("5");
        this.var5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var5ActionPerformed(evt);
            }
        });
        this.var6.setText("6");
        this.var6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var6ActionPerformed(evt);
            }
        });
        this.var7.setText("7");
        this.var7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var7ActionPerformed(evt);
            }
        });
        this.var8.setText("8");
        this.var8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var8ActionPerformed(evt);
            }
        });
        this.var11.setText("B");
        this.var11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var11ActionPerformed(evt);
            }
        });
        this.var12.setText("C");
        this.var12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var12ActionPerformed(evt);
            }
        });
        this.var9.setText("9");
        this.var9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var9ActionPerformed(evt);
            }
        });
        this.var10.setText("A");
        this.var10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var10ActionPerformed(evt);
            }
        });
        this.var15.setText("F");
        this.var15.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var15ActionPerformed(evt);
            }
        });
        this.equalButton.setText("=");
        this.equalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.equalButtonActionPerformed(evt);
            }
        });
        this.var13.setText("D");
        this.var13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var13ActionPerformed(evt);
            }
        });
        this.var14.setText("E");
        this.var14.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var14ActionPerformed(evt);
            }
        });
        this.additionButton.setText("+");
        this.additionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.additionButtonActionPerformed(evt);
            }
        });
        this.subtractionButton.setText("-");
        this.subtractionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.subtractionButtonActionPerformed(evt);
            }
        });
        this.multiplicationButton.setText("X");
        this.multiplicationButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.multiplicationButtonActionPerformed(evt);
            }
        });
        this.divisionButton.setFont(new Font("Tahoma", 1, 10));
        this.divisionButton.setText("÷");
        this.divisionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.divisionButtonActionPerformed(evt);
            }
        });
        this.clearButton.setText("AC");
        this.clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.clearButtonActionPerformed(evt);
            }
        });
        this.deleteButton.setText("Del");
        this.deleteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.deleteButtonActionPerformed(evt);
            }
        });
        this.var0.setText("0");
        this.var0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                HexadecimalCalculator.this.var0ActionPerformed(evt);
            }
        });
        this.jLabel1.setEditable(false);
        this.jLabel1.setBackground(new Color(51, 51, 51));
        this.jLabel1.setFont(new Font("Arial", 0, 12));
        this.jLabel1.setForeground(new Color(153, 255, 153));
        this.jLabel1.setHorizontalAlignment(4);
        this.jLabel1.setBorder((Border)null);
        this.jLabel1.setCursor(new Cursor(0));
        this.jLabel1.setFocusable(false);
        this.jLabel2.setFont(new Font("Yu Gothic UI Light", 0, 14));
        this.jLabel2.setText("Hexadecimal Calculator");
        GroupLayout layout = new GroupLayout(this.getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.displayField).addGroup(layout.createSequentialGroup().addComponent(this.var1, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var2, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var3, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var4, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.var5, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var6, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var7, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var8, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING, false).addGroup(Alignment.LEADING, layout.createSequentialGroup().addComponent(this.clearButton, -2, 148, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.deleteButton, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.var9, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var10, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.var11, -2, 71, -2)).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(Alignment.TRAILING).addGroup(Alignment.LEADING, layout.createSequentialGroup().addComponent(this.additionButton, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.subtractionButton, -1, -1, 32767)).addGroup(layout.createSequentialGroup().addComponent(this.var13, -2, 71, -2).addPreferredGap(ComponentPlacement.RELATED, -1, 32767).addComponent(this.var14, -2, 71, -2))).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.var15, -2, 71, -2).addComponent(this.multiplicationButton, -1, -1, 32767)))).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING).addComponent(this.equalButton, -1, -1, 32767).addComponent(this.var12, -1, -1, 32767).addComponent(this.divisionButton, -1, 71, 32767).addComponent(this.var0, Alignment.TRAILING, -1, -1, 32767))).addGroup(Alignment.TRAILING, layout.createSequentialGroup().addGap(0, 0, 32767).addComponent(this.jLabel2).addPreferredGap(ComponentPlacement.UNRELATED).addComponent(this.jLabel1, -2, 148, -2))).addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING).addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.jLabel1, -2, 28, -2).addComponent(this.jLabel2, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addComponent(this.displayField, -2, 54, -2).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.var1, -1, 35, 32767).addComponent(this.var2, -1, -1, 32767).addComponent(this.var3, -1, -1, 32767).addComponent(this.var4, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.var5, -1, -1, 32767).addComponent(this.var6, -1, -1, 32767).addComponent(this.var7, -1, -1, 32767).addComponent(this.var8, -2, 35, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.var9, -1, -1, 32767).addComponent(this.var10, -1, -1, 32767).addComponent(this.var11, -1, -1, 32767).addComponent(this.var12, -2, 35, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.var13, -1, -1, 32767).addComponent(this.var14, -1, -1, 32767).addComponent(this.var0, -2, 35, -2).addComponent(this.var15, -1, -1, 32767)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(this.additionButton, -2, 41, -2).addComponent(this.subtractionButton, -2, 41, -2).addComponent(this.multiplicationButton, -2, 41, -2).addComponent(this.divisionButton, -2, 41, -2)).addPreferredGap(ComponentPlacement.RELATED).addGroup(layout.createParallelGroup(Alignment.LEADING, false).addComponent(this.clearButton, -1, 46, 32767).addComponent(this.deleteButton, -1, -1, 32767).addComponent(this.equalButton, -1, -1, 32767)).addContainerGap(-1, 32767)));
        this.pack();
    }

    private void displayFieldActionPerformed(ActionEvent evt) {
    }

    private void var1ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "1");
    }

    private void var2ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "2");
    }

    private void var3ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "3");
    }

    private void var4ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "4");
    }

    private void var5ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "5");
    }

    private void var6ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "6");
    }

    private void var7ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "7");
    }

    private void var8ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "8");
    }

    private void var9ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "9");
    }

    private void var10ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "A");
    }

    private void var11ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "B");
    }

    private void var12ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "C");
    }

    private void var13ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "D");
    }

    private void var14ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "E");
    }

    private void var15ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "F");
    }

    private void equalButtonActionPerformed(ActionEvent evt) {
        JTextField var10000 = this.jLabel1;
        String var10001 = this.jLabel1.getText();
        var10000.setText(var10001 + this.displayField.getText());
        this.arithmetic_operation();
    }

    private void additionButtonActionPerformed(ActionEvent evt) {
        this.num = Integer.parseInt(this.displayField.getText(), 16);
        this.jLabel1.setText(this.displayField.getText() + "+");
        this.displayField.setText((String)null);
        this.calculation = 1;
    }

    private void subtractionButtonActionPerformed(ActionEvent evt) {
        this.num = Integer.parseInt(this.displayField.getText(), 16);
        this.jLabel1.setText(this.displayField.getText() + "-");
        this.displayField.setText((String)null);
        this.calculation = 2;
    }

    private void multiplicationButtonActionPerformed(ActionEvent evt) {
        this.num = Integer.parseInt(this.displayField.getText(), 16);
        this.jLabel1.setText(this.displayField.getText() + "*");
        this.displayField.setText((String)null);
        this.calculation = 3;
    }

    private void divisionButtonActionPerformed(ActionEvent evt) {
        this.num = Integer.parseInt(this.displayField.getText(), 16);
        this.jLabel1.setText(this.displayField.getText() + "÷");
        this.displayField.setText((String)null);
        this.calculation = 4;
    }

    private void var0ActionPerformed(ActionEvent evt) {
        this.displayField.setText(this.displayField.getText() + "0");
    }

    private void deleteButtonActionPerformed(ActionEvent evt) {
        int length = this.displayField.getText().length();
        int number = length - 1;
        if (length > 0) {
            StringBuilder del = new StringBuilder(this.displayField.getText());
            del.deleteCharAt(number);
            String store = del.toString();
            this.displayField.setText(store);
        }

    }

    private void clearButtonActionPerformed(ActionEvent evt) {
        this.displayField.setText((String)null);
        this.jLabel1.setText((String)null);
    }

    public static void main(String[] args) {
        try {
            LookAndFeelInfo[] var1x = UIManager.getInstalledLookAndFeels();
            int var2x = var1x.length;

            for(int var3x = 0; var3x < var2x; ++var3x) {
                LookAndFeelInfo info = var1x[var3x];
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException var5x) {
            Logger.getLogger(HexadecimalCalculator.class.getName()).log(Level.SEVERE, (String)null, var5x);
        } catch (InstantiationException var6x) {
            Logger.getLogger(HexadecimalCalculator.class.getName()).log(Level.SEVERE, (String)null, var6x);
        } catch (IllegalAccessException var7x) {
            Logger.getLogger(HexadecimalCalculator.class.getName()).log(Level.SEVERE, (String)null, var7x);
        } catch (UnsupportedLookAndFeelException var8x) {
            Logger.getLogger(HexadecimalCalculator.class.getName()).log(Level.SEVERE, (String)null, var8x);
        }

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                (new HexadecimalCalculator()).setVisible(true);
            }
        });
    }
}
