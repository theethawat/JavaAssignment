package javaam2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EnterName extends JFrame{
    private String nameValue;
    private String cityValue;
    public EnterName(){
        super("Enter Your Name for Entrance The Game");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        //Component Creating
        JLabel enternameText = new JLabel("Enter Your name please");
        JTextField nameInput =  new JTextField(30);
        JLabel cityinputText = new JLabel("Enter your city that you live? Like 'Bangkok' ");
        JTextField cityInput = new JTextField(30);
        JButton submitButton = new JButton("Submit");

        //Adding Component
        container.add(enternameText);
        container.add(nameInput);
        container.add(cityinputText);
        container.add(cityInput);
        container.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                nameValue = nameInput.getText();
                cityValue = cityInput.getText();
                JOptionPane.showMessageDialog(container,"Hello " + nameValue.toString() + " Hope you enjoy My Game");
                dispose(); //Use Disponse to let only one JFrame out but Application Still Running
            }
        });
        //Visibility Setting
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);
        setVisible(true);
    }

    public String returnName(){
        return nameValue;
    }

    public String returnCity(){
        return cityValue;
    }

}
