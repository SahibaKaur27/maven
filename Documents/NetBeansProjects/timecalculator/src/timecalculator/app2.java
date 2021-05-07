package timecalculator;
import java.awt.*;
import java.applet.*;
public class app2 extends Applet
{String[] mon = {"January", "February", "March", "April", "May", "June", 
        "July", "Augest", "September", "October", "November", "December"};
    Button b1;
    TextField tt;
    public void init()
    {   Label n=new Label("Date:",Label.CENTER);
        Label p=new Label("Month:",Label.CENTER);
        Label cat=new Label("Year:",Label.CENTER);
        tt=new TextField(30);
        Choice date = new Choice();
        Choice month = new Choice();
        Choice year = new Choice();
        for(int i = 1; i<=31; i++)
        {date.addItem(String.valueOf(i)); }
        for(int i =0 ; i<12; i++)
        {
           month.addItem(mon[i]); 
        }
        for(int i = 1960; i<2021; i++)
        {
           year.addItem(String.valueOf(i)); 
        }
        b1=new Button("DOB");
        add(n);
        add(date);
        add(p);
        add(month);
        add(cat);
        add(year);
        add(b1);
        add(tt);
        n.setBounds(10,100,100,20);
        p.setBounds(10,130,90,60);
        date.setBounds(10,100,90,20);
        month.setBounds(250,250,90,20);
        b1.setBounds(100,260,70,40);
        year.setBounds(10,100,100,20);
    }
    public void paint(Graphics g)
    {
        repaint();
    }
}