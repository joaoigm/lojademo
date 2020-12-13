package com.joaoigm.lojademo

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.joaoigm")
		.start()
}

