package jukeBox;

/**
 * Created by mayan on 7/9/17.
 */
public class Track {
    private String songName;
    private double duration;
    private String album;
    private MusicCatagory musicCatagory;

    public Track(String songName, double duration) {
        this.songName = songName;
        this.duration = duration;
    }

    public void play(){

    }
    public void pause(){

    }
    public void stop(){

    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public MusicCatagory getMusicCatagory() {
        return musicCatagory;
    }

    public void setMusicCatagory(MusicCatagory musicCatagory) {
        this.musicCatagory = musicCatagory;
    }
    public String getSongName() {
        return songName;
    }
    public void setSongName(String songName) {
        this.songName = songName;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    @Override
    public String toString() {
        return "Track{" +
                "songName='" + songName + '\'' +
                ", duration=" + duration +
                '}';
    }
}
