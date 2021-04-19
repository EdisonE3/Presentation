import javax.swing.*;    //导包
import java.awt.*;

public class View {
    PresentationMod model;
    TextField txtTitle;
    TextField txtArtist;
    JCheckBox chkClassical;
    TextField txtComposer;

    public View(){
        model = new PresentationMod(PresentationMod.AlbumDataSet());
    }


}
