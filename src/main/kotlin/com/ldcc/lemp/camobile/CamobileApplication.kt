package com.ldcc.lemp.camobile

import org.springframework.boot.Banner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CamobileApplication

fun main(args: Array<String>) {
	runApplication<CamobileApplication>(*args) {
		setBannerMode(Banner.Mode.OFF)
	}
}
