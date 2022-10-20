package com.example.functionstrex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		// 정수를 파라미터로 받아 제곱을 구하여 리턴하는 square() 함수를 작성
		var squareResult = square(80);
		Log.d("correct", "${squareResult}")

		// 두 개의 정수를 받아 더한 값을 출력하는 printSum()함수 작성
		printSum(10, 3)
		Log.d("correct", "${printSum(10, 3)}")

		defaultFunc("박준혁", 23, 80.1)

		Log.d("correct", "${plus(10)}")

		Log.d("correct", "${comNultiple(23, 13)}")

	}

	fun square (idx : Int): Int {
		var id = idx * idx
		return id
	}

	fun printSum (x : Int, x1 : Int): Int {
		return x + x1
	}
	fun defaultFunc(name: String, age: Int = 29, weight: Double = 60.35){
		Log.d("funcText", "name : ${name}, age : ${age}, weight : ${weight}")
	}

	// 1개의 Int 파라미터x를 가지고 0부터 x 값까지 더한 후 리턴하는 함수 sum() 작성
	fun plus(x : Int) : Int {
		var sum = 0
		for(i in 0..x) {
			sum += i
		}
		return sum
	}

	// 최소 공배수 출력
	fun comNultiple(x : Int, x1 : Int) : Int{
		var idx = 0;
		if(x < x1) {
			for (i in 1..x1) {
				var result = (x1 * i) % x
				if (result == 0) {
					idx = i
					idx = idx * x1
					break
				}
			}
		}else if(x >= x1){
			for (i in 1..x) {
				var result = (x * i) % x1
				if (result == 0) {
					idx = i
					idx = idx * x
					break
				}
			}
		}
		return idx
	}

}