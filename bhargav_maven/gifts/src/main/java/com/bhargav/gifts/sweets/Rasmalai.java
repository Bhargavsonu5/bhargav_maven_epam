package com.bhargav.gifts.sweets;

/**
 * @author bhargav
 *
 */
public class Rasmalai extends Sweet{
    public Rasmalai() {
        setSweetness(0);
        setWeight(0);
    }
    public Rasmalai(double weight,double sweetness) {
        setSweetness(sweetness);
        setWeight(weight);
    }
}