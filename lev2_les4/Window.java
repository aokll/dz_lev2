package Okno;
/*
 Создать окно для клиентской части чата: большое текстовое поле для отображения
 переписки в центре окна. Однострочное текстовое поле для ввода сообщений и кнопка
 для отсылки сообщений на нижней панели. Сообщение должно отсылаться либо по нажатию
 кнопки на форме, либо по нажатию кнопки Enter. При «отсылке» сообщение перекидывается
 из нижнего поля в центральное.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame{
    public static void main (String[] args) {

        JFrame frame = new JFrame("My window");

        frame.setLayout(new BorderLayout());
        frame.setBounds(900,150,335,450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel top = new JPanel();//верхняя часть окна
        JTextArea jTextArea = new JTextArea();
        jTextArea.setPreferredSize(new Dimension(300,150));
        jTextArea.setEditable(false);

        top.add(jTextArea);
        frame.add(top);

        JPanel middle = new JPanel();//середина окна
        JTextField jTextField = new JTextField();
        jTextField.setPreferredSize(new Dimension(300,25));



        middle.add(jTextField);
        frame.add(middle);

        JPanel bottom = new JPanel();//нижняя часть окна
        JButton jButton = new JButton("Отправить");
        jButton.setPreferredSize(new Dimension(200,50));
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               jTextArea.setText(jTextField.getText());
               jTextField.setText("");

            }
        });


        bottom.add(jButton);
        frame.add(bottom);

        jTextField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {}
            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==10){
                    jTextArea.setText(jTextField.getText());
                    jTextField.setText("");
                }
            }
        });

        frame.add(top,BorderLayout.NORTH);
        frame.add(middle,BorderLayout.CENTER);
        frame.add(bottom,BorderLayout.SOUTH);

        frame.setVisible(true);
    }

}
