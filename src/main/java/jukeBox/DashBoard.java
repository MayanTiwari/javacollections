package jukeBox;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by mayan on 6/9/17.
 */
public abstract class DashBoard {
    protected Player player;

    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
    public void selectPlayer(){
    }
    public void selectMusic() {

    }
    public void startNewTrack(){
        Track track = new Track("songName",4);
        if (this.getPlayer()!=null){
            getPlayer().playNewTrack(track);
        }
    }
    public void play(){
        if(this.getPlayer() !=null){
           getPlayer().play();
        }
    }
    public void pause(){
        if(this.getPlayer() !=null){
            getPlayer().pause();
        }
    }
    public void stop(){
        if(this.getPlayer() !=null){
           getPlayer().stop();
        }
    }
}
