public class PresentationMod {
    private DsAlbum data;
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
        this.selectedAlbum = DsAlbum.albums.get(0);
    }

    public DsAlbum getData() {
        return data;
    }

    public void setData(DsAlbum data) {
        this.data = data;
    }

    public int getSelectedAlbumNumber() {
        return selectedAlbumNumber;
    }

    public void setSelectedAlbumNumber(int selectedAlbumNumber) {
        this.selectedAlbumNumber = selectedAlbumNumber;
        this.selectedAlbum = DsAlbum.albums.get(selectedAlbumNumber - 1);
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

    public String getFormTitle(){
        return "Album: " + getTitle();
    }

    public boolean shouldEnableComposer() {
        return selectedAlbum.isClassical;
    }


}
