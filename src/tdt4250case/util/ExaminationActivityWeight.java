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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(weight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this
				|| (obj instanceof ExaminationActivityWeight
						&& ((ExaminationActivityWeight)obj).weight == weight);
	}
}
