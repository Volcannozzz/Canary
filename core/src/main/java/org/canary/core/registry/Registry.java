package org.canary.core.registry;

import org.canary.core.definition.MicroService;

public interface Registry {

    boolean registerMicroService(MicroService microService);
}
