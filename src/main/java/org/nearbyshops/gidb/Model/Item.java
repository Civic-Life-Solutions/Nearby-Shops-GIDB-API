package org.nearbyshops.gidb.Model;

import org.nearbyshops.gidb.ModelStats.ItemStats;

import java.sql.Timestamp;

public class Item {

	// Table Name
	public static final String TABLE_NAME = "ITEM";

	// column names
	public static final String ITEM_ID = "ITEM_ID";
	public static final String ITEM_NAME = "ITEM_NAME";
	public static final String ITEM_DESC = "ITEM_DESC";

	public static final String ITEM_IMAGE_URL = "ITEM_IMAGE_URL";
	public static final String BACKDROP_IMAGE_ID = "BACKDROP_IMAGE_ID";
	//public static final String ITEM_BRAND_NAME = "ITEM_BRAND_NAME";
	public static final String ITEM_CATEGORY_ID = "ITEM_CATEGORY_ID";

	// recently added
	public static final String QUANTITY_UNIT = "QUANTITY_UNIT";
	public static final String DATE_TIME_CREATED = "DATE_TIME_CREATED";
	public static final String ITEM_DESCRIPTION_LONG = "ITEM_DESCRIPTION_LONG";

	// To be added
	public static final String IS_ENABLED = "IS_ENABLED";
	public static final String IS_WAITLISTED = "IS_WAITLISTED";

	public static final String LIST_PRICE = "LIST_PRICE";
	public static final String BARCODE = "BARCODE";
	public static final String BARCODE_TYPE_CODE = "BARCODE_TYPE_CODE";
	public static final String WEIGHT = "WEIGHT";

	public static final String IMAGE_COPYRIGHTS = "IMAGE_COPYRIGHTS";

	public static final String GIDB_ITEM_ID = "GIDB_ITEM_ID";
	public static final String GIDB_SERVICE_URL = "GIDB_SERVICE_URL";


	// Barcode Type Code constants

	public static final int BARCODE_TYPE_EAN = 1;
	public static final int BARCODE_TYPE_UPC = 2;



	// Create Table Statement
	public static final String createTableItemPostgres = "CREATE TABLE IF NOT EXISTS "
			+ Item.TABLE_NAME + "("
			+ " " + Item.ITEM_ID + " SERIAL PRIMARY KEY,"
			+ " " + Item.ITEM_NAME + " text,"
			+ " " + Item.ITEM_DESC + " text,"
			+ " " + Item.ITEM_DESCRIPTION_LONG + " text,"
			+ " " + Item.ITEM_IMAGE_URL + " text,"
			+ " " + Item.QUANTITY_UNIT + " text,"
			+ " " + Item.ITEM_CATEGORY_ID + " INT,"
			+ " " + Item.IS_ENABLED + " boolean,"
			+ " " + Item.IS_WAITLISTED + " boolean,"
			+ " " + Item.DATE_TIME_CREATED + "  timestamp with time zone NOT NULL DEFAULT now(),"

			+ " " + Item.LIST_PRICE + " INT,"
			+ " " + Item.BARCODE + " INT,"
			+ " " + Item.BARCODE_TYPE_CODE + " INT,"
			+ " FOREIGN KEY(" + Item.ITEM_CATEGORY_ID +") REFERENCES " + ItemCategory.TABLE_NAME + "(" + ItemCategory.ITEM_CATEGORY_ID + ")"
			+ ")";

//			+ " FOREIGN KEY(" + Item.ITEM_CATEGORY_ID +") REFERENCES ITEM_CATEGORY(ID))";



	// Instance Variables

	private int itemID;


	private String itemName;


	private String itemDescription;
	private String itemImageURL;
	
	//technically it is the name of the manufacturer 
	// Typically its the name of the manufacturer
	
	// Only required for JDBC
	private Integer itemCategoryID;
	private ItemStats itemStats;

	// recently added
	private String quantityUnit;
	private Timestamp dateTimeCreated;
	private String itemDescriptionLong;
	private ItemCategory itemCategory;
	private Boolean isEnabled;
	private Boolean isWaitlisted;

	private int listPrice;
	private int barcode;
	private int barcodeTypeCode;

	private Float rt_rating_avg;
	private Float rt_rating_count;
	private String rt_gidb_service_url;




	public String getRt_gidb_service_url() {
		return rt_gidb_service_url;
	}

	public void setRt_gidb_service_url(String rt_gidb_service_url) {
		this.rt_gidb_service_url = rt_gidb_service_url;
	}

	public Float getRt_rating_avg() {
		return rt_rating_avg;
	}

	public void setRt_rating_avg(Float rt_rating_avg) {
		this.rt_rating_avg = rt_rating_avg;
	}

	public Float getRt_rating_count() {
		return rt_rating_count;
	}

	public void setRt_rating_count(Float rt_rating_count) {
		this.rt_rating_count = rt_rating_count;
	}


	// Getter and Setter Statements

	//No-args constructor


	public int getListPrice() {
		return listPrice;
	}

	public void setListPrice(int listPrice) {
		this.listPrice = listPrice;
	}

	public int getBarcode() {
		return barcode;
	}

	public void setBarcode(int barcode) {
		this.barcode = barcode;
	}

	public int getBarcodeTypeCode() {
		return barcodeTypeCode;
	}

	public void setBarcodeTypeCode(int barcodeTypeCode) {
		this.barcodeTypeCode = barcodeTypeCode;
	}

	public Boolean getEnabled() {
		return isEnabled;
	}

	public void setEnabled(Boolean enabled) {
		isEnabled = enabled;
	}

	public Boolean getWaitlisted() {
		return isWaitlisted;
	}

	public void setWaitlisted(Boolean waitlisted) {
		isWaitlisted = waitlisted;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getItemCategoryID() {
		return itemCategoryID;
	}

	public void setItemCategoryID(Integer itemCategoryID) {
		this.itemCategoryID = itemCategoryID;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}
	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}
	public Timestamp getDateTimeCreated() {
		return dateTimeCreated;
	}
	public void setDateTimeCreated(Timestamp dateTimeCreated) {
		this.dateTimeCreated = dateTimeCreated;
	}
	public String getItemDescriptionLong() {
		return itemDescriptionLong;
	}
	public void setItemDescriptionLong(String itemDescriptionLong) {
		this.itemDescriptionLong = itemDescriptionLong;
	}
	public ItemStats getItemStats() {
		return itemStats;
	}
	public void setItemStats(ItemStats itemStats) {
		this.itemStats = itemStats;
	}
	public ItemCategory getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}
	public int getItemID() {
		return itemID;
	}
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getItemImageURL() {
		return itemImageURL;
	}
	public void setItemImageURL(String itemImageURL) {
		this.itemImageURL = itemImageURL;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
