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
public class Analyzer {
    //atributos
    private String name;
    private Investor[] investor;
    private int firstDay;
    private int ultimateDay;
    //constructor
    
    //metodos
    public int calculateTime(int firstDay,int ultimateDay){
        return (ultimateDay - firstDay)*24*60*60;
    }
    public int calculatePriceCents(Investor[] investor){
        int auxliar = 0;
        return auxliar;
    }
    public float summationProfitLoss(Investor[] investor){
        float auxiliar=(float) 0.0;
        return auxiliar;
    }
    public float calculateProfitLossForDay(Investor[] investor,int firstDay,int ultimateDay){
        float auxiliar=(float) 0.0;
        return auxiliar;
    }
    public float calculateStockInvestmentDay(Investor[] investor,int firstDay,int ultimateDay){
        float auxiliar=(float) 0.0;
        return auxiliar;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the investor
     */
    public Investor[] getInvestor() {
        return investor;
    }

    /**
     * @param investor the investor to set
     */
    public void setInvestor(Investor[] investor) {
        this.investor = investor;
    }

    /**
     * @return the firstDay
     */
    public int getFirstDay() {
        return firstDay;
    }

    /**
     * @param firstDay the firstDay to set
     */
    public void setFirstDay(int firstDay) {
        this.firstDay = firstDay;
    }

    /**
     * @return the ultimateDay
     */
    public int getUltimateDay() {
        return ultimateDay;
    }

    /**
     * @param ultimateDay the ultimateDay to set
     */
    public void setUltimateDay(int ultimateDay) {
        this.ultimateDay = ultimateDay;
    }
}
