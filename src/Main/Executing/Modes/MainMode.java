package Main.Executing.Modes;

import Main.Management.ImageManager;
import Main.Objects.ObjectAccess;

public class MainMode extends Mode {


    public MainMode(){

        this.image = new ImageManager();
        this.objAcc = new ObjectAccess();



    }



}
