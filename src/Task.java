import javax.swing.*;
import java.awt.*;


public class Task extends JPanel {

//set the task itself and what will appear on the app.
    JLabel index;
    JTextField taskName;
    JButton done;

//the colors that the task could be colored with.
    Color pink = Color.PINK;
    Color green= Color.GREEN;
    Color doneColor= Color.RED;


    private boolean checked;


    //set a new basic task.
    Task(){
        this.setPreferredSize(new Dimension(400,20));//set size of task
        this.setBackground(pink);//set background color of task

        this.setLayout((new BorderLayout()));//set the layout of the task

        checked=false;

        index=new JLabel("");//create index label.
        index.setPreferredSize(new Dimension(20,20));//set size of the index label.
        index.set
    }

}
