import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        People roomi = new Karam();
        Maria mimi = new Maria();
        mimi.joinMimi(roomi);
        final String[] x = {null};

        JFrame frame = new JFrame("My Silly Little Project");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 200);

        JPanel textPanel = new JPanel();
        JLabel label = new JLabel("Welcome to my mini-story Java app!\n click on the button to get a lil story :)");
        final JTextField tf = new JTextField("Click the button for the story :3");
        tf.setBounds(200,60, 1000,150);
        ImageIcon image =  new ImageIcon("/Users/karam/Documents/Java Shit/ALittleStupidProject/src/Sunflower Field Cartoon.jpg");
        JLabel backgroundLabel = new JLabel(image);
        backgroundLabel.setLayout(new BorderLayout());


        JButton button =  new JButton("Story time!");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf.setText(mimi.moodChanger());
            }
        });

        JLabel storyLabel =  new JLabel(x[0]);
        textPanel.add(label);
        textPanel.add(button);
        textPanel.add(storyLabel);
        textPanel.add(tf);
        frame.add(backgroundLabel);
        frame.add(tf);
        frame.add(textPanel);
        frame.setVisible(true);

    }
}