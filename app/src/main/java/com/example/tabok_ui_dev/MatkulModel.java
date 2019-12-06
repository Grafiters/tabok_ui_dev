package com.example.tabok_ui_dev;

public class MatkulModel {
    private String matkul, time, kelas;

    public MatkulModel(String matkul, String time, String kelas){
        this.matkul = matkul;
        this.time = time;
        this.kelas = kelas;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getKelas() {
        return kelas;
    }

    public String getTime() {
        return time;
    }

    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
