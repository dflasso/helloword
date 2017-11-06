/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author USUARIO
 */
public class Company {
    private float priceCompany;
    private String symbol;
    private int totalShare;
    // metodos
    public float calculateShareUnitary(float priceCompany,int totalShare){
        return priceCompany/totalShare;
    }
    public void readCompanyDate(float priceCompany, String symbol,int totalShare){
        this.priceCompany=priceCompany;
        this.symbol=symbol;
        this.totalShare=totalShare;
    }

    /**
     * @return the priceCompany
     */
    public float getPriceCompany() {
        return priceCompany;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @return the totalShare
     */
    public int getTotalShare() {
        return totalShare;
    }
}
