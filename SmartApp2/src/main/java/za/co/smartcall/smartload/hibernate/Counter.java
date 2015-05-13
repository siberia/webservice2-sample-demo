package za.co.smartcall.smartload.hibernate;

// Generated 04 Mar 2015 11:55:50 AM by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * incrementer generated by hbm2java
 */
@Entity
@Table(name = "COUNT")
public class Counter implements java.io.Serializable {

	private byte id;
	private long increment;
	private Date lastupdate;

	public Counter() {
	}

	public Counter(byte id, long increment, Date lastupdate) {
		this.id = id;
		this.increment = increment;
		this.lastupdate = lastupdate;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	@Column(name = "INCREMENT", nullable = false)
	public long getIncrement() {
		return this.increment;
	}

	public void setIncrement(long increment) {
		this.increment = increment;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name = "LASTUPDATE", nullable = false, length = 10)
	public Date getLastupdate() {
		return this.lastupdate;
	}

	public void setLastupdate(Date lastupdate) {
		this.lastupdate = lastupdate;
	}

}