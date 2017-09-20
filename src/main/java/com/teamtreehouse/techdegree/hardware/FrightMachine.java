package com.teamtreehouse.techdegree.hardware;

import com.example.accessory.Accessory;
import com.example.accessory.Horn;
import com.example.accessory.Strobe;
import com.example.motion.MotionDetector;

import java.util.ArrayList;
import java.util.List;

public class FrightMachine extends MotionDetector {

    private List<Accessory> accessories = new ArrayList<>();

    private final Horn horn;
    private final Strobe strobe;
    // private final Camera camera;
    private final CameraAdapter cameraAdapter;

    public void addAccessories(Accessory accessory) {
        accessories.add(accessory);
    }

    public FrightMachine() {
        horn = new Horn();
        strobe = new Strobe();
        // camera = new Camera();
        cameraAdapter = new CameraAdapter(new Camera());

        addAccessories(horn);
        addAccessories(strobe);
        addAccessories(cameraAdapter);
    }

    @Override
    public void onMotionDetected() {

        for (Accessory accessory : accessories) {
            accessory.activate();
        }

        // TODO: This is hardcoded, we should make it more extensible!  :(
        // horn.activate();
        // strobe.activate();
        // camera.snapPhotos(5);
    }
}
