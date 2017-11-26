package benchmarks

object Discover {
  val discovered = Seq (
    new bounce.BounceBenchmark,
    new brainfuck.BrainfuckBenchmark,
    new cd.CDBenchmark,
    new deltablue.DeltaBlueBenchmark,
    new gcbench.GCBenchBenchmark,
    new havlak.HavlakBenchmark,
    new json.JsonBenchmark,
    new list.ListBenchmark,
    new listperm.ListPermutationsBenchmark,
    new mandelbrot.MandelbrotBenchmark,
    new nbody.NbodyBenchmark,
    new permute.PermuteBenchmark,
    new queens.QueensBenchmark,
    new richards.RichardsBenchmark,
    // new sha512.SHA512Benchmark,
    new sieve.SieveBenchmark,
    new storage.StorageBenchmark,
    new sudoku.SudokuBenchmark,
    new towers.TowersBenchmark,
    new tracer.TracerBenchmark
  )
}
