package jukeBox;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by mayan on 7/9/17.
 */
public class PlayList {
    private Queue<Track> queue = new ArrayDeque<>();
    public Track getCurrentTrack(){
        return  queue.peek();
    }
    public void add(Track track){
        queue.add(track);
    }
    public void remove(Track track){
        queue.remove(track);
    }
    public void addInFront(Track track){

    }
}
