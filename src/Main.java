public class Main {
    public static void main(String[] args) {
        Playlist t1 = new Playlist("My Favorite Songs");
        t1.addSong("selam1");
        t1.addSong("selam2");
        t1.addSong("selam3");
        t1.printSongs();
        t1.getSongCount();
        t1.removeSong("selam2");
        t1.printSongs();
}
}
