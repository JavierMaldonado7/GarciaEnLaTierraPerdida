package Main.Executing;
//7/22/2020 Initial project creation

import Main.Window.Window;

//implements runnable to implement the run method and have this class called in main to initialize.
public class Game implements Runnable{

    public Window window;

    public Game(){

        window = new Window();


    }

    @Override
    public void run() {



    }

}
