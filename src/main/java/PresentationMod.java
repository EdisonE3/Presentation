public class PresentationMod {
    boolean isClassical;
    String composer;
    Album album;

    public boolean shouldEnableComposer(){
        return this.isClassical;
    }

    public static DsAlbum AlbumDataSet(){
        DsAlbum result = new DsAlbum();
        
        return result;
    }
}
