package org.xyplayman.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.xyplayman.demo.config.DemoProperties

@SpringBootApplication
@EnableConfigurationProperties(DemoProperties::class)
class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
