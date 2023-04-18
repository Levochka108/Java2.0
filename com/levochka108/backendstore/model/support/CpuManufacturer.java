package com.levochka108.backendstore.model.support;
public enum CpuManufacturer {
    AMD("AMD Ryzen 7 5800H"),INTEL("Intel Core I5"),APPLE("Apple M2");

    private final String cpuName;

    CpuManufacturer(String cpuName) {
        this.cpuName = cpuName;
    }
}
