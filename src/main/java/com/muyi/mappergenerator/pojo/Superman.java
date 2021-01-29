package com.muyi.mappergenerator.pojo;

import javax.persistence.*;
import lombok.Data;

@Data
@Table(name = "t_superman")
public class Superman {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    private String name;

    private Byte open;

    private Integer pid;
}