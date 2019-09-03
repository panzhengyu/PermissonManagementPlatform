package com.debug.pmp.model.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author pzy
 * @since 2019-09-03
 */
@TableName("sys_score")
public class SysScoreEntity implements Serializable {

    private static final long serialVersionUID = 1L;

	@TableId
	private Integer id;
	@TableField("user_id")
	private Long userId;
	@TableField("tutor_score")
	private Integer tutorScore;
	@TableField("performance_score")
	private Integer performanceScore;
	@TableField("train_score")
	private Integer trainScore;
	@TableField("professional_score")
	private Integer professionalScore;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public SysScoreEntity setUserId(Long userId) {
		this.userId = userId;
		return this;
	}

	public Integer getTutorScore() {
		return tutorScore;
	}

	public void setTutorScore(Integer tutorScore) {
		this.tutorScore = tutorScore;
	}

	public Integer getPerformanceScore() {
		return performanceScore;
	}

	public void setPerformanceScore(Integer performanceScore) {
		this.performanceScore = performanceScore;
	}

	public Integer getTrainScore() {
		return trainScore;
	}

	public void setTrainScore(Integer trainScore) {
		this.trainScore = trainScore;
	}

	public Integer getProfessionalScore() {
		return professionalScore;
	}

	public void setProfessionalScore(Integer professionalScore) {
		this.professionalScore = professionalScore;
	}

}
