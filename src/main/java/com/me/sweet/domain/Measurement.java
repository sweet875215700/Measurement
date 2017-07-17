package com.me.sweet.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by weisw.shi on 2017/7/16.
 */
public class Measurement implements Serializable {


    private String name;

    private List<model> answers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<model> getAnswers() {
        return answers;
    }

    public void setAnswers(List<model> answers) {
        this.answers = answers;
    }

    public static class model {

        private Integer index ;
        private String select;
        private Integer selectScore;

        public Integer getIndex() {
            return index;
        }

        public void setIndex(Integer index) {
            this.index = index;
        }

        public String getSelect() {
            return select;
        }

        public void setSelect(String select) {
            this.select = select;
        }

        public Integer getSelectScore() {
            return selectScore;
        }

        public void setSelectScore(Integer selectScore) {
            this.selectScore = selectScore;
        }
    }
}
