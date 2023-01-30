/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Addressbook;

/**
 *
 * @author maitr
 */
public class data {

    public data(int id, String pname, String phoneno, String bphoneno, String fax, String cphone, String pager, String hadd, String badd) {
        this.id = id;
        this.pname = pname;
        this.phoneno = phoneno;
        this.bphoneno = bphoneno;
        this.fax = fax;
        this.cphone = cphone;
        this.pager = pager;
        this.hadd = hadd;
        this.badd = badd;
    }
    
    int id;
    String pname;
    String phoneno;
    String bphoneno;
    String fax;
    String cphone;
    String pager;
    String hadd;    
    String badd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public String getBphoneno() {
        return bphoneno;
    }

    public void setBphoneno(String bphoneno) {
        this.bphoneno = bphoneno;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getCphone() {
        return cphone;
    }

    public void setCphone(String cphone) {
        this.cphone = cphone;
    }

    public String getPager() {
        return pager;
    }

    public void setPager(String pager) {
        this.pager = pager;
    }

    public String getHadd() {
        return hadd;
    }

    public void setHadd(String hadd) {
        this.hadd = hadd;
    }

    public String getBadd() {
        return badd;
    }

    public void setBadd(String badd) {
        this.badd = badd;
    }
    
}
