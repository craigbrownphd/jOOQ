/**
 * This class is generated by jOOQ
 */
package org.jooq.test.hsqldb.generatedclasses.routines;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class F2515_ extends org.jooq.impl.AbstractRoutine<java.lang.Integer> {

	private static final long serialVersionUID = 104427952;

	/**
	 * The parameter <code>PUBLIC.F2515_.RETURN_VALUE</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2515_.A_A</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> A_A = createParameter("A_A", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * The parameter <code>PUBLIC.F2515_.A_A_</code>. 
	 */
	public static final org.jooq.Parameter<java.lang.Integer> A_A_ = createParameter("A_A_", org.jooq.impl.SQLDataType.INTEGER);

	/**
	 * Create a new routine call instance
	 */
	public F2515_() {
		super("F2515_", org.jooq.test.hsqldb.generatedclasses.Public.PUBLIC, org.jooq.impl.SQLDataType.INTEGER);

		setReturnParameter(RETURN_VALUE);
		addInParameter(A_A);
		addInParameter(A_A_);
	}

	/**
	 * Set the <code>A_A</code> parameter IN value to the routine
	 */
	public void setAA(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2515_.A_A, value);
	}

	/**
	 * Set the <code>A_A</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setAA(org.jooq.Field<java.lang.Integer> field) {
		setField(A_A, field);
	}

	/**
	 * Set the <code>A_A_</code> parameter IN value to the routine
	 */
	public void setAA_(java.lang.Integer value) {
		setValue(org.jooq.test.hsqldb.generatedclasses.routines.F2515_.A_A_, value);
	}

	/**
	 * Set the <code>A_A_</code> parameter to the function to be used with a {@link org.jooq.Select} statement
	 */
	public void setAA_(org.jooq.Field<java.lang.Integer> field) {
		setField(A_A_, field);
	}
}