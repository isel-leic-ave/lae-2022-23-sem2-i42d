package pt.isel.leic.lae.li42d.lesson11;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;
import java.util.*;

@BenchmarkMode(Mode.AverageTime)
@Fork(value = 1, warmups = 1)
@Measurement(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@Warmup(iterations = 3, time = 5, timeUnit = TimeUnit.SECONDS)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class BoxUnboxBenchmark {


	@Benchmark
	public void primitiveArray() {
		int[] intValues = new int[1000];
		for (int i = 0; i < intValues.length ; i++) {
			intValues[i] = i;
		}
	}

	@Benchmark
	public void boxedArray() {
		Integer[] intValues = new Integer[1000];
		for (int i = 0; i < intValues.length ; i++) {
			intValues[i] = i;
		}

	}
}