package org.canary.core.base;

import org.canary.core.config.MicroServiceConfig;

/**
 * 服务分为服务提供者和服务消费者
 *
 * 但本质二者都属于微服务,因此在这2个概念上层抽象出该接口
 */
public interface MicroService {

    //TODO
    // version问题暂不处理,因为这是一个简易的框架

    /**
     * 微服务名称
     * @return 微服务名称
     */
    String getServiceName();

    /**
     * 微服务类型,是 提供者还是调用者,当然也可以2种角色都是
     * @return Enum
     */
    MicroServiceType getMicroServiceType();

    /**
     *
     * @return 微服务配置
     */
    MicroServiceConfig getMicroServiceConfig();

    /**
     *
     * @return 自身状态,健康还是不健康
     */
    MicroServiceStatus getMicroServiceStatus();
}
