package com.iluwatar.presentation;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class View {
    PresentationMod model;

    TextField txtTitle;
    TextField txtArtist;
    JCheckBox chkClassical;
    TextField txtComposer;
    JList<String> albumList;
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
        txtArtist.setText(model.getArtist());
        txtTitle.setText(model.getTitle());
        chkClassical.setSelected(model.getIsClassical());
        txtComposer.setEditable(model.getIsClassical());
        txtComposer.setText(model.getComposer());
    }

    private void createView(){
        JFrame frame=new JFrame("Album");
        Box b1=Box.createHorizontalBox();    //创建横向Box容器
        Box b2=Box.createVerticalBox();    //创建纵向Box容器

        frame.add(b1);
        albumList = new JList<>(model.getAlbumList());
        albumList.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                model.setSelectedAlbumNumber(albumList.getSelectedIndex()+1);
                loadFromPMod();
            }
        });
        b1.add(albumList);
        b1.add(b2);

        txtArtist = new TextField();
        txtTitle = new TextField();
        txtArtist.setSize(200, 50);
        txtTitle.setSize(200, 50);

        chkClassical = new JCheckBox();
        txtComposer = new TextField();
        chkClassical.addActionListener(ItemEvent->{
            txtComposer.setEditable(chkClassical.isSelected());
            if (!chkClassical.isSelected()){
                txtComposer.setText("");
            }
        });
        txtComposer.setSize(200, 50);
        txtComposer.setEditable(model.getIsClassical());

        apply = new JButton("Apply");
        apply.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                saveToPMod();
                loadFromPMod();
            }
        });
        cancel = new JButton("Cancel");
        cancel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                loadFromPMod();
            }
        });

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
