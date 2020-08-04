package Main.Window;

import javax.swing.*;
import java.awt.*;

public class Window {

    public JFrame window;

    public Canvas canvas;

    public Graphics2D graph;



    public Window(){

        window = new JFrame("Charly Garcia y la Melodia Perdida");

        canvas = new Canvas();

        window.setSize(600,600);

        window.add(canvas);

        window.setVisible(true);


    }

    public void addImage(){




    }

    public void draw(Graphics g){

        Graphics2D g2 = (Graphics2D) g;


    }




    public void setUp(){

        window.add(canvas);


    }



    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
