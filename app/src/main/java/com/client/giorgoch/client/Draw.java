package com.client.giorgoch.client;

public class Draw {
    private String drawTime;
    private String[] results;
    private String drawNo;

    public String getDrawTime() {
        return drawTime;
    }

    public void setDrawTime(String drawTime) {
        this.drawTime = drawTime;
    }

    public String[] getResults() {
        return results;
    }

    public void setResults(String[] results) {
        this.results = results;
    }

    public String getDrawNo() {
        return drawNo;
    }

    public void setDrawNo(String drawNo) {
        this.drawNo = drawNo;
    }

    @Override
    public String toString() {
        return "ClassPojo [drawTime = " + drawTime + ", results = " + results + ", drawNo = " + drawNo + "]";
    }
}
