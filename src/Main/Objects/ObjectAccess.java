package Main.Objects;

//import Main.Objects.Player.Main.Player;

import java.util.ArrayList;

public class ObjectAccess {

    public ArrayList<Object> currentObjects;

    public ObjectAccess(){

    }

    public void addObj(Object obj){

        currentObjects.add(obj);


    }

    public void remObj(Object obj){


        currentObjects.remove(obj);

    }

    public Object getObj(Object obj){

        return currentObjects.get(currentObjects.indexOf(obj));

    }
}
