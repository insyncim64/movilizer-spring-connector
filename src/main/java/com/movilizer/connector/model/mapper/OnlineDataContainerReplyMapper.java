package com.movilizer.connector.model.mapper;

import com.movilitas.movilizer.v14.MovilizerOnlineDataContainerReply;

public interface OnlineDataContainerReplyMapper <T>{
    MovilizerOnlineDataContainerReply toOnlineDataContainer(T instanceOfObject);
}