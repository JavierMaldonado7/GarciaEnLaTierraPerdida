package Main.Executing.Modes;

import Main.Management.ImageManager;
import Main.Management.Manager;
import Main.Objects.Object;
import Main.Objects.ObjectAccess;

//abstract class for each mode integrated to the game
public abstract class Mode {

    public Mode(){}
    public Object[] objects;
    public ImageManager image;
    public Manager manager;
    public ObjectAccess objAcc;


}
