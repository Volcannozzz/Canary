package org.canary.core.definition;

import org.canary.core.config.MicroServiceConfig;

/**
 * 服务分为服务提供者和服务消费者
 */
public class MicroService {

    String name;

    MicroServiceType type;

    MicroServiceConfig config;

    //TODO
    // version问题暂不处理,因为这是一个简易的框架

    /**
     * 微服务名称
     *
     * @return 微服务名称
     */
    String getMicroServiceName() {
        return name;
    }

    /**
     * 微服务类型,是 提供者还是调用者,当然也可以2种角色都是
     *
     * @return Enum
     */
    MicroServiceType getMicroServiceType() {
        return type;
    }

    /**
     * @return 微服务配置
     */
    MicroServiceConfig getMicroServiceConfig() {
        return config;
    }

    /**
     * @return 自身状态, 健康还是不健康
     */
    MicroServiceStatus getMicroServiceStatus() {
        return MicroServiceStatus.HEALTH;
    }
}
