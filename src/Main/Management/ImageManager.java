package Main.Management;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ImageManager {

    //list of Images
    public ArrayList<File> filesList = new ArrayList<File>();
    public ArrayList<BufferedImage> buffList = new ArrayList<BufferedImage>();

    //BufferedImage declaration
    public BufferedImage Charly = null;
    public BufferedImage background = null;
    public BufferedImage Spinetta = null;
    public BufferedImage ElGorro = null;
    public BufferedImage ElBloque= null;
    public BufferedImage backgroundBattle = null;
    public BufferedImage FULLNOTE = null;
    public BufferedImage EMPTYNOTE = null;
    public Animation animation;




    public ImageManager() {





    }


    //ADDS FILE OF IMAGE TO BE ASSIGNED TO CORRESPONDING BUFF-IMAGE 8/3/2020
    public void addImages(){

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\Charly.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\titlescreen.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\spinetta.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\elcubo.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\battleback.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\elgorro.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\EMPTYNOTE.png"));

        filesList.add(new File("C:\\Users\\Javie\\IdeaProjects\\GarciaEnLaTierraPerdida\\src\\Resources\\Images\\FULLNOTE.png"));

    }


    //ADDS OBJECTS TO LIST OF BUFF-IMAGES 8/3/2020
    public void  addBuffered(){

        buffList.add(Charly);
        buffList.add(background);
        buffList.add(Spinetta);
        buffList.add(ElBloque);
        buffList.add(backgroundBattle);
        buffList.add(ElGorro);
        buffList.add(EMPTYNOTE);
        buffList.add(FULLNOTE);


    }

    //ASSIGNS DESIGNATED IMAGE FILE TO BUFF-IMAGE OBJECT IN LIST(MADE IN SAME ORDER OF ASSIGNMENT 8/3/2020
    public void assignImages() throws IOException {

        for(int i = 0; i <= filesList.size()-1; i ++) {

            buffList.set(i, ImageIO.read(filesList.get(i)));

        }

    }

    public ArrayList<File> getFilesList() {
        return filesList;
    }

    public void setFilesList(ArrayList<File> filesList) {
        this.filesList = filesList;
    }

    public ArrayList<BufferedImage> getBuffList() {
        return buffList;
    }

    public void setBuffList(ArrayList<BufferedImage> buffList) {
        this.buffList = buffList;
    }

}
