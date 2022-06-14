package sweetPresent.present;

import sweetPresent.sweet.*;
import java.util.Arrays;
import java.util.Objects;

public class Present {
    private static final int DEFAULT_AMOUNT_SWEETS = 10;
    private Sweet[] sweets;
    private int lastIndexAdeed;
    {
        sweets  = new Sweet[DEFAULT_AMOUNT_SWEETS];
    }


    public Sweet[] filterSweetsBySugarRange(double minSugarWeight, double maxSugarWeight){
        int sweetsBySugarRange = 0;

        if(minSugarWeight <0 || maxSugarWeight <0) return new Sweet[0];
        for(Sweet sweet : sweets){
            if(sweet != null && sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight()<= maxSugarWeight) sweetsBySugarRange++;
        }

        Sweet[] sweetsFilteredBySugarRange = new Sweet[sweetsBySugarRange];
        int index = 0;

        for(Sweet sweet : sweets){
            if(sweet != null && sweet.getSugarWeight() >= minSugarWeight && sweet.getSugarWeight()<= maxSugarWeight) sweetsFilteredBySugarRange[index++] = sweet;
        }
        return sweetsFilteredBySugarRange;
    }

    public double calculateTotalWeight(){
        double totalWeight = 0;
        for (Sweet sweet : sweets){
            if(sweet != null && sweet.getWeight()>=0) totalWeight+=sweet.getWeight();
        }
        return totalWeight;
    }

    public void addSweet(Sweet sweet){
        if(sweet == null) return;
        if(lastIndexAdeed >= sweets.length) Arrays.copyOf(sweets, sweets.length * 2);
        sweets[lastIndexAdeed++] = sweet;
    }

    public Sweet[] getSweet(){
        int noNullSweets = 0;
        for(Sweet sweet : this.sweets){
            if(sweet != null)noNullSweets++;
        }
        Sweet[] sweetsFiltered = new Sweet[noNullSweets];
        int index = 0;
        for(Sweet sweet : this.sweets){
            if(sweet != null) sweetsFiltered[index++] =sweet;
        }
        return sweetsFiltered;
    }
}
