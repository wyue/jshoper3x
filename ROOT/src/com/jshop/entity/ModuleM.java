package com.jshop.entity;

// Generated 2013-3-22 15:24:47 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ModuleM generated by hbm2java
 */
@Entity
@Table(name = "module_m", catalog = "jshoper3")
public class ModuleM implements java.io.Serializable {

	private String id;
	private String modulename;
	private Date createtime;

	public ModuleM() {
	}

	public ModuleM(String id, String modulename, Date createtime) {
		this.id = id;
		this.modulename = modulename;
		this.createtime = createtime;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false, length = 20)
	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "MODULENAME", nullable = false, length = 100)
	public String getModulename() {
		return this.modulename;
	}

	public void setModulename(String modulename) {
		this.modulename = modulename;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

}
