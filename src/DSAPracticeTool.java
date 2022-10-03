import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DSAPracticeTool {
    public static void main(String[] args) {
        JFrame frame = new JFrame("DSA Practice Tool");
        frame.setSize(250, 250);
        frame.setLocation(300,200);

        final JButton button = new JButton("Start");

        final JTextArea textArea = new JTextArea(10, 40);
        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.SOUTH, button);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Button was clicked\n");

            }
        });

        frame.setVisible(true);
    }
}
