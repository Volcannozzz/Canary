package org.canary.core.registry;

import org.canary.core.definition.MicroService;
import org.canary.core.definition.MicroServiceType;

import java.util.HashMap;
import java.util.Map;

/**
 * 先在内存实现一个注册中心
 */
public class DefaultRegistryImpl implements Registry {

    private final Map<String, MicroService> producers = new HashMap<>();
    private final Map<String, MicroService> consumers = new HashMap<>();

    @Override
    public boolean registerMicroService(MicroService microService) {
        return false;
    }
}
