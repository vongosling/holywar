package com.fasheng.queue.event.sender;

import java.io.Serializable;

/**
 * @author von gosling 2012-1-9 05:10:32
 */
public interface AsyncSender {
    boolean send(Serializable message);
}
