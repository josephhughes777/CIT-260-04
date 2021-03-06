/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit260.pioneertrail.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Stephen
 */
public class Answers implements Serializable{
    
    private String question;
    private String answer;
    private String resultOfAnswer;

    public Answers() {
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getResultOfAnswer() {
        return resultOfAnswer;
    }

    public void setResultOfAnswer(String resultOfAnswer) {
        this.resultOfAnswer = resultOfAnswer;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.question);
        hash = 41 * hash + Objects.hashCode(this.answer);
        hash = 41 * hash + Objects.hashCode(this.resultOfAnswer);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Answers other = (Answers) obj;
        if (!Objects.equals(this.question, other.question)) {
            return false;
        }
        if (!Objects.equals(this.answer, other.answer)) {
            return false;
        }
        if (!Objects.equals(this.resultOfAnswer, other.resultOfAnswer)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Answers{" + "question=" + question + ", answer=" + answer + ", resultOfAnswer=" + resultOfAnswer + '}';
    }

}
