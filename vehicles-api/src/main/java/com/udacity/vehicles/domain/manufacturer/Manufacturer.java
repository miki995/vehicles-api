package com.udacity.vehicles.domain.manufacturer;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Declares class to hold car manufacturer information.
 */
@Entity
public class Manufacturer {

    @Id
    private Integer code;

    @ApiModelProperty(hidden = true)
    private String name;

    public Manufacturer() {
    }

    public Manufacturer(Integer code, String name) {
        this.code = code;
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
