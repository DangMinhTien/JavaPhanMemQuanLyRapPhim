/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baitaplon.Model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Phim implements Serializable{
    private String Maphim;
    private String Tenphim ;
    private String giochieu;
    public Phim(){
        
    }

    public Phim(String Maphim,String Tenphim, String giochieu) {
        this.Maphim = Maphim;
        this.Tenphim = Tenphim;
        this.giochieu = giochieu;
       
    }
    @Override
    public boolean equals(Object obj){
        if(getClass() != obj.getClass()){
            return false;
        }
        Phim other = (Phim) obj;
        if(!other.getMaphim().equals(Maphim)){
            return false;
        }
        return true;
    }
    public void setMaphim(String Maphim) {
        this.Maphim = Maphim;
    }

    public void setTenphim(String Tenphim) {
        this.Tenphim = Tenphim;
    }

    public void setGiochieu(String giochieu) {
        this.giochieu = giochieu;
    }

    


    public String getMaphim() {
        return Maphim;
    }

    public String getTenphim() {
        return Tenphim;
    }

    public String getGiochieu() {
        return giochieu;
    }

    
}
