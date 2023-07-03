package com.ac.bnc.AppObj;

import java.io.Serializable;

public class BroadcastEventArg implements Serializable {

    public int EventTypeID = -1;
    public int getEventTypeID() {
        return EventTypeID;
    }

    public Object EventObj = null;
    public Object getEventObj() {
        return EventObj;
    }
    public BroadcastEventArg() {
    }

    public BroadcastEventArg(int eventType, Object eventObj) {
        this.EventTypeID = eventType;
        this.EventObj = eventObj;
    }


}
