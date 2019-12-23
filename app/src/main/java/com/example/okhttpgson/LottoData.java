package com.example.okhttpgson;

public class LottoData {
   private String drwNo;
   private String drwtNo1;
   private String drwtNo2;
   private String drwtNo3;
   private String drwtNo4;
   private String drwtNo5;
   private String drwtNo6;
   private String bnusNo;

    public LottoData(String drwNo, String drwtNo1, String drwtNo2, String drwtNo3, String drwtNo4, String drwtNo5, String drwtNo6, String bnusNo) {
        this.drwNo = drwNo;
        this.drwtNo1 = drwtNo1;
        this.drwtNo2 = drwtNo2;
        this.drwtNo3 = drwtNo3;
        this.drwtNo4 = drwtNo4;
        this.drwtNo5 = drwtNo5;
        this.drwtNo6 = drwtNo6;
        this.bnusNo = bnusNo;
    }

    public String getDrwNo() {
        return drwNo;
    }

    public void setDrwNo(String drwNo) {
        this.drwNo = drwNo;
    }

    public String getDrwtNo1() {
        return drwtNo1;
    }

    public void setDrwtNo1(String drwtNo1) {
        this.drwtNo1 = drwtNo1;
    }

    public String getDrwtNo2() {
        return drwtNo2;
    }

    public void setDrwtNo2(String drwtNo2) {
        this.drwtNo2 = drwtNo2;
    }

    public String getDrwtNo3() {
        return drwtNo3;
    }

    public void setDrwtNo3(String drwtNo3) {
        this.drwtNo3 = drwtNo3;
    }

    public String getDrwtNo4() {
        return drwtNo4;
    }

    public void setDrwtNo4(String drwtNo4) {
        this.drwtNo4 = drwtNo4;
    }

    public String getDrwtNo5() {
        return drwtNo5;
    }

    public void setDrwtNo5(String drwtNo5) {
        this.drwtNo5 = drwtNo5;
    }

    public String getDrwtNo6() {
        return drwtNo6;
    }

    public void setDrwtNo6(String drwtNo6) {
        this.drwtNo6 = drwtNo6;
    }

    public String getBnusNo() {
        return bnusNo;
    }

    public void setBnusNo(String bnusNo) {
        this.bnusNo = bnusNo;
    }

    @Override
    public String toString() {
        return "LottoData{" +
                "drwNo='" + drwNo + '\'' +
                ", drwtNo1='" + drwtNo1 + '\'' +
                ", drwtNo2='" + drwtNo2 + '\'' +
                ", drwtNo3='" + drwtNo3 + '\'' +
                ", drwtNo4='" + drwtNo4 + '\'' +
                ", drwtNo5='" + drwtNo5 + '\'' +
                ", drwtNo6='" + drwtNo6 + '\'' +
                ", bnusNo='" + bnusNo + '\'' +
                '}';
    }
}
