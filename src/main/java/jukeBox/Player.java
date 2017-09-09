package jukeBox;

/**
 * Created by mayan on 6/9/17.
 */
public abstract class Player {
    protected PlayList playList = new PlayList();
    public PlayList getPlayList() {
        return playList;
    }

    public void setPlayList(PlayList playList) {
        this.playList = playList;
    }
    public void playNewTrack(Track track){
        getPlayList().addInFront(track);
        getPlayList().getCurrentTrack().play();
    }
    public void play(){
        getPlayList().getCurrentTrack().play();
    }
    public void pause(){
        getPlayList().getCurrentTrack().pause();
    }
    public void stop(){
        getPlayList().getCurrentTrack().stop();
    }

}
