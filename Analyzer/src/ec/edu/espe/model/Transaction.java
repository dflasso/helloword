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
public class Transaction {
    //atributos
    private Company company;
    private float feeBroker;
    private int dateTime;
    //metodos
    public void readTransactionDate(float feeBroker,int dateTime){
        this.setFeeBroker(feeBroker);
        this.setDateTime(dateTime);
    }
    public float calculateTransaction(float feeBroker,int quantityShare){
        setCompany(new Company());
        //company.readCompanyDate(feeBroker, company., quantityShare);
        return feeBroker+quantityShare;
    }

    /**
     * @return the company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(Company company) {
        this.company = company;
    }

    /**
     * @return the feeBroker
     */
    public float getFeeBroker() {
        return feeBroker;
    }

    /**
     * @param feeBroker the feeBroker to set
     */
    public void setFeeBroker(float feeBroker) {
        this.feeBroker = feeBroker;
    }

    /**
     * @return the dateTime
     */
    public int getDateTime() {
        return dateTime;
    }

    /**
     * @param dateTime the dateTime to set
     */
    public void setDateTime(int dateTime) {
        this.dateTime = dateTime;
    }
    
}
