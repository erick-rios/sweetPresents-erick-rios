package sweetPresent.sweet;

public abstract class Cookie extends Sweet{
    private double doughWeight;

    public void setDoughWeight(double doughWeight){
        this.doughWeight = doughWeight;
    }
    public double getDoughWeight(){
        return this.doughWeight;
    }
}
