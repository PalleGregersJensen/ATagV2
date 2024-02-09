package org.example;

public class SpanTag extends Tag{
    public spanTag () {
    this.setTagName("p");
    }

    public spanTag (String text) {
        this();
        super.setText(text);
    }

    public boolean hasLineShift() {
        return false
    }

}


