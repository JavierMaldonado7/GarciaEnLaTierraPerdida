package Main.Objects.Player.Main;

import Main.Objects.Object;

public class Charly extends Object {

    //Charly location String
    public String location;

    //Charly stats
    public int hearts;
    public String power;
    public int DMG;

    //Charly's current state


    public Charly(int x, int y, int width, int height){

        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);

    }

    //Power methods
    public void checkPower(String power){

        if(power.equals("voz")){

            this.DMG = 3;

        }

        if(power.equals("guitarra")){

            this.DMG = 6;

        }

        if(power.equals("piano")){

            this.DMG = 10;

        }

    }

//GETTERS AND SETTERS

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHearts() {
        return hearts;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
