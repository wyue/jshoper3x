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
 * ProductT generated by hbm2java
 */
@Entity
@Table(name = "product_t", catalog = "jshoper3")
public class ProductT implements java.io.Serializable {

	private String productid;
	private Double price;
	private Double memberprice;
	private Double cost;
	private Double saleprice;
	private Integer freezeStore;
	private Integer store;
	private String isDefault;
	private String isSalestate;
	private String productName;
	private String productSn;
	private String specificationsValue;
	private String warehouseLocation;
	private String placeStore;
	private String weight;
	private String goodsid;
	private String creatorid;
	private Date createtime;
	private String specificationsid;
	private String specificationsName;

	public ProductT() {
	}

	public ProductT(String productid, String isDefault, String isSalestate, String productName, String specificationsValue, String goodsid, String creatorid, Date createtime, String specificationsid, String specificationsName) {
		this.productid = productid;
		this.isDefault = isDefault;
		this.isSalestate = isSalestate;
		this.productName = productName;
		this.specificationsValue = specificationsValue;
		this.goodsid = goodsid;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.specificationsid = specificationsid;
		this.specificationsName = specificationsName;
	}

	public ProductT(String productid, Double price, Double memberprice, Double cost, Double saleprice, Integer freezeStore, Integer store, String isDefault, String isSalestate, String productName, String productSn, String specificationsValue, String warehouseLocation, String placeStore, String weight, String goodsid, String creatorid, Date createtime, String specificationsid, String specificationsName) {
		this.productid = productid;
		this.price = price;
		this.memberprice = memberprice;
		this.cost = cost;
		this.saleprice = saleprice;
		this.freezeStore = freezeStore;
		this.store = store;
		this.isDefault = isDefault;
		this.isSalestate = isSalestate;
		this.productName = productName;
		this.productSn = productSn;
		this.specificationsValue = specificationsValue;
		this.warehouseLocation = warehouseLocation;
		this.placeStore = placeStore;
		this.weight = weight;
		this.goodsid = goodsid;
		this.creatorid = creatorid;
		this.createtime = createtime;
		this.specificationsid = specificationsid;
		this.specificationsName = specificationsName;
	}

	@Id
	@Column(name = "PRODUCTID", unique = true, nullable = false, length = 20)
	public String getProductid() {
		return this.productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
	}

	@Column(name = "PRICE", precision = 22, scale = 0)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "MEMBERPRICE", precision = 22, scale = 0)
	public Double getMemberprice() {
		return this.memberprice;
	}

	public void setMemberprice(Double memberprice) {
		this.memberprice = memberprice;
	}

	@Column(name = "COST", precision = 22, scale = 0)
	public Double getCost() {
		return this.cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

	@Column(name = "SALEPRICE", precision = 22, scale = 0)
	public Double getSaleprice() {
		return this.saleprice;
	}

	public void setSaleprice(Double saleprice) {
		this.saleprice = saleprice;
	}

	@Column(name = "FREEZE_STORE")
	public Integer getFreezeStore() {
		return this.freezeStore;
	}

	public void setFreezeStore(Integer freezeStore) {
		this.freezeStore = freezeStore;
	}

	@Column(name = "STORE")
	public Integer getStore() {
		return this.store;
	}

	public void setStore(Integer store) {
		this.store = store;
	}

	@Column(name = "IS_DEFAULT", nullable = false, length = 1)
	public String getIsDefault() {
		return this.isDefault;
	}

	public void setIsDefault(String isDefault) {
		this.isDefault = isDefault;
	}

	@Column(name = "IS_SALESTATE", nullable = false, length = 1)
	public String getIsSalestate() {
		return this.isSalestate;
	}

	public void setIsSalestate(String isSalestate) {
		this.isSalestate = isSalestate;
	}

	@Column(name = "PRODUCT_NAME", nullable = false, length = 100)
	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Column(name = "PRODUCT_SN", length = 45)
	public String getProductSn() {
		return this.productSn;
	}

	public void setProductSn(String productSn) {
		this.productSn = productSn;
	}

	@Column(name = "SPECIFICATIONS_VALUE", nullable = false, length = 5000)
	public String getSpecificationsValue() {
		return this.specificationsValue;
	}

	public void setSpecificationsValue(String specificationsValue) {
		this.specificationsValue = specificationsValue;
	}

	@Column(name = "WAREHOUSE_LOCATION", length = 100)
	public String getWarehouseLocation() {
		return this.warehouseLocation;
	}

	public void setWarehouseLocation(String warehouseLocation) {
		this.warehouseLocation = warehouseLocation;
	}

	@Column(name = "PLACE_STORE", length = 100)
	public String getPlaceStore() {
		return this.placeStore;
	}

	public void setPlaceStore(String placeStore) {
		this.placeStore = placeStore;
	}

	@Column(name = "WEIGHT", length = 45)
	public String getWeight() {
		return this.weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "CREATORID", nullable = false, length = 20)
	public String getCreatorid() {
		return this.creatorid;
	}

	public void setCreatorid(String creatorid) {
		this.creatorid = creatorid;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CREATETIME", nullable = false, length = 0)
	public Date getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	@Column(name = "SPECIFICATIONSID", nullable = false, length = 200)
	public String getSpecificationsid() {
		return this.specificationsid;
	}

	public void setSpecificationsid(String specificationsid) {
		this.specificationsid = specificationsid;
	}

	@Column(name = "SPECIFICATIONS_NAME", nullable = false, length = 200)
	public String getSpecificationsName() {
		return this.specificationsName;
	}

	public void setSpecificationsName(String specificationsName) {
		this.specificationsName = specificationsName;
	}

}
