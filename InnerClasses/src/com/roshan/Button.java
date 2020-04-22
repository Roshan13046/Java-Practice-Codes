package com.roshan;

public class Button {
    private String title;
    private OnClickListner onClickListner;

    public Button(String title){
        this.title = title ;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListner(OnClickListner onClickListner) {
        this.onClickListner = onClickListner;
    }

    public void onClick(){
        this.onClickListner.onClick(this.title);
    }


    //Interface for onClick Listner
    public interface OnClickListner {
        public void onClick(String title);
    }
}
