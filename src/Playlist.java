import java.util.ArrayList;

public class Playlist {
    private String name;
    private ArrayList<String> songs = new ArrayList<>();

    public Playlist(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void addSong(String songName){
        songs.add(songName);
    }

    public void removeSong(String songName){
        songs.remove(songName);
    }

    public void printSongs(){
        System.out.println("Playlist name: " + name);
        if (songs.size() < 1){
            System.out.println("Playlist is empty.");
        }
        System.out.println(songs);
    }

    public int getSongCount(){
        return songs.size();
}
}
