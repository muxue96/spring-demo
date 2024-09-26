package org.ljc.springbootdemo14.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Goods {
    private String id;
    private String name;
    private String type;
    private String description;
}
