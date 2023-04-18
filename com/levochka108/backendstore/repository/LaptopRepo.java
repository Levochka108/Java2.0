package com.levochka108.backendstore.repository;

import com.levochka108.backendstore.model.BuildLaptop;
import com.levochka108.backendstore.model.support.*;

import java.rmi.MarshalledObject;
import java.util.*;

public class LaptopRepo {
    private static final Map<Integer, BuildLaptop> DataBase = new TreeMap<>();

    public static Map<Integer, BuildLaptop> connect() {
        fillDataBase();
        return DataBase;
    }

    /**
     * Последовательность заполнения базы:
     * Brand -> OperatingSystem -> CpuManufacturer -> Ram -> HardDisk -> Color
     */
    private static void fillDataBase() {
        DataBase.put(1, new BuildLaptop(Brand.MSI, OperatingSystem.WINDOWS11, CpuManufacturer.AMD, Ram.RAMMIDLE, HardDisk.SSDMIDLE, Color.BLACK));
        DataBase.put(2, new BuildLaptop(Brand.APPLE, OperatingSystem.MACOS15, CpuManufacturer.APPLE, Ram.RAMSMALL, HardDisk.SSDMIDLE, Color.GOLDEN));
        DataBase.put(3, new BuildLaptop(Brand.ASUS, OperatingSystem.FREEDOS, CpuManufacturer.AMD, Ram.RAMMIDLE, HardDisk.HDDMIDLE, Color.BLACK));
        DataBase.put(4, new BuildLaptop(Brand.LENOVO, OperatingSystem.WINDOWS11, CpuManufacturer.INTEL, Ram.RAMSMALL, HardDisk.SSDMIDLE, Color.SILVER));
        DataBase.put(5, new BuildLaptop(Brand.LENOVO, OperatingSystem.WINDOWS11, CpuManufacturer.AMD, Ram.RAMMIDLE, HardDisk.HDDMIDLE, Color.GREY));
        DataBase.put(6, new BuildLaptop(Brand.ASUS, OperatingSystem.FREEDOS, CpuManufacturer.INTEL, Ram.RAMMIDLE, HardDisk.HDDSMALE, Color.GREY));
        DataBase.put(7, new BuildLaptop(Brand.APPLE, OperatingSystem.MACOS15, CpuManufacturer.APPLE, Ram.RAMMIDLE, HardDisk.SSDMIDLE, Color.BLACK));
    }

    public List<BuildLaptop> getByBrand(Brand brand){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getBrand() == brand) {
                result.add(value);
            }
        });
        return result;
    }
    public List<BuildLaptop> getByOs(OperatingSystem osSys){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getOperatingSystem() == osSys) {
                result.add(value);
            }
        });
        return result;
    }
    public List<BuildLaptop> getByCpu(CpuManufacturer cpu){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getCpuManufacturer() == cpu) {
                result.add(value);
            }
        });
        return result;
    }
    public List<BuildLaptop> getByRAm(Ram ram){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getRam() == ram) {
                result.add(value);
            }
        });
        return result;
    }
    public List<BuildLaptop> getByHardDisk(HardDisk hardDisk){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getHardDisk() == hardDisk) {
                result.add(value);
            }
        });
        return result;
    }
    public List<BuildLaptop> getByColor(Color color){
        List<BuildLaptop> result = new ArrayList<>();
        DataBase.forEach((key, value) -> {
            if (value.getColor() == color) {
                result.add(value);
            }
        });
        return result;
    }
}
