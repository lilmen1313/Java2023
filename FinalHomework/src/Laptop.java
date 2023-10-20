public class Laptop {
    private String firmManufacturer; //название производителя ноутбука
    private String cpu; // производитель чипа ЦП
    private Integer quantityCores; // количество ядер ЦП
    private Integer clockSpeedMhz; // тактовая частота ЦП
    private String videoAdapter; //название видеокарты
    private Integer vramGb; // объем видеопамяти
    private Integer ramGb; // объем оперативной памяти
    private Integer hardDriveCapacity; // объем жесткого диска
    private Double screenDiagonalInch; // диагональ экрана в дюймах

    public Laptop (String firmManufacturer, String cpu, Integer quantityCores, Integer clockSpeedMhz, String videoAdapter,
                   Integer vramGb, Integer ramGb, Integer hardDriveCapacity, Double screenDiagonalInch){
        this.firmManufacturer = firmManufacturer;
        this.cpu = cpu;
        this.quantityCores = quantityCores;
        this.clockSpeedMhz = clockSpeedMhz;
        this.videoAdapter = videoAdapter;
        this.vramGb = vramGb;
        this.ramGb = ramGb;
        this.hardDriveCapacity = hardDriveCapacity;
        this.screenDiagonalInch = screenDiagonalInch;
    }
    public String getFirmManufacturer(){return firmManufacturer;}
    public String getCpu(){return cpu;}
    public Integer getQuantityCores(){return quantityCores;}
    public Integer getClockSpeedMhz(){return clockSpeedMhz;}
    public String getVideoAdapter(){return videoAdapter;}
    public Integer getVramGb(){return  vramGb;}
    public Integer getRamGb(){return ramGb;}
    public Integer getHardDriveCapacity(){return hardDriveCapacity;}
    public Double getScreenDiagonalInch(){return screenDiagonalInch;}

    @Override
    public String toString() {
        return "Название производителя ноутбука: " + firmManufacturer + System.lineSeparator() +
                "Производитель чипа ЦП: " + cpu + System.lineSeparator() +
                "Количество ядер ЦП: " + quantityCores + System.lineSeparator() +
                "Тактовая частота ЦП: " + clockSpeedMhz + System.lineSeparator() +
                "Название видеокарты: " + videoAdapter + System.lineSeparator() +
                "Объем видеопамяти: " + vramGb + System.lineSeparator() +
                "Объем оперативной памяти: " + ramGb + System.lineSeparator() +
                "Объем жесткого диска: " + hardDriveCapacity + System.lineSeparator() +
                "Диагональ экрана: " + screenDiagonalInch + System.lineSeparator();
    }
}
