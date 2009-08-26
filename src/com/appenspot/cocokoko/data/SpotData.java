package com.appenspot.cocokoko.data;
/**
 * �X�|�b�g�f�[�^
 */
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class SpotDate {
    
    /**
     * �X�|�b�gID
     */
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Integer spotID;
    
    /**
     * �J�e�S��ID
     */
    @Persistent
    private Integer categoryID;
    
    /** 
     * �X�|�b�g��
     */
    @Persistent
    private String spotNm;
    
    /**
     * �ܓx
     */
    @Persistent
    private Double lat;
    
    /**
     * �o�x
     */
    @Persistent
    private Double lng;
    
    /**
     * ���l
     */
    @Persistent
    private String memo;
    
    /**
     * URL
     */
    @Persistent
    private String url;
    
    /**
     * �쐬���[�U��
     */
    @Persistent
    private String addUserNm;
    
    /**
     * �쐬�N����
     */
    @Persistent
    private Date addDate;

      
    /**
     * �R���X�g���N�^
     */
        public SpotDate() {
                super();
        }

        public SpotDate(Integer spotID, Integer categoryID, String spotNm,
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

        
        public Integer getSpotID() {
                return spotID;
        }

        public void setSpotID(Integer spotID) {
                this.spotID = spotID;
        }

        public Integer getCategoryID() {
                return categoryID;
        }

        public void setCategoryID(Integer categoryID) {
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
