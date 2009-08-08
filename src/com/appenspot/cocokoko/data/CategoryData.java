package com.appenspot.cocokoko.data;
/****
 * カテゴリデータ
 */
import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class CategoryData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;

    /**
     * カテゴリID
     */
	@Persistent
	private Integer categoryID;
	
	/**
	 * カテゴリ名
	 */
	@Persistent
	private String categoryNm;
	
	/**
	 * 表示アイコン
	 */
	@Persistent
	private String iconImage;

	public CategoryData() {
		super();
	}

	public CategoryData( Integer categoryID, String categoryNm,
			String iconImage) {
		super();
		this.categoryID = categoryID;
		this.categoryNm = categoryNm;
		this.iconImage = iconImage;
	}

	public Integer getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(Integer categoryID) {
		this.categoryID = categoryID;
	}

	public String getCategoryNm() {
		return categoryNm;
	}

	public void setCategoryNm(String categoryNm) {
		this.categoryNm = categoryNm;
	}

	public String getIconImage() {
		return iconImage;
	}

	public void setIconImage(String iconImage) {
		this.iconImage = iconImage;
	}

	public Long getId() {
		return id;
	}
	
	
}
