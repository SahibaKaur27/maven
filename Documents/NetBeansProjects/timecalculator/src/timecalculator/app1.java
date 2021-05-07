package timecalculator;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class app1 extends Applet
{
    String[] description = {"Student", "Faculty"};
    TextField name,pass;
    Button b1;
    public void init()
    {
        int count = 0;
        Label n=new Label("Name:",Label.CENTER);
        Label p=new Label("Password:",Label.CENTER);
        Label cat=new Label("Category:",Label.CENTER);
        name=new TextField(30);
        pass=new TextField(30);
        Choice c = new Choice();
        for(int i = 0; i<2; i++)
        {
           c.addItem(description[count++]); 
        }
        b1=new Button("Login");
        pass.setEchoChar('$');
        add(n);
        add(name);
        add(p);
        add(pass);
        add(cat);
        add(c);
        add(b1);
        n.setBounds(10,100,100,20);
        p.setBounds(10,130,90,60);
        name.setBounds(10,100,90,20);
        pass.setBounds(250,250,90,20);
        b1.setBounds(100,260,70,40);
        c.setBounds(10,100,100,20);
    }
    public void paint(Graphics g)
    {
        repaint();
    }
}



