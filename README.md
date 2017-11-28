# Playing around with the benchmarks from [scala-native](https://github.com/scala-native/scala-native)

Was not able to make clone/compile scala-native work.

At the end ...

* I created a scala-native project from scratch (`sbt new scala-native/scala-native.g8`)
* and copied the source files from the scala-native GitHub repo
* and manually created a/the `Discover.scala` file (in the native build the file get generated)

With that ... you just need to ...

* install git (`brew install git`)
* install sbt (`brew install sbt`)
* clone this repo (`git clone ...`)
* build the benchmarks (`sbt compile`)
* run the benchmarks (`sbt run > report/$(date '+%Y%m%d%H%M%S').txt`)
  * Note: This will take 5 mins. Get a coffee. Be patient.
* look at the result in the report directory.

And as a bonus I added the [Fibonacci benchmarks](https://github.com/rolandtritsch/scala-fib-bench).

A sample for a test run result is in report/results.txt.