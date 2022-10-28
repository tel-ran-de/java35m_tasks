public class Body {
    double weight;
    double height;

    public Body(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    //"Underweight" если BMI  меньше 18.5
    // "Normal" if 18.5<=BMI<25
    // "Overweight" 25<=BMI<30
    // Obese  BMI>=30
    public void calculateBMI(){
        double index=weight/(height*height);

        if(index<18.5){
            System.out.println("Underweight");
        } else if (index>=18.5 && index<25){
            System.out.println("Normal");
        } else if (index>=25 && index<30){
            System.out.println("Overweight");
        } else if (index >=30){
            System.out.println("Obese");
        }

    }
}
