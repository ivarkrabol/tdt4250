package tdt4250case.util;

import java.text.DecimalFormat;

public class ExaminationActivityWeight {

	private static DecimalFormat format = new DecimalFormat("#0.0");
	
	public class WeightOutOfBoundsException extends IllegalArgumentException {
		private static final long serialVersionUID = 1L;
	}

	public static ExaminationActivityWeight parse(String text) {
		return new ExaminationActivityWeight(Float.parseFloat(text));
	}

	public final float weight;

	public ExaminationActivityWeight(float weight) {
		if (weight < 0.0F || weight > 100.0F) throw new WeightOutOfBoundsException();
		this.weight = weight;
	}

	@Override
	public String toString() {
		return format.format(weight);
	}

}
