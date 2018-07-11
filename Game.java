import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.io.File;


    public class Game extends JFrame {
        JButton button[] = new JButton[67];
        JFrame fr = new JFrame();
        JPanel panel = new JPanel();
        ImageIcon icon = new ImageIcon("C:\\images/1529760734308.gif");
        ImageIcon icon2 = new ImageIcon("");
        public class TestActionListener implements ActionListener{
            public void actionPerformed(ActionEvent e){//Тута происходят все действия при нажатии на кнопку
            }
        }
        public Game(){
            fr.add(panel);


            fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            panel.setLayout(new GridLayout(9,8));
            fr.setBounds(300,0,700,700);
            fr.setVisible(true);
            ActionListener actionListener = new TestActionListener();

                  for(int i = 1;i<65;i++) {
                button[i] = new JButton(icon);
                button[i].setIcon(icon);
                      button[i] = new JButton("qwe", icon);
                      button[i].setIcon(icon);
                fr.getContentPane().add(button[i]);

                      button[i].addActionListener(new ActionListener() {
                          @Override
                          public void actionPerformed(ActionEvent e) {
                              for (int i = 1; i < 65; i++) {
                                  button[i] = new JButton("ddw",icon2);
                                  button[i].setIcon(icon2);
                                  fr.getContentPane().add(button[i]);
                              }
                          }
                      });
                panel.add(button[i]);
            }

            JButton cancelbutton = new JButton("Выход");
            cancelbutton.addActionListener(new ActionListener() {//Слушатель для кнопки выход
                                             @Override
                                             public void actionPerformed(ActionEvent e) {

                                                 fr.dispose();//Закрывает frame
                                             }
                                         });
            button[66] = new JButton("Перезагрузка");
            panel.add(cancelbutton);
            panel.add(button[66]);

            fr.setVisible(true);


        }
        public static void main(String[] args){
    new Game();
        }
    }
