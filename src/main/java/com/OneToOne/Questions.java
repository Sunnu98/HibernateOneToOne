package com.OneToOne;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Questions {

	@Id
	@Column(name="Quetion_id")
	private int quetionId;
	
	private String question;
	
    @OneToOne
	private Answer answer;

	public int getQuetionId() {
		return quetionId;
	}

	public void setQuetionId(int quetionId) {
		this.quetionId = quetionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Answer getAnswer() {
		return answer;
	}

	public void setAnswer(Answer answer) {
		this.answer = answer;
	}

	public Questions() {
		super();
	}

	public Questions(int quetionId, String question, Answer answer) {
		super();
		this.quetionId = quetionId;
		this.question = question;
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Quetions [quetionId=" + quetionId + ", question=" + question + ", answer=" + answer + "]";
	}
	
}
