package book.ChapterSeven;

import static java.lang.Math.sqrt;

public class BMI {
    public static final double KILOGRAMS_PER_POUND =
            0.45359237;
    public static final double METERS_PER_INCH = 0.0254;

    private String name;
    private double weight; // in pounds
    private double height; // in inches

    // constructor
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight * KILOGRAMS_PER_POUND;
        this.height = height * METERS_PER_INCH;
    }

    public double getBMI(){
    double bmiCount = 0;
        bmiCount = weight / (height * height);
        return bmiCount;
    }



    public String getStatus() {
        double bmi = getBMI();

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi > 18.5 && bmi < 25) {
            return "Normal";
        } else if (bmi > 25) {
            return "OverWeight";
        }
        return "No Bmi";
    }

        public String getName () {
            return name;
        }
    }

    class BMITest {
     public static void main(String[] args) {
               BMI bmi = new BMI("Tanvir Rifat", 145, 70);
                System.out.println("The BMI for " + bmi.getName() +
                          " is (" + bmi.getBMI() + ") " + bmi.getStatus());
            }
  }


