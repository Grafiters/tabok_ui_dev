package com.example.tabok_ui_dev;

public class PresensiModels {
    private String matkul_presen, kelas_presen, result_presen;

    public PresensiModels(String matkul, String kelas, String result){
        this.matkul_presen = matkul;
        this.kelas_presen = kelas;
        this.result_presen = result;
    }

    public String getMatkul_presen() {
        return matkul_presen;
    }

    public String getResult_presen() {
        return result_presen;
    }

    public String getKelas_presen() {
        return kelas_presen;
    }

    public void setMatkul_presen(String matkul) {
        this.matkul_presen = matkul;
    }

    public void setResult_presen(String result) {
        this.result_presen = result;
    }

    public void setKelas_presen(String kelas) {
        this.kelas_presen = kelas;
    }
}
