package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;

public class CameraAdapter implements Accessory {
    // private final Camera camera;
    private Camera camera;

    public CameraAdapter(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void activate() {
        camera.snapPhotos(5);
    }
}
