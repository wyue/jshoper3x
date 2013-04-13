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
 * GoodsCommentT generated by hbm2java
 */
@Entity
@Table(name = "goods_comment_t", catalog = "jshoper3")
public class GoodsCommentT implements java.io.Serializable {

	private String commentid;
	private String goodsid;
	private String goodsname;
	private String replyorcommentusername;
	private Date posttime;
	private String commentcontent;
	private Integer score;
	private String state;
	private String replyorcomment;
	private String replyid;
	private String replyorcommentuserid;
	private String emailable;
	private String title;
	private String virtualadd;

	public GoodsCommentT() {
	}

	public GoodsCommentT(String commentid, String goodsid, String goodsname, String replyorcommentusername, Date posttime, String commentcontent, String state, String replyorcomment, String replyorcommentuserid) {
		this.commentid = commentid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.replyorcommentusername = replyorcommentusername;
		this.posttime = posttime;
		this.commentcontent = commentcontent;
		this.state = state;
		this.replyorcomment = replyorcomment;
		this.replyorcommentuserid = replyorcommentuserid;
	}

	public GoodsCommentT(String commentid, String goodsid, String goodsname, String replyorcommentusername, Date posttime, String commentcontent, Integer score, String state, String replyorcomment, String replyid, String replyorcommentuserid, String emailable, String title, String virtualadd) {
		this.commentid = commentid;
		this.goodsid = goodsid;
		this.goodsname = goodsname;
		this.replyorcommentusername = replyorcommentusername;
		this.posttime = posttime;
		this.commentcontent = commentcontent;
		this.score = score;
		this.state = state;
		this.replyorcomment = replyorcomment;
		this.replyid = replyid;
		this.replyorcommentuserid = replyorcommentuserid;
		this.emailable = emailable;
		this.title = title;
		this.virtualadd = virtualadd;
	}

	@Id
	@Column(name = "COMMENTID", unique = true, nullable = false, length = 20)
	public String getCommentid() {
		return this.commentid;
	}

	public void setCommentid(String commentid) {
		this.commentid = commentid;
	}

	@Column(name = "GOODSID", nullable = false, length = 20)
	public String getGoodsid() {
		return this.goodsid;
	}

	public void setGoodsid(String goodsid) {
		this.goodsid = goodsid;
	}

	@Column(name = "GOODSNAME", nullable = false, length = 100)
	public String getGoodsname() {
		return this.goodsname;
	}

	public void setGoodsname(String goodsname) {
		this.goodsname = goodsname;
	}

	@Column(name = "REPLYORCOMMENTUSERNAME", nullable = false, length = 50)
	public String getReplyorcommentusername() {
		return this.replyorcommentusername;
	}

	public void setReplyorcommentusername(String replyorcommentusername) {
		this.replyorcommentusername = replyorcommentusername;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "POSTTIME", nullable = false, length = 0)
	public Date getPosttime() {
		return this.posttime;
	}

	public void setPosttime(Date posttime) {
		this.posttime = posttime;
	}

	@Column(name = "COMMENTCONTENT", nullable = false, length = 500)
	public String getCommentcontent() {
		return this.commentcontent;
	}

	public void setCommentcontent(String commentcontent) {
		this.commentcontent = commentcontent;
	}

	@Column(name = "SCORE")
	public Integer getScore() {
		return this.score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	@Column(name = "STATE", nullable = false, length = 1)
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "REPLYORCOMMENT", nullable = false, length = 1)
	public String getReplyorcomment() {
		return this.replyorcomment;
	}

	public void setReplyorcomment(String replyorcomment) {
		this.replyorcomment = replyorcomment;
	}

	@Column(name = "REPLYID", length = 20)
	public String getReplyid() {
		return this.replyid;
	}

	public void setReplyid(String replyid) {
		this.replyid = replyid;
	}

	@Column(name = "REPLYORCOMMENTUSERID", nullable = false, length = 20)
	public String getReplyorcommentuserid() {
		return this.replyorcommentuserid;
	}

	public void setReplyorcommentuserid(String replyorcommentuserid) {
		this.replyorcommentuserid = replyorcommentuserid;
	}

	@Column(name = "EMAILABLE", length = 1)
	public String getEmailable() {
		return this.emailable;
	}

	public void setEmailable(String emailable) {
		this.emailable = emailable;
	}

	@Column(name = "TITLE", length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "VIRTUALADD", length = 1)
	public String getVirtualadd() {
		return this.virtualadd;
	}

	public void setVirtualadd(String virtualadd) {
		this.virtualadd = virtualadd;
	}

}
