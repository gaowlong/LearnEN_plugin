package com.longshihan.learnEN2.setting.model;

public class SettingConfig {
    private String filePath;
    private String learnType;
    private boolean startMsg;
    private boolean addHistory;

    private int startIndex;
    private String dictId;
    private int pagesize;

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public String getDictId() {
        return dictId;
    }

    public void setDictId(String dictId) {
        this.dictId = dictId;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getLearnType() {
        return learnType;
    }

    public void setLearnType(String learnType) {
        this.learnType = learnType;
    }

    public boolean isStartMsg() {
        return startMsg;
    }

    public void setStartMsg(boolean startMsg) {
        this.startMsg = startMsg;
    }

    public boolean isAddHistory() {
        return addHistory;
    }

    public void setAddHistory(boolean addHistory) {
        this.addHistory = addHistory;
    }
}
