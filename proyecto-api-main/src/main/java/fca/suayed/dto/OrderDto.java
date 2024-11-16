package fca.suayed.dto;

import org.jdbi.v3.core.mapper.reflect.ColumnName;

public class OrderDto {
    private Long id;
    private Integer clientID;
    private Integer productID;
    private Integer quantity;
    private java.time.LocalDate  date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ColumnName("cliente_id")
    public Integer getClientID() {
        return clientID;
    }

    public void setclientID(Integer clientID) {
        this.clientID = clientID;
    }

    @ColumnName("producto_id")
    public Integer getProductID() {
        return productID;
    }

    public void setProductID(Integer productID) {
        this.productID = productID;
    }

    @ColumnName("cantidad")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @ColumnName("fecha")
    public java.time.LocalDate getDate() {
        return date;
    }

    public void setDate(java.time.LocalDate date) {
        this.date = date;
    }
}
