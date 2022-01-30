import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TempretureConverter extends JFrame{

    private JLabel fahrenheit;
    private JTextField fahrenheitBox;
    private JButton Convert;
    private JLabel celsius;
    private JTextField celsiusBox;
    private JButton clear;

    public TempretureConverter(){
        super("Tempreture Converter");
        setLayout(null);
        fahrenheit = new JLabel();
        fahrenheitBox = new JTextField();
        Convert = new JButton();
        celsius = new JLabel();
        celsiusBox = new JTextField();
        clear = new JButton();



        //---- fahrenheit ----
        fahrenheit.setText("fahrenheit");
        add(fahrenheit);
        fahrenheit.setBounds(45, 5, 85, 35);
        add(fahrenheitBox);
        fahrenheitBox.setBounds(40, 40, 95, 35);

        //---- Convert ----
        Convert.setText("Convert");
        Convert.setBackground(new Color(153, 153, 153));
        add(Convert);
        Convert.setBounds(145, 40, Convert.getPreferredSize().width, 30);
        Convert.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String temprature;
                        double Tc;
                        double Tf;
                        if (fahrenheitBox.getText().isEmpty()) {
                            Tf = Double.parseDouble(celsiusBox.getText()) * 1.8 + 32;
                            fahrenheitBox.setText(String.format("%.02f", Tf));
                        }
                        else if (celsiusBox.getText().isEmpty()) {
                            Tc = (Double.parseDouble(fahrenheitBox.getText()) - 32) * (5/9.0) ;
                            celsiusBox.setText(String.format("%.02f", Tc));
                        }
                        else {
                            celsiusBox.setText("");
                            fahrenheitBox.setText("");
                        }
                    }
                }
        );

        //---- celsius ----
        celsius.setText("celsius");
        add(celsius);
        celsius.setBounds(250, 15, 55, 21);
        add(celsiusBox);
        celsiusBox.setBounds(240, 40, 100, 35);

        //---- clear ----
        clear.setText("clear");
        clear.setBackground(new Color(255, 153, 153));
        add(clear);
        clear.setBounds(new Rectangle(new Point(150, 80), clear.getPreferredSize()));
        clear.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        celsiusBox.setText("");
                        fahrenheitBox.setText("");
                    }
                }
        );

    }

}
