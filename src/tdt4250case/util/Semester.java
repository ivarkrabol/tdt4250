package tdt4250case.util;

import java.time.Year;

public class Semester {

	public enum Type {
		FALL("AUTUMN"), SPRING("SPRING");

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
		return 2 * year.getValue() + (type == Type.FALL ? 1 : 0); 
	}

}
