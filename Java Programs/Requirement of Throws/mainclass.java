class mainclass {
	public static void main(String[] args) throws ArithmeticException {
		throw new ArithmeticException(); // Compiler dont know about this exception
		// at compile time. It is unchecked at compile time.
		// So it do not create any mechnism to handle it.

		/*

			Checked Exception is checked at compile time, so compiler knows
			how to handle it at compile time and creates the mechnism.

		*/
	}
}