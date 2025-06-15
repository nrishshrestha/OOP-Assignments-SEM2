public class MediaPlayer {
    void play(){
        System.out.println("Media starts playing");
    }
    void pause(){
        System.out.println("Player pauses");
    }
    void stop(){
        System.out.println("Player stops");
    }
}

interface Playlist{
    public void addSong(String song);
    public void removeSong(String song);
}

class VideoPlayer extends MediaPlayer implements Playlist{
    void rewind(){
        System.out.println("Rewinds");
    }
    void fastForward(){
        System.out.println("Fast forwarding");
    }

    @Override
    public void addSong(String song) {
        System.out.println("Song added"+ song);
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Song removed"+ song);
    }
}

class ImplementMedia{
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.pause();
        vp.stop();
        vp.rewind();
        vp.fastForward();
        vp.addSong("Let down");
        vp.removeSong("No suprises");
    }
}