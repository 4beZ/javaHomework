public enum Sizes {
    XXS((byte) 32), XS((byte) 34), S((byte) 36), M((byte) 38), L((byte) 40);

    byte euroSize;

    Sizes(byte euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription () {
        if (this == XXS)
            return "Детский размер";
        else
            return "Взрослый размер";
    }
}
