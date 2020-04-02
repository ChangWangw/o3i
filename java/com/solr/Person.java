package com.solr;

import lombok.Data;
import org.apache.solr.client.solrj.beans.Field;

/**
 * @author Change
 */
@Data
public class Person {
    @Field(value = "id")
    private String id;

    @Field(value = "name")
    private String name;

    @Field(value = "description")
    private String description;
}
