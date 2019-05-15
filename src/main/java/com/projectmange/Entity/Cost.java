package com.projectmange.Entity;
/**
 * @Auther: ziyang
 * @Date:
 * @Description: 和单个project科研项目挂钩的项目消费分支表，中间含有发票上传，即各种信息，包括审核状态等等。
 * @version: 1.0
 */
public class Cost {
    private int id;
    private String costname;
    private String usefor;
    private int price;
    private String invoiceuri;
    private String state;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCostname() {
        return costname;
    }

    public void setCostname(String costname) {
        this.costname = costname;
    }

    public String getUsefor() {
        return usefor;
    }

    public void setUsefor(String usefor) {
        this.usefor = usefor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInvoiceuri() {
        return invoiceuri;
    }

    public void setInvoiceuri(String invoiceuri) {
        this.invoiceuri = invoiceuri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "id=" + id +
                ", costname='" + costname + '\'' +
                ", usefor='" + usefor + '\'' +
                ", price=" + price +
                ", invoiceuri='" + invoiceuri + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
