package com.levochka108.notebookclass.db;

import java.util.LinkedList;

public class DataBase {
    public DataBase() {
        // Генерируем БД, парсим строки с сайта ДНС :-):
        dataBaseLaptop.add(new NoteBook("14\" Ноутбук ASUS Laptop 14 F415MA-EK582W серый [Full HD (1920x1080), TN+film, Intel Celeron N4020, ядра: 2 х 1.1 ГГц, RAM 4 ГБ, SSD 128 ГБ, Intel UHD Graphics , Windows 11 Home Single Language]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук Acer Aspire 1 A115-32-P859 серебристый [Full HD (1920x1080), TN+film, Intel Pentium Silver N6000, ядра: 4 х 1.1 ГГц, RAM 8 ГБ, eMMC 128 ГБ, Intel UHD Graphics , Windows 11 Home Single]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук Lenovo IdeaPad 3 15ADA05 серый [Full HD (1920x1080), IPS, AMD 3020e, ядра: 2 х 1.2 ГГц, RAM 4 ГБ, SSD 256 ГБ, AMD Radeon Graphics , без ОС]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук Echips Envy серебристый [Full HD (1920x1080), IPS, Intel Celeron J4125, ядра: 4 х 2 ГГц, RAM 8 ГБ, SSD 240 ГБ, Intel UHD Graphics 600 , Windows 10 Pro]"));
        dataBaseLaptop.add(new NoteBook("14\" Ноутбук HP Laptop 14s-fq0019ur черный [Full HD (1920x1080), IPS, AMD Athlon Silver 3050U, ядра: 2 х 2.3 ГГц, RAM 4 ГБ, SSD 256 ГБ, AMD Radeon Graphics , без ОС]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук Maibenben M543 серебристый [Full HD (1920x1080), IPS, AMD Ryzen 3 4300U, ядра: 4 х 2.7 ГГц, RAM 8 ГБ, SSD 256 ГБ, AMD Radeon Graphics , Linux]"));
        dataBaseLaptop.add(new NoteBook("14\" Ноутбук Chuwi CoreBook X 14 серый [2160x1440, IPS, Intel Core i3-10110U, ядра: 2 х 2.1 ГГц, RAM 8 ГБ, SSD 256 ГБ, Intel UHD Graphics , Windows 11 Home Single Language]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук ASUS Laptop 15 F515EA-EJ1437 серебристый [Full HD (1920x1080), TN+film, Intel Pentium Gold 7505, ядра: 2 х 2 ГГц, RAM 8 ГБ, SSD 256 ГБ, Intel UHD Graphics , без ОС]"));
        dataBaseLaptop.add(new NoteBook("14\" Ноутбук HUAWEI MateBook D 14 NbD-WDH9 серебристый [Full HD (1920x1080), IPS, Intel Core i5-1135G7, ядра: 4 х 2.4 ГГц, RAM 8 ГБ, SSD 512 ГБ, Intel Iris Xe Graphics , Windows 11 Home Single Language]"));
        dataBaseLaptop.add(new NoteBook("15.6\" Ноутбук ASUS VivoBook 15X OLED M1503QA-L1225 синий [Full HD (1920x1080), OLED, AMD Ryzen 5 5600H, ядра: 6 х 3.3 ГГц, RAM 16 ГБ, SSD 512 ГБ, AMD Radeon Graphics , без ОС]"));
        dataBaseLaptop.add(new NoteBook("16.2\" Ноутбук Apple MacBook Pro серый [3456x2234, mini-LED, Apple M1 Pro, ядра: 8 х 2 ГГц, RAM 16 ГБ, SSD 1024 ГБ, Apple M1 Pro 16-core , macOS]"));
    }
    private final LinkedList<NoteBook> dataBaseLaptop = new LinkedList<>();

    public void searchByResolution(String resolution) {
        for (NoteBook laptop : dataBaseLaptop) if (laptop.isMatchResolution(resolution)) System.out.println(laptop);
    }

    public void searchByCPU(String cpu) {
        for (NoteBook laptop : dataBaseLaptop) if (laptop.isMatchCPUType(cpu)) System.out.println(laptop);
    }

    public void searchByOS(String os) {
        for (NoteBook laptop : dataBaseLaptop) if (laptop.isMatchOSType(os)) System.out.println(laptop);
    }

    public void searchByPrice(Double min, Double max) {
        for (NoteBook laptop : dataBaseLaptop) if (laptop.isMatchPrice(min, max)) System.out.println(laptop);
    }

    public void searchByRAM(Integer min, Integer max) {
        for (NoteBook laptop : dataBaseLaptop) if (laptop.isMatchRAM(min, max)) System.out.println(laptop);
    }
}
