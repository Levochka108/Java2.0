package com.levochka108.notebookclass.db;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class NoteBook {

    public void setPrice(Double inPrice) {
        price = inPrice;
    }

    public Boolean isMatchResolution(String inResolution) {
        return findStr(screenResolution, inResolution);
    }

    public Boolean isMatchCPUType(String inCpu) {
        return findStr(cpuFamily, inCpu);
    }

    public Boolean isMatchOSType(String inOS) {
        return findStr(osPreinstall, inOS);
    }

    public Boolean isMatchPrice(Double minPrice, Double maxPrice) {
        return price >= minPrice && price <= maxPrice;
    }

    public Boolean isMatchRAM(Integer minRAM, Integer maxRAM) {
        return volRAM >= minRAM && volRAM <= maxRAM;
    }

    private String findRegex(String inStr, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inStr);
        return matcher.find() ? matcher.group() : "";
    }

    private Boolean findStr(String par, String inStr) {
        Pattern pattern = Pattern.compile(inStr.replace(" ", "").toLowerCase());
        Matcher matcher = pattern.matcher(par.replace(" ", "").toLowerCase());
        return matcher.find();
    }

    private Double price; // цена
    private final String brand; // бренд
    private final String model; // модель
    private final String color; // цвет
    private final Double size; // диагональ
    private final String screenResolution; // разрешение
    private final String matrixType; // тип матрицы
    private final String cpuFamily; // марка ЦПУ
    private final Integer cpuCores; // количество ядер
    private final Double cpuFrequency; // частота ЦПУ
    private final Integer volRAM; // объем оперативной памяти
    private final String typeHDD; // тип накопителя
    private final Integer volHDD; // объем накопителя
    private final String videoAdaptor; // марка видеокарты
    private final String osPreinstall; // операционная система
    /**
     * Конструктор класса Notebook
     */
    public NoteBook(String strToParse) {
        // генерируем цену от 0 до 1000
        setPrice((double) ((int) (Math.random() * 100_000)));
        brand = findRegex(strToParse, "(?<=Ноутбук\\s)[a-zA-Z]*(?=\\s)");
        model = findRegex(strToParse, "(?<=" + brand + "\\s).*(?=\\s[а-я]*\\s\\[)");
        color = findRegex(strToParse, "(?<=\\s)[а-яА-Я]*(?=\\s\\[)");
        size = Double.parseDouble(findRegex(strToParse, "[0-9]{1,2}.?[0-9]?(?=\\\")"));
        String[] paramsRAW = findRegex(strToParse, "(?<=\\[).*(?=\\])").split(", ");
        screenResolution = paramsRAW[0];
        matrixType = paramsRAW[1];
        cpuFamily = paramsRAW[2];
        cpuCores = Integer.parseInt(findRegex(paramsRAW[3], "(?<=ядра\\:\\s)[0-9]{1,2}(?=\\sх)"));
        cpuFrequency = Double.parseDouble(findRegex(paramsRAW[3], "(?<=х\\s).*(?=\\sГГц)"));
        volRAM = Integer.parseInt(findRegex(paramsRAW[4], "(?<=RAM\\s)[0-9]{1,3}(?=\\sГБ)"));
        typeHDD = findRegex(paramsRAW[5], "[a-zA-Z]{1,}");
        volHDD = Integer.parseInt(findRegex(paramsRAW[5], "[0-9]{1,}"));
        videoAdaptor = paramsRAW[6];
        osPreinstall = paramsRAW[7];
    }

    @Override
    public String toString() {
        return "Laptop: {" +
                ", size='" + size + '\'' +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", screen='" + screenResolution + '\'' +
                ", matrix type='" + matrixType + '\'' +
                ", CPU cores='" + cpuCores + '\'' +
                ", CPU frequency='" + cpuFrequency + '\'' +
                ", RAM='" + volRAM + '\'' +
                ", SSD='" + volHDD + '\'' +
                ", video card='" + videoAdaptor + '\'' +
                ", os system='" + osPreinstall + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

}
