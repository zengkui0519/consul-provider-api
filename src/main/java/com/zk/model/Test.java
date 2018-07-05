package com.zk.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Test implements Serializable {

    private static final long serialVersionUID = 1675934544413749317L;

    private Long id;
    private String name;

}