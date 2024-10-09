package org.example.model;

public class ProductPojo {
    private int prodId;
    private String prodName;

    public ProductPojo() {
    }

    public ProductPojo(int prodId, String prodName) {
        this.prodId = prodId;
        this.prodName = prodName;
    }

    public int getProdId() {
        return prodId;
    }

    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }
}
