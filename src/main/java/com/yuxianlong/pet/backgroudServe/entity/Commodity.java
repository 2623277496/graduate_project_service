package com.yuxianlong.pet.backgroudServe.entity;


public class Commodity {
    private String commodity_id;
    private String commodity_name;
    private String commodity_money;
    private Integer commodity_quantity;
    private String quantity_img_url;

    public Commodity() {
    }

    public Commodity(String commodity_id, String commodity_name, String commodity_money, Integer commodity_quantity, String quantity_img_url) {
        this.commodity_id = commodity_id;
        this.commodity_name = commodity_name;
        this.commodity_money = commodity_money;
        this.commodity_quantity = commodity_quantity;
        this.quantity_img_url = quantity_img_url;
    }

    public String getCommodity_id() {
        return commodity_id;
    }

    public void setCommodity_id(String commodity_id) {
        this.commodity_id = commodity_id;
    }

    public String getCommodity_name() {
        return commodity_name;
    }

    public void setCommodity_name(String commodity_name) {
        this.commodity_name = commodity_name;
    }

    public String getCommodity_money() {
        return commodity_money;
    }

    public void setCommodity_money(String commodity_money) {
        this.commodity_money = commodity_money;
    }

    public Integer getCommodity_quantity() {
        return commodity_quantity;
    }

    public void setCommodity_quantity(Integer commodity_quantity) {
        this.commodity_quantity = commodity_quantity;
    }

    public String getQuantity_img_url() {
        return quantity_img_url;
    }

    public void getQuantity_img_url(String quantity_img_url) {
        this.quantity_img_url = quantity_img_url;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "commodity_id='" + commodity_id + '\'' +
                ", commodity_name='" + commodity_name + '\'' +
                ", commodity_money='" + commodity_money + '\'' +
                ", commodity_quantity=" + commodity_quantity +
                ", quantity_img='" + quantity_img_url + '\'' +
                '}';
    }


}
