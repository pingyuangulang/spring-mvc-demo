package com.five.monkey.demo.entity;

public class Order {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.user_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    private Long userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.num
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    private Integer num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order.product_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    private Long productId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.id
     *
     * @return the value of order.id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.id
     *
     * @param id the value for order.id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.user_id
     *
     * @return the value of order.user_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.user_id
     *
     * @param userId the value for order.user_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.num
     *
     * @return the value of order.num
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public Integer getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.num
     *
     * @param num the value for order.num
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order.product_id
     *
     * @return the value of order.product_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order.product_id
     *
     * @param productId the value for order.product_id
     *
     * @mbg.generated Wed Oct 28 20:11:50 CST 2020
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }
}