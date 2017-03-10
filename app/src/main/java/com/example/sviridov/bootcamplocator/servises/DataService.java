package com.example.sviridov.bootcamplocator.servises;

import com.example.sviridov.bootcamplocator.model.BootCamp;

import java.util.ArrayList;

/**
 * Created by Artem on 25.02.2017.
 */
public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<BootCamp> getBootCampLocationWithin10milesZip(int zipCode) {


        ArrayList<BootCamp> list = new ArrayList<>();
        list.add(new BootCamp(36.227f, 50.006f, "Харківський національний університет імені В.Н. Каразіна", "майдан Свободи, 4, Харків, Харківська область, Украина, 61000", "univer.kharkov.ua"));
        list.add(new BootCamp(36.247f, 50.019f, "Центральный парк культуры и отдыха им. М. Горького", "вул. Сумська, 81, Харків, Харківська область, Украина, 61000", "centralpark.kh.ua"));
        list.add(new BootCamp(36.281f, 49.918f, "Международный аэропорт Харьков", "вул. Ромашкiна, 1, Харків, Харківська область, Украина, 61000", "hrk.aero"));

        return list;
    }
}
