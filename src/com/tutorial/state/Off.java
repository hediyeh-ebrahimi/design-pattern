package com.tutorial.state;

public class Off implements RemoteControl {
    public static Off INSTANCE = null;

    private Off() {
    }

    public static Off getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        return new Off();
    }

    @Override
    public void switchState(Tv tv) {
        System.out.println("Tv is now Off ...");
        tv.setRemoteControl(On.getInstance());
        System.out.println("Tv is now On ...");
    }
}
