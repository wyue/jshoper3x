package com.jshop.entity;

// Generated 2013-7-26 22:19:04 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GoodsCategoryT generated by hbm2java
 */
@Entity
@Table(name = "goods_category_t", catalog = "jshoper3")
public class GoodsCategoryT implements java.io.Serializable {

	private String goodsCategoryTid;
	private String grade;
	private String metaKeywords;
	private String metaDes;
	private String name;
	private String state;
	private String path;
	private Integer sort;
	private String sign;
	private String goodsTypeId;
	private String parentId;
	private Date createtime;
	private String creatorid;
	private String parentName;
	private String htmlpath;
	private Date updatetime;
	private int versiont;
	private String logo;
	private String mobilesync;

	public GoodsCategoryT() {
	}

	public GoodsCategoryT(String goodsCategoryTid, String grade, String name,
			String state, String path, String sign, String goodsTypeId,
			Date createtime, String creatorid, Date updatetime, int versiont,
			String logo, String mobilesync) {
		this.goodsCategoryTid = goodsCategoryTid;
		this.grade = grade;
		this.name = name;
		this.state = state;
		this.path = path;
		this.sign = sign;
		this.goodsTypeId = goodsTypeId;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.logo = logo;
		this.mobilesync = mobilesync;
	}

	public GoodsCategoryT(String goodsCategoryTid, String grade,
			String metaKeywords, String metaDes, String name, String state,
			String path, Integer sort, String sign, String goodsTypeId,
			String parentId, Date createtime, String creatorid,
			String parentName, String htmlpath, Date updatetime, int versiont,
			String logo, String mobilesync) {
		this.goodsCategoryTid = goodsCategoryTid;
		this.grade = grade;
		this.metaKeywords = metaKeywords;
		this.metaDes = metaDes;
		this.name = name;
		this.state = state;
		this.path = path;
		this.sort = sort;
		this.sign = sign;
		this.goodsTypeId = goodsTypeId;
		this.parentId = parentId;
		this.createtime = createtime;
		this.creatorid = creatorid;
		this.parentName = parentName;
		this.htmlpath = htmlpath;
		this.updatetime = updatetime;
		this.versiont = versiont;
		this.logo = logo;
		this.mobilesync = mobilesync;
	}

	@Id
	@Column(name = "GOODS_CATEGORY_TID", unique = true, nullable = false, length = 20)
	public String getGoodsCategoryTid() {
		return this.goodsCategoryTid;
	}

	public void setGoodsCategoryTid(String goodsCategoryTid) {
		this.goodsCategoryTid = goodsCategoryTid;
	}

	@Column(name = "GRADE", nullable = false, length = 1)
	public String getGrade() {
		return this.grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Column(name = "META_KEYWORDS")
	public String getMetaKeywords() {
		return this.metaKeywords;
	}

	public void setMetaKeywords(String metaKeywords) {
		this.metaKeywords = metaKeywords;
	}

	@Column(name = "META_DES")
	public String getMetaDes() {
		return this.metaDes;
	}

	public void setMetaDes(String metaDes) {
		this.metaDes = metaDes;
	}

	@Column(name = "NAME", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "PATH", nullable = false, length = 2000)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name = "SORT")
	public Integer getSort() {
		return this.sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	@Column(name = "SIGN", nullable = false, length = 45)
	public String getSign() {
		return this.sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	@Column(name = "GOODS_TYPE_ID", nullable = false, length = 45)
	public String getGoodsTypeId() {
		return this.goodsTypeId;
	}

	public void setGoodsTypeId(String goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	@Column(name = "PARENT_ID", length = 45)
	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Column(name = "PARENT_NAME", length = 45)
	public String getParentName() {
		return this.parentName;
	}

	public void setParentName(String parentName) {
		this.parentName = parentName;
	}

	@Column(name = "HTMLPATH")
	public String getHtmlpath() {
		return this.htmlpath;
	}

	public void setHtmlpath(String htmlpath) {
		this.htmlpath = htmlpath;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "UPDATETIME", nullable = false, length = 0)
	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "VERSIONT", nullable = false)
	public int getVersiont() {
		return this.versiont;
	}

	public void setVersiont(int versiont) {
		this.versiont = versiont;
	}

	@Column(name = "LOGO", nullable = false)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Column(name = "MOBILESYNC", nullable = false, length = 1)
	public String getMobilesync() {
		return this.mobilesync;
	}

	public void setMobilesync(String mobilesync) {
		this.mobilesync = mobilesync;
	}

}
