package Main.Management;

import java.awt.image.BufferedImage;
import java.util.concurrent.TimeUnit;

// 8/3/2020 Class made to create animations
public class Animation {

    public BufferedImage[] frames;
    public BufferedImage currentFrame;
    public long time ;
    public long delay;
    public int currentIndex = 0;
    public boolean backing = false;

    public Animation(BufferedImage[] frames, long delay){

        this.frames = frames;

        this.delay = delay;

    }

    public void reverseanimate(){

        this.time = System.currentTimeMillis();

        while(TimeUnit.MILLISECONDS.toSeconds(time) != this.delay){

            this.time += System.currentTimeMillis();


        }
        if(backing == false) {
            currentIndex++;
        }else{
            currentIndex--;
        }

        if(currentIndex == frames.length){

            backing = true;

        }

        if(currentIndex == 0){

            backing = false;

        }

        currentFrame = frames[currentIndex];



        reverseanimate();


    }

    public void animate(){

        this.time = System.currentTimeMillis();

        while(TimeUnit.MILLISECONDS.toSeconds(time) != this.delay){

            this.time += System.currentTimeMillis();


        }

        currentIndex++;

        if(currentIndex == frames.length){

            currentIndex = 0;

        }

        currentFrame = frames[currentIndex];



      animate();


    }


    public BufferedImage[] getFrames() {
        return frames;
    }

    public void setFrames(BufferedImage[] frames) {
        this.frames = frames;
    }

    public BufferedImage getCurrentFrame() {
        return currentFrame;
    }

    public void setCurrentFrame(BufferedImage currentFrame) {
        this.currentFrame = currentFrame;
    }

}
