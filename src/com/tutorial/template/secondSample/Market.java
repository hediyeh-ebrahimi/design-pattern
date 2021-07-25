package com.tutorial.template.secondSample;

public abstract class Market {
    public final void shop(boolean isGifted){
        doSelect();
        if(isGifted) doWrap();
        doPayment();
        doDelivery();

    }

    protected abstract void doSelect();
    private void doWrap(){
        System.out.println("Wrap method in Shop Class.");
    }

    protected abstract void doPayment();

    protected abstract void doDelivery();

}
