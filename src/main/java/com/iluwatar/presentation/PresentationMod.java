package com.iluwatar.presentation;

public class PresentationMod {
    private final DsAlbum data;
    private int selectedAlbumNumber;
    private Album selectedAlbum;
    
    public static DsAlbum AlbumDataSet() {
        DsAlbum result = new DsAlbum();
        result.addAlbums(1, "HQ", "Roy Harper", false, null);
        result.addAlbums(2, "The Rough Dancer and Cyclical Night", "Astor Piazzola", false, null);
        result.addAlbums(3, "The Black Light", "Calexico", false, null);
        result.addAlbums(4, "Symphony No.5", "CBSO", true, "Sibelius");
        result.acceptChanges();
        return result;
    }

    public PresentationMod(DsAlbum data) {
        this.data = data;
        this.selectedAlbumNumber = 1;
        this.selectedAlbum = data.albums.get(0);
    }
    
    public void setSelectedAlbumNumber(int selectedAlbumNumber) {
        this.selectedAlbumNumber = selectedAlbumNumber;
        this.selectedAlbum = data.albums.get(this.selectedAlbumNumber - 1);
    }

    public String getTitle() {
        return selectedAlbum.title;
    }

    public void setTitle(String value) {
        selectedAlbum.title = value;
    }

    public String getArtist() {
        return selectedAlbum.artist;
    }

    public void setArtist(String value) {
        selectedAlbum.artist = value;
    }

    public boolean getIsClassical() {
        return selectedAlbum.isClassical;
    }

    public void setIsClassical(boolean value) {
        selectedAlbum.isClassical = value;
    }

    public String getComposer() {
        return selectedAlbum.isClassical ? selectedAlbum.composer : "";
    }

    public void setComposer(String value) {
        if (selectedAlbum.isClassical) {
            selectedAlbum.composer = value;
            
        }
    }

    public String[] getAlbumList(){
        String[] result = new String[data.albums.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = data.albums.get(i).title;
        }
        return result;
    }


}
