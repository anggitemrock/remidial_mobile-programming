package com.example.Anggit_ListMahasiswa.Pertama;

public class Student {
    private final String name;
    private final String nim;

    public Student(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }
}
