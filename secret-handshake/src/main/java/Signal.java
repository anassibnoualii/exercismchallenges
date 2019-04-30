enum Signal {

    WINK(1), DOUBLE_BLINK(2), CLOSE_YOUR_EYES(4), JUMP(8);
    int index;

    Signal(int index) {
        this.index=index;

    }
    public int getIndex(){
        return index;
    }
}
