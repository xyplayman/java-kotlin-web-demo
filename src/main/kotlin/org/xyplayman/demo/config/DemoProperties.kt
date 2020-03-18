package org.xyplayman.demo.config

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

data class Group(val one: String, val two: String)

@ConstructorBinding
@ConfigurationProperties(prefix = "demo")
data class DemoProperties(val one: String, val group: Group)
