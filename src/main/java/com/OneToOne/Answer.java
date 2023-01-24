package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name="answer_id")
	private int answerId;
	private String answer;
	
	@OneToOne(mappedBy="answer")
	private Questions quetion;
	
	public int getAnswerId() {
		return answerId;
	}
	public void setAnswerId(int answerId) {
		this.answerId = answerId;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public Answer() {
		super();
	}
	
	public Answer(int answerId, String answer) {
		super();
		this.answerId = answerId;
		this.answer = answer;
	}
	
	@Override
	public String toString() {
		return "Answer [answerId=" + answerId + ", answer=" + answer + "]";
	}
	
}
