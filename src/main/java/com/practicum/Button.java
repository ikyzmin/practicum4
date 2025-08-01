package com.practicum;

public class Button {
    private OnClickListener onClickListener;

    public Button(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    public void click() {
        onClickListener.onClick(10);
    }

    public void addOnClickListener(OnClickListener onClickListener){

    }
}
