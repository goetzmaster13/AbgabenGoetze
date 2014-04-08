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
public class SSalgrade extends org.jooq.impl.TableImpl<db.generated.tables.records.SSalgradeRecord> {

	private static final long serialVersionUID = 1693634881;

	/**
	 * The singleton instance of <code>firmen_db.s_salgrade</code>
	 */
	public static final db.generated.tables.SSalgrade S_SALGRADE = new db.generated.tables.SSalgrade();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<db.generated.tables.records.SSalgradeRecord> getRecordType() {
		return db.generated.tables.records.SSalgradeRecord.class;
	}

	/**
	 * The column <code>firmen_db.s_salgrade.s_grade</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.SSalgradeRecord, java.lang.Byte> S_GRADE = createField("s_grade", org.jooq.impl.SQLDataType.TINYINT.nullable(false), this);

	/**
	 * The column <code>firmen_db.s_salgrade.s_losal</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.SSalgradeRecord, java.lang.Long> S_LOSAL = createField("s_losal", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * The column <code>firmen_db.s_salgrade.s_hisal</code>. 
	 */
	public final org.jooq.TableField<db.generated.tables.records.SSalgradeRecord, java.lang.Long> S_HISAL = createField("s_hisal", org.jooq.impl.SQLDataType.BIGINT, this);

	/**
	 * Create a <code>firmen_db.s_salgrade</code> table reference
	 */
	public SSalgrade() {
		super("s_salgrade", db.generated.FirmenDb.FIRMEN_DB);
	}

	/**
	 * Create an aliased <code>firmen_db.s_salgrade</code> table reference
	 */
	public SSalgrade(java.lang.String alias) {
		super(alias, db.generated.FirmenDb.FIRMEN_DB, db.generated.tables.SSalgrade.S_SALGRADE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<db.generated.tables.records.SSalgradeRecord> getPrimaryKey() {
		return db.generated.Keys.KEY_S_SALGRADE_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<db.generated.tables.records.SSalgradeRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<db.generated.tables.records.SSalgradeRecord>>asList(db.generated.Keys.KEY_S_SALGRADE_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public db.generated.tables.SSalgrade as(java.lang.String alias) {
		return new db.generated.tables.SSalgrade(alias);
	}
}