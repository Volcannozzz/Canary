package org.canary.core.handler;


import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;

/**
 * 为了对一个微服务具有的handler有一个全面的视角
 *
 * @author canary
 */
public class HandlerChain {

    Logger logger = LoggerFactory.getLogger(HandlerChain.class);

    @Setter
    @Getter
    private LinkedHashMap<String, Handler> handlers = new LinkedHashMap<>();

    boolean addHandler(String name, Handler handler) {
        if (handlers.containsKey(name)) {
            logger.error("handler chain already have handler : {}", name);
            return false;
        }
        handlers.put(name, handler);
        return true;
    }

}
