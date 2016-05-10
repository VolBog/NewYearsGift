package entity;

public enum ListOfCandies {
	CARAMEL("CARAMEL"), CHOCO("CHOCO"), NUTS("NUTS"), MILKY("MILKY");
	private final String name;

	private ListOfCandies(String s) {
		name = s;
	}

	public String toString() {
		return this.name;
	}
}
