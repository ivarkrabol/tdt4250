package tdt4250case.util;

import java.time.Year;

public class Semester {

	public enum Type {
		AUTUMN("AUTUMN"), SPRING("SPRING");

		public static Type parse(String text) {
			for(Type type : Type.values()) {
				if(text.equals(type.name)) {
					return type;
				}
			}
			throw new IllegalArgumentException("No Semester.Type with name \"" + text + "\".");
		}
		
		public final String name;

		private Type(String name) {
			this.name = name;
		}
	}

	public static Semester parse(String text) {
		int separatorIndex = text.indexOf('-');
		String typeText = text.substring(0, separatorIndex);
		String yearText = text.substring(separatorIndex + 1);
		return new Semester(Type.parse(typeText), Year.parse(yearText));
	}

	public final Type type;
	public final Year year;

	public Semester(Type type, Year year) {
		this.type = type;
		this.year = year;
	}

	@Override
	public String toString() {
		return type.name
				+ "-"
				+ year.toString();
	}

	public int ordinal() {
		return 2 * year.getValue() + (type == Type.AUTUMN ? 1 : 0); 
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + ((year == null) ? 0 : year.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this
				|| (obj instanceof Semester
						&& ((Semester)obj).type == type
						&& ((Semester)obj).year.equals(year));
	}

}
