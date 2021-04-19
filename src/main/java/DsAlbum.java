import java.util.ArrayList;

public class DsAlbum {
    public static ArrayList<Album> albums = new ArrayList<>();
    public ArrayList<Album> albumsCache;

    public DsAlbum() {
        this.albumsCache = new ArrayList<>();
    }

    public void addAlbums(int rowId, String title, String artist, boolean isClassical, String composer) {
        if (albumsCache == null) return;
        this.albumsCache.add(new Album(rowId, title, artist, isClassical, composer));
    }

    public void acceptChanges(){
        for (Album album : albumsCache) {
            albums.set(album.rowId - 1, album);
        }
        albumsCache.clear();
    }
}