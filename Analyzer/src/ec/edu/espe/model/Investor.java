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
public class Investor {
    //atribitos
    private float money;
    private Transaction[] sellTransaction;
    private Transaction[] buyTransaction;
    private float investment;
    private float profitLoss;
    //metodos
    private float calculeInvestment(float investment,Transaction[] sellTransaction,Transaction[] buyTransaction){
        return investment;
    }
    private float calculeProfitLoss(float investment,Transaction[] sellTransaction,Transaction[] buyTransaction){ 
        return investment;
    }

    /**
     * @return the money
     */
    public float getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(float money) {
        this.money = money;
    }

    /**
     * @return the investment
     */
    public float getInvestment() {
        return investment;
    }

    /**
     * @param investment the investment to set
     */
    public void setInvestment(float investment) {
        this.investment = investment;
    }

    /**
     * @return the profitLoss
     */
    public float getProfitLoss() {
        return profitLoss;
    }

    /**
     * @param profitLoss the profitLoss to set
     */
    public void setProfitLoss(float profitLoss) {
        this.profitLoss = profitLoss;
    }
    
}
