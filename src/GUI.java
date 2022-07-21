import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
public class GUI extends JFrame{
    JPanel pnl;
    JLabel lbl;
    JLabel cal_lbl;
    int hours =0,minute = 0,second = 0;
    Date date;
    SimpleDateFormat simpleDateFormat;

    Timer time = new Timer(1000, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            clock();
        }
    });



    public GUI(){

        cal_lbl = new JLabel();
        cal_lbl.setBounds(100,200,400,70);
        cal_lbl.setFont(new Font("Verdana",Font.BOLD,50));

        JPanel pnl = new JPanel();
        pnl.setBounds(100,50,400,100);
        pnl.setBackground(Color.black);

        time.start();
        lbl = new JLabel();
        lbl.setBounds(100,50,400,100);
        lbl.setFont(new Font("Verdana",Font.BOLD,70));
        lbl.setHorizontalAlignment(JTextField.CENTER);
        lbl.setBackground(Color.black);
        lbl.setForeground(Color.green);

        add(cal_lbl);
        pnl.add(lbl);
        add(pnl);
        setSize(600,400);
        setTitle("Clock");
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int x = ((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth()-400)/2;
        int y =((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()-400)/2;
        setLocation(x,y);
        setVisible(true);
        calender();
    }

    public void clock(){
        date = new Date();
        simpleDateFormat = new SimpleDateFormat("HH/mm/ss");
        lbl.setText(simpleDateFormat.format(date));

    }

    public void calender(){
        date = new Date();
        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        cal_lbl.setText(simpleDateFormat.format(date));

    }

}
