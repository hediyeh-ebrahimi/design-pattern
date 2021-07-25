package com.tutorial.state;

public class On implements RemoteControl {
    public static On INSTANCE = null;

    private On() {
    }

    public static On getInstance(){
        if(INSTANCE != null){
            return INSTANCE;
        }
        return new On();
    }

    @Override
    public void switchState(Tv tv) {
        System.out.println("Tv is now On ...");
        tv.setRemoteControl(Off.getInstance());
        System.out.println("Tv is now Off ...");
    }
}
