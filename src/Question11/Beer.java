/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question11;

import java.util.Objects;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Beer {
     private String beerName;
    private double alcoholPercentage;

    public Beer(String beerName, double alcoholPercentage) {
        this.beerName = beerName;
        this.alcoholPercentage = alcoholPercentage;
    }

    public String getBeerName() {
        return beerName;
    }

    public double getAlcoholPercentage() {
        return alcoholPercentage;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.beerName);
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.alcoholPercentage) ^ (Double.doubleToLongBits(this.alcoholPercentage) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Beer other = (Beer) obj;
        if (Double.doubleToLongBits(this.alcoholPercentage) != Double.doubleToLongBits(other.alcoholPercentage)) {
            return false;
        }
        if (!Objects.equals(this.beerName, other.beerName)) {
            return false;
        }
        return true;
    }

}