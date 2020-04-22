package com.dev_m_elbanna.watsonbot.network.pojo;

import com.google.gson.annotations.SerializedName;

/**
 * Created By Mohamed El Banna On 4/3/2020
 **/

public class WatsonRequest {


    @SerializedName("input")
    private InputBean input;

    public InputBean getInput() {
        return input;
    }

    public void setInput(InputBean input) {
        this.input = input;
    }

    public static class InputBean {

        @SerializedName("text")
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
