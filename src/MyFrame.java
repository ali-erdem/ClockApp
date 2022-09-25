import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class MyFrame extends JFrame{
    
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    
    MyFrame(){
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My clock program");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        
        timeFormat = new SimpleDateFormat("HH:mm:ss ");
        dayFormat = new SimpleDateFormat("EEEEEEEE");
        dateFormat = new SimpleDateFormat("MMMMMMM dd, yyyy");
        
                
        timeLabel = new JLabel();        
        timeLabel.setFont(new Font("Times New Roman",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.black);
        timeLabel.setOpaque(true);
        
        dayLabel = new JLabel();
        dayLabel.setFont(new Font("Ink Free",Font.PLAIN,35));
        
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
        
        
        this.add(timeLabel);
        this.add(dayLabel);
        this.add(dateLabel);
        this.setVisible(true);
        
        setTime();
        
    }
    
    public void setTime(){
        while(true){
           time = timeFormat.format(calendar.getInstance().getTime());
           timeLabel.setText(time);
           
           day = dayFormat.format(calendar.getInstance().getTime());
           dayLabel.setText(day);
           
           date = dateFormat.format(calendar.getInstance().getTime());
           dateLabel.setText(date);
           
           try{
               Thread.sleep(1000);
           }
           catch (InterruptedException e){
               e.printStackTrace();
           }
        }
    }
}
