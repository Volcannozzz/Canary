package org.canary.core.handler;

import org.canary.core.runtime.Invocation;

public interface Handler {

    void handle(Invocation invocation);
}
