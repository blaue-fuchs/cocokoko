package com.appenspot.cocokoko.data;
/**
 * スポットデータ
 */
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class SpotData {
    
    /**
     * スポットID
     */
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    //private Integer spotID;//自動生成はjava.lang.Long型みたい
    private Long spotID;
    
    /**
     * カテゴリID
     */
    @Persistent
    private Long categoryID;
    
    /** 
     * スポット名
     */
    @Persistent
    private String spotNm;
    
    /**
     * 緯度
     */
    @Persistent
    private Double lat;
    
    /**
     * 経度
     */
    @Persistent
    private Double lng;
    
    /**
     * 備考
     */
    @Persistent
    private String memo;
    
    /**
     * URL
     */
    @Persistent
    private String url;
    
    /**
     * 作成ユーザ名
     */
    @Persistent
    private String addUserNm;
    
    /**
     * 作成年月日
     */
    @Persistent
    private Date addDate;

      
    /**
     * コンストラクタ
     */
	public SpotData() {
		super();
	}

	public SpotData(Long spotID, Long categoryID, String spotNm,
			Double lat, Double lng, String memo, String url, String addUserNm,
			Date addDate) {
		super();
		this.spotID = spotID;
		this.categoryID = categoryID;
		this.spotNm = spotNm;
		this.lat = lat;
		this.lng = lng;
		this.memo = memo;
		this.url = url;
		this.addUserNm = addUserNm;
		this.addDate = addDate;
	}

	
	public Long getSpotID() {
		return spotID;
	}

	public void setSpotID(Long spotID) {
		this.spotID = spotID;
	}

	public Long getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}

	public String getSpotNm() {
		return spotNm;
	}

	public void setSpotNm(String spotNm) {
		this.spotNm = spotNm;
	}

	public Double getLAT() {
		return lat;
	}

	public void setLAT(Double lat) {
		this.lat = lat;
	}

	public Double getLNG() {
		return lng;
	}

	public void setLNG(Double lng) {
		this.lng = lng;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getAddUserNm() {
		return addUserNm;
	}

	public void setAddUserNm(String addUserNm) {
		this.addUserNm = addUserNm;
	}

	public Date getAddDate() {
		return addDate;
	}

	public void setAddDate(Date addDate) {
		this.addDate = addDate;
	}

}
