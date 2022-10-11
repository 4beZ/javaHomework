public enum Seasons {
    WINTER(-15, "зима"), SPRING(5, "весна"), SUMMER(20, "лето"), AUTUMN(0, "осень");

    private int avgTemp;
    private String trans;
    Seasons(int avgTemp, String trans) {
        this.avgTemp = avgTemp;
        this.trans = trans;
    }

    public String getDescription () {
        if (this == SUMMER)
            return "Теплое время года";
        else
            return "Холодное время года";
    }

    public String getTrans () {
        return this.trans;
    }

    public String toString () {
        return "Время года: " + this.trans + "\n" +
                "Средняя температура: " + this.avgTemp + "\n" +
                "Описание: " + this.getDescription() + "\n" +
                "----------------";
    }
}
