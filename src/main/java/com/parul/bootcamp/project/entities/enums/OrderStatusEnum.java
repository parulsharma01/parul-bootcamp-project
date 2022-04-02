package com.parul.bootcamp.project.entities.enums;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public enum OrderStatusEnum {
  ORDER_PLACED,  CANCELLED,  ORDER_REJECTED,  ORDER_CONFIRMED,  ORDER_SHIPPED,  DELIVERED,  RETURN_REQUESTED,  RETURN_REJECTED,  RETURN_APPROVED,  PICK_UP_INITIATED,  PICK_UP_COMPLETED,  REFUND_INITIATED,  REFUND_COMPLETED
  ,CLOSED;
  public static HashMap<OrderStatusEnum,List<OrderStatusEnum>> fromToMapping(){
    return new HashMap<OrderStatusEnum,List<OrderStatusEnum>>(){{
      put(ORDER_PLACED,new ArrayList<OrderStatusEnum>(){{
        add(CANCELLED);
        add(ORDER_CONFIRMED);
        add(ORDER_REJECTED);
      }});
      put(CANCELLED,new ArrayList<OrderStatusEnum>(){{
        add(REFUND_INITIATED);
        add(CLOSED);
      }});
      put(ORDER_REJECTED,new ArrayList<OrderStatusEnum>(){{
        add(CANCELLED);
        add(REFUND_INITIATED);
        add(CLOSED);
      }});
      put(ORDER_CONFIRMED,new ArrayList<OrderStatusEnum>(){{
        add(CANCELLED);
        add(ORDER_SHIPPED);
      }});
      put(ORDER_SHIPPED,new ArrayList<OrderStatusEnum>(){{
        add(DELIVERED);
      }});
    }};
  }
}
