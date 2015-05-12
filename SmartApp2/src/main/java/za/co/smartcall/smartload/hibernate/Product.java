package za.co.smartcall.smartload.hibernate;

// Generated 16 Feb 2015 12:49:47 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 * Product generated by hbm2java
 */
@Entity
@Table(name = "PRODUCT")
public class Product implements java.io.Serializable {

	private int id;
	private Producttype producttype;
	private String description;
	private BigDecimal discount;
	private BigDecimal maxAmount;
	private BigDecimal minAmount;
	private String name;
	private boolean pinIndicator;
	private boolean smsIndicator;
	private BigDecimal retailValue;
	private Set<Transaction> transactions = new HashSet<Transaction>(0);

	public Product() {
	}

	public Product(int id, Producttype producttype, String description,
			BigDecimal discount, BigDecimal maxAmount, BigDecimal minAmount,
			String name, boolean pinIndicator, boolean smsIndicator,
			BigDecimal retailValue) {
		this.id = id;
		this.producttype = producttype;
		this.description = description;
		this.discount = discount;
		this.maxAmount = maxAmount;
		this.minAmount = minAmount;
		this.name = name;
		this.pinIndicator = pinIndicator;
		this.smsIndicator = smsIndicator;
		this.retailValue = retailValue;
	}

	public Product(int id, Producttype producttype, String description,
			BigDecimal discount, BigDecimal maxAmount, BigDecimal minAmount,
			String name, boolean pinIndicator, boolean smsIndicator,
			BigDecimal retailValue, Set<Transaction> transactions) {
		this.id = id;
		this.producttype = producttype;
		this.description = description;
		this.discount = discount;
		this.maxAmount = maxAmount;
		this.minAmount = minAmount;
		this.name = name;
		this.pinIndicator = pinIndicator;
		this.smsIndicator = smsIndicator;
		this.retailValue = retailValue;
		this.transactions = transactions;
	}
	
	public Product(za.co.smartcall._2010._12.message.Product product,za.co.smartcall._2010._12.message.ProductType productType,za.co.smartcall._2010._12.common.Network network){
		this.id = (int)product.getId();
		this.producttype = new Producttype(productType, network);
		this.description = product.getDescription();
		this.discount = product.getDiscountPercentage();
		this.maxAmount = product.getMaxAmount();
		this.minAmount = product.getMinAmount();
		this.name = product.getName();
		this.pinIndicator = product.isPinIndicator();
		this.smsIndicator = product.isSmsIndicator();
		this.retailValue = product.getRetailValue();
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRODUCTTYPE", nullable = false)
	public Producttype getProducttype() {
		return this.producttype;
	}

	public void setProducttype(Producttype producttype) {
		this.producttype = producttype;
	}

	@Column(name = "DESCRIPTION", nullable = false, length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "DISCOUNT", nullable = false, precision = 3)
	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}

	@Column(name = "MAX_AMOUNT", nullable = false, scale = 4)
	public BigDecimal getMaxAmount() {
		return this.maxAmount;
	}

	public void setMaxAmount(BigDecimal maxAmount) {
		this.maxAmount = maxAmount;
	}

	@Column(name = "MIN_AMOUNT", nullable = false, scale = 4)
	public BigDecimal getMinAmount() {
		return this.minAmount;
	}

	public void setMinAmount(BigDecimal minAmount) {
		this.minAmount = minAmount;
	}

	@Column(name = "NAME", nullable = false, length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "PIN_INDICATOR", nullable = false)
	public boolean isPinIndicator() {
		return this.pinIndicator;
	}

	public void setPinIndicator(boolean pinIndicator) {
		this.pinIndicator = pinIndicator;
	}

	@Column(name = "SMS_INDICATOR", nullable = false)
	public boolean isSmsIndicator() {
		return this.smsIndicator;
	}

	public void setSmsIndicator(boolean smsIndicator) {
		this.smsIndicator = smsIndicator;
	}

	@Column(name = "RETAIL_VALUE", nullable = false, scale = 4)
	public BigDecimal getRetailValue() {
		return this.retailValue;
	}

	public void setRetailValue(BigDecimal retailValue) {
		this.retailValue = retailValue;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}
	


}
