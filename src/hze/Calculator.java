package hze;

public class Calculator extends Main{

	public static String calculate(double height, double weight, char gender) {

		// declare and initialize two variables
		double height_in_cm = height / 100;
		double bmi = weight / Math.pow(height_in_cm, 2);

		//if request 
		if (gender == 'f' && bmi < 19) {
			return"Your BMI is underweight";
		} else {
			if (gender == 'f' && bmi <= 24) {
				return"Your BMI is in normal weight";
			} else {
				if (gender == 'f' && bmi > 24) {
					return"Your BMI is in the overweight";
				} else {
					if (gender == 'm' && bmi < 20) {
						return"Your BMI is underweight";
					} else {
						if (gender == 'm' && bmi <= 25) {
							return"Your BMI is in normal weight";
						} else {
							if (gender == 'm' && bmi > 25) {
								return"Your BMI is in the overweight";
							} else {
								return"This is not a biological gender ⍨";
							}
						}
					}
				}
			}
		}

	}

}
