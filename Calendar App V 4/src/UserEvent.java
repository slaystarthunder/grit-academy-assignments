import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserEvent extends JDialog {
    private JTextField eventText;

   // constructor that creates the event submit window
    public UserEvent(Frame parent) {
        // calls methods from the superclass, JDialog sets modal window to true
        super(parent, "Add Event", true);
        setLayout(new FlowLayout());

        // text field for the event text
        eventText = new JTextField(20);
        this.add(eventText);

        // button + event listener for create event button
        JButton submitButton = new JButton("Create event");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // close the dialog when user clicks submit button
                setVisible(false);
            }
        });
        this.add(submitButton);

        pack();
    }

    // get method to return the text entered in eventText
    public String getEvent() {
        return eventText.getText();
    }
}
