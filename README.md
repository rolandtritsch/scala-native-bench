# Playing around with the benchmarks from [scala-native](https://github.com/scala-native/scala-native)

Was not able to make clone/compile scala-native.

At the end ...

* I created a scala-native project from scratch (`sbt new scala-native/scala-native.g8`)
* and manually created a/the `Discover.scala` file (in the native build the file get generated)

With that ... you just need to ...

* install git (`brew install git`)
* install sbt (`brew install sbt`)
* clone this repo (`git clone ...`)
* run the benchmarks (`sbt run`)
  * Note: This will take 5 mins. Get a coffee. Be patient. No output until the end.