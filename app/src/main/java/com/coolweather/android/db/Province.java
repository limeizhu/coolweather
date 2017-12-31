package com.coolweather.android.db;

/**
 * Created by PC-2017 on 2017/12/31.
 */

public class Province extends DataSupport {
    private  int id;
    private  String provinceName;
    private  int provinceCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String province){
        this.provinceName =provinceName;
    }
    public int getProvinceCode(){
        return  provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
