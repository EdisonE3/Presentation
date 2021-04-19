import javax.swing.*;
import java.awt.*;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

public class View {
    PresentationMod model;

    TextField txtTitle;
    TextField txtArtist;
    JCheckBox chkClassical;
    TextField txtComposer;
    JList albumList;
    JButton apply;
    JButton cancel;

    boolean notLoadView;

    public View(){
        model = new PresentationMod(PresentationMod.AlbumDataSet());
        notLoadView = true;
        createView();
    }

    private void saveToPMod(){
        model.setArtist(txtArtist.getText());
        model.setTitle(txtTitle.getText());
        model.setIsClassical(chkClassical.isSelected());
        model.setComposer(txtComposer.getText());
    }

    private void loadFromPMod(){
        if (notLoadView){
            notLoadView = false;

        }
    }

    private void SyncWithPMod() {
        if (notLoadView) {
            saveToPMod();
            loadFromPMod();
        }
    }

    private void createView(){
        JFrame frame=new JFrame("Java示例程序");
        Box b1=Box.createHorizontalBox();    //创建横向Box容器
        Box b2=Box.createVerticalBox();    //创建纵向Box容器

        frame.add(b1);
        albumList = new JList(model.getAlbumList());
        b1.add(albumList);
        b1.add(b2);

        txtArtist = new TextField();
        txtTitle = new TextField();
        txtArtist.setSize(200, 50);
        txtTitle.setSize(200, 50);

        chkClassical = new JCheckBox();
        txtComposer = new TextField();
        txtComposer.setSize(200, 50);
        txtComposer.setEditable(model.shouldEnableComposer());

        apply = new JButton("Apply");
        apply.setSize(new Dimension(20, 20));
        cancel = new JButton("Cancel");
        cancel.setSize(new Dimension(20, 20));

        b2.add(txtArtist);
        b2.add(txtTitle);

        b2.add(chkClassical);
        b2.add(txtComposer);

        b2.add(apply);    //add button Apply
        b2.add(cancel);    //add button Cancel

        //设置窗口的关闭动作、标题、大小位置以及可见性等
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,200,500,300);
        frame.setVisible(true);
    }

}
