import javax.swing.*;

public class Snake extends JFrame{

    Snake(){
        Board b=new Board();
        add(b);
        pack();   //setPreferredSize
        setLocationRelativeTo(null);
        //setLocation(400,200);
        setTitle("Sanke Game");
        setResizable(false);
    }

    public static void main(String args[]){
        new Snake().setVisible(true);
        

    }
}