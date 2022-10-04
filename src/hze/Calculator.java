package hze;

public class Calculator extends Main {

	public static String calculate(double height, double weight, char gender) {

		// declare and initialize two variables
		double height_in_cm = height / 100;
		double bmi = weight / Math.pow(height_in_cm, 2);

		// Male
		final double UNDERWEIGHT_MAN = 18.5;
		final double NORMALWEIGHT_MAN = 24.9;

		// Female
		final double UNDERWEIGHT_FEMALE = 17.5;
		final double NORMALWEIGHT_FEMALE = 24;

		// if request
		if (gender == 'f' && bmi < UNDERWEIGHT_FEMALE) {
			return "You are underweight.";
		} else {
			if (gender == 'f' && bmi <= NORMALWEIGHT_FEMALE) {
				return "You are overweight.";
			} else {
				if (gender == 'f' && bmi > NORMALWEIGHT_FEMALE) {
					return "You have normal weight.";
				} else {
					if (gender == 'm' && bmi < UNDERWEIGHT_MAN) {
						return "You are underweight.";
					} else {
						if (gender == 'm' && bmi <= NORMALWEIGHT_MAN) {
							return "You have normal weight.";
						} else {
							if (gender == 'm' && bmi > NORMALWEIGHT_MAN) {
								return "You are overweight.";
							}
						}
					}
				}
			}
		}
		return null;
	}

}
