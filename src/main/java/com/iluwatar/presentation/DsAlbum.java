package com.iluwatar.presentation;

import java.util.ArrayList;

public class DsAlbum {
    public ArrayList<Album> albums;
    public ArrayList<Album> albumsCache;

    public DsAlbum() {
        this.albums = new ArrayList<>();
        this.albumsCache = new ArrayList<>();
    }

    public void addAlbums(int rowId, String title, String artist, boolean isClassical, String composer) {
        if (albumsCache == null) return;
        this.albumsCache.add(new Album(rowId, title, artist, isClassical, composer));
    }

    public void acceptChanges(){
        albums.addAll(albumsCache);
        albumsCache.clear();
    }
}
