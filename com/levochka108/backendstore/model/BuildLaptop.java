package com.levochka108.backendstore.model;

import com.levochka108.backendstore.model.support.*;

public class BuildLaptop {
    private final Brand brand;
    private final OperatingSystem operatingSystem;
    private final CpuManufacturer cpuManufacturer;
    private final Ram ram;
    private final HardDisk hardDisk;
    private final Color color;

    public BuildLaptop(Brand brand, OperatingSystem operatingSystem, CpuManufacturer cpuManufacturer, Ram ram, HardDisk hardDisk, Color color) {
        this.brand = brand;
        this.operatingSystem = operatingSystem;
        this.cpuManufacturer = cpuManufacturer;
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.color = color;
    }

    public Brand getBrand() {
        return brand;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public CpuManufacturer getCpuManufacturer() {
        return cpuManufacturer;
    }

    public Ram getRam() {
        return ram;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public Color getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand=" + brand +
                ", operatingSystem=" + operatingSystem +
                ", cpuManufacturer=" + cpuManufacturer +
                ", ram=" + ram +
                ", hardDisk=" + hardDisk +
                ", color=" + color +
                '}';
    }
}
