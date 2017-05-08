package com.haiziyouke;

import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * Created by danbai on 17/5/2.
 */
@Configuration
@EnableRedisHttpSession
public class RedisSessionConfig {
}
