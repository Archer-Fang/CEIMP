package org.obsidian.ceimp.bean;

/**
 * Created by BillChen on 2017/11/14.
 */
public class StatusBean {
    private String status;

    @Override
    public String toString() {
        return "StatusBean{" +
                "status='" + status + '\'' +
                '}';
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
