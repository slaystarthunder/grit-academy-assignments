import javax.swing.*;
import java.awt.GridLayout;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.temporal.TemporalAdjusters;

public class MiniCalendar extends JFrame {

    // method creating the calendar
    public MiniCalendar() {
        // set title and what happens on exit
        setTitle("Mini Calendar");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set grid layout with 7 columns, one for every day
        setLayout(new GridLayout(1, 7));
        addCalendarDays();

        // sizes window to the preferred size and layout of its subcomponents
        pack();

        // center the calendar window on the screen
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void addCalendarDays() {

        // variable to start the calendar on mondays
        LocalDate weekStart = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

        // for loop to create the days in the calendar
        for (int i = 0; i < 7; i++) {
            LocalDate date = weekStart.plusDays(i);
            CalendarDay calendarDay = new CalendarDay(date);
            add(calendarDay);
        }
    }


}