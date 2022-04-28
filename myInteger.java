public class myInteger {
	Integer value;

	myInteger() {
		value = 0;
	}

	Integer getValue() {
		return value;
	}

	void setValue(Integer v) {
		value = v;
	}

	public String toString() {
		return Integer.toString(value);
	}

}
