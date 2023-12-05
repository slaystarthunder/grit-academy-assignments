import javax.swing.border.Border;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CalendarDay extends JPanel {


    public CalendarDay(LocalDate date) {

        // set the layout manager
        setLayout(new BorderLayout());

        // set a border
        Border border = BorderFactory.createLineBorder(Color.GRAY, 1);
        this.setBorder(border);

        // add the date label at the top (North)
        JPanel datePanel = new JPanel();

        // format the date do desired specifications
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE d MMMM", Locale.ENGLISH);
        String formattedDate = date.format(formatter);
        JLabel dateLabel = new JLabel(formattedDate);

        // change background color if the 'date' variable equals todays date
        if(date.equals(LocalDate.now())) {
            setBackground(Color.green);
        }

        // add the date at the top of the day view
        datePanel.add(dateLabel);
        this.add(datePanel, BorderLayout.NORTH);


        // set up the content label for user event in the center
        JLabel eventLabel = new JLabel();
        this.add(eventLabel, BorderLayout.CENTER);

        // a panel added so the button can be resized
        JPanel buttonPanel = new JPanel();
        JButton eventButton = new JButton("Add event");

        // event listener for the button to open a dialog window
        eventButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                // create the user event dialog window and make this frame a parent to the UserEvent class
                UserEvent userEvent = new UserEvent(JOptionPane.getFrameForComponent(CalendarDay.this));
                userEvent.setVisible(true);

                // get the user inputted event text from the UserEvent class
                String eventText = userEvent.getEvent();
                eventLabel.setText(eventText);

            }
        });

        // set the button size and add the button panel at the bottom
        eventButton.setPreferredSize(new Dimension(190, 30));
        buttonPanel.add(eventButton);
        this.add(buttonPanel, BorderLayout.SOUTH);

        // Set a preferred size for the panel
        this.setPreferredSize(new Dimension(200, 500)); // Adjust the width and height as needed
    }

}
