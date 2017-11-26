package fibonacci

import benchmarks.{BenchmarkRunningTime, ShortRunningTime, LongRunningTime}
import som.Random

class FibonacciBenchmarkSimple extends benchmarks.Benchmark[Int] {

  override val runningTime: BenchmarkRunningTime = LongRunningTime

  override def run(): Int = {
    val random = new Random()
    val ignore = Fibonacci.fib1(Math.abs(random.next % 30))
    val result = Fibonacci.fib1(30)
    result
  }

  override def check(result: Int) = result == 832040
}

class FibonacciBenchmarkStream extends benchmarks.Benchmark[Int] {

  override val runningTime: BenchmarkRunningTime = LongRunningTime

  override def run(): Int = {
    val random = new Random()
    val ignore = Fibonacci.fib2(Math.abs(random.next % 30000))
    val result = Fibonacci.fib2(30)
    result
  }

  override def check(result: Int) = result == 832040
}

class FibonacciBenchmarkFastStream extends benchmarks.Benchmark[Int] {

  override val runningTime: BenchmarkRunningTime = LongRunningTime

  override def run(): Int = {
    val random = new Random()
    val ignore = Fibonacci.fib3(Math.abs(random.next % 30000))
    val result = Fibonacci.fib3(30)
    result
  }

  override def check(result: Int) = result == 832040
}

class FibonacciBenchmarkConstant extends benchmarks.Benchmark[Int] {

  override val runningTime: BenchmarkRunningTime = ShortRunningTime

  override def run(): Int = {
    val random = new Random()
    val ignore = Fibonacci.fib4(Math.abs(random.next % 30))
    val result = Fibonacci.fib4(30)
    result
  }

  override def check(result: Int) = result == 832040
}
