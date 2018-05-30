public class AgeCalculator {

    double earthAge;

    public AgeCalculator(double earthAge) {
        this.earthAge = earthAge;
    }

    public double getEarthAge() {
        return earthAge;
    }

    public void setAge(double earthAge) {
        this.earthAge = earthAge;
    }

    public double mercuryAge(){
        return (this.earthAge * 0.2408467);
}
    public double venusAge(){
        return (this.earthAge * 0.61519726);
    }

    public double marsAge(){
        return (this.earthAge * 1.8808158);
}
    public double jupiterAge(){
        return (this.earthAge * 11.862615);
}
    public double saturnAge(){
        return (this.earthAge * 29.447498);
}
    public double uranusAge(){
        return (this.earthAge * 84.016846);
}
    public double neptuneAge(){
        return (this.earthAge * 164.79132);
}
    public double plutoAge(){
        return (this.earthAge * 248.00);
}

}

