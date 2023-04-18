package com.levochka108.backendstore.model.support;
public enum HardDisk {
    SSDSMALE("120 GB"),SSDMIDLE("500 GB"),HDDSMALE("1000 GB"),HDDMIDLE("5000 GB");

    private final String valueSolidDevice;

    HardDisk(String valueSolidDevice) {
        this.valueSolidDevice = valueSolidDevice;
    }
}
