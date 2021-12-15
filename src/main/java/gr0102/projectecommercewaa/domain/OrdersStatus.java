package gr0102.projectecommercewaa.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("OrdersStatus")
@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum OrdersStatus {
    Just_ordered,
    Cancelled,
    Shipped,
    On_the_way,
    Delivered
}