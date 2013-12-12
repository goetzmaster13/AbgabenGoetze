/**
 * This class is generated by jOOQ
 */
package db.generated.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DDept extends org.jooq.impl.TableImpl<db.generated.tables.records.DDeptRecord> {

	private static final long serialVersionUID = -18365470;

	/**
	 * The singleton instance of <code>firmen_db.d_dept</code>
	 */
	public static final db.generated.tables.DDept D_DEPT = new db.generated.tables.DDept();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<db.generated.tables.records.DDeptRecord> getRecordType() {
		return db.generated.tables.records.DDeptRecord.class;
	}

	/**
	 * The column <code>firmen_db.d_dept.d_deptno</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.DDeptRecord, java.lang.Long> D_DEPTNO = createField("d_deptno", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this);

	/**
	 * The column <code>firmen_db.d_dept.d_dname</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.DDeptRecord, java.lang.String> D_DNAME = createField("d_dname", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * The column <code>firmen_db.d_dept.d_loc</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.DDeptRecord, java.lang.String> D_LOC = createField("d_loc", org.jooq.impl.SQLDataType.VARCHAR.length(20), this);

	/**
	 * Create a <code>firmen_db.d_dept</code> table reference
	 */
	public DDept() {
		super("d_dept", db.generated.FirmenDb.FIRMEN_DB);
	}

	/**
	 * Create an aliased <code>firmen_db.d_dept</code> table reference
	 */
	public DDept(java.lang.String alias) {
		super(alias, db.generated.FirmenDb.FIRMEN_DB, db.generated.tables.DDept.D_DEPT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<db.generated.tables.records.DDeptRecord> getPrimaryKey() {
		return db.generated.Keys.KEY_D_DEPT_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<db.generated.tables.records.DDeptRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<db.generated.tables.records.DDeptRecord>>asList(db.generated.Keys.KEY_D_DEPT_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public db.generated.tables.DDept as(java.lang.String alias) {
		return new db.generated.tables.DDept(alias);
	}
}
