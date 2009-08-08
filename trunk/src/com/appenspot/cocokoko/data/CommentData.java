package com.appenspot.cocokoko.data;
/****
 * コメントデータ
 */
import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class CommentData {
    @PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
    
    /**
     * スポットID
     */
    @Persistent
    private Integer spotID;
    
    /**
     * コメントID
     */
    @Persistent
    private Integer commentID;
    
    /**
     * コメント内容
     */
    @Persistent
    private String comment;
    
    /**
     * 投稿者
     */
    @Persistent
    private String autherNm;
    
    /**
     * 投稿日時
     */
    @Persistent
    private Date commentDate;

    /**
     * コンストラクタ
     */
	public CommentData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommentData(Long id, Integer spotID, Integer commentID,
			String comment, String autherNm, Date commentDate) {
		super();
		this.id = id;
		this.spotID = spotID;
		this.commentID = commentID;
		this.comment = comment;
		this.autherNm = autherNm;
		this.commentDate = commentDate;
	}

	public Integer getSpotID() {
		return spotID;
	}

	public void setSpotID(Integer spotID) {
		this.spotID = spotID;
	}

	public Integer getCommentID() {
		return commentID;
	}

	public void setCommentID(Integer commentID) {
		this.commentID = commentID;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getAutherNm() {
		return autherNm;
	}

	public void setAutherNm(String autherNm) {
		this.autherNm = autherNm;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public Long getId() {
		return id;
	}
    

}
