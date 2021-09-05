package com.hadasht.study.puzzlers;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import static com.hadasht.study.puzzlers.utils.Constants.PUZZLE_NAME;
import static com.hadasht.study.puzzlers.utils.Constants.SOLUTION_NAME;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("SuspiciousSort")
class Puzzle65Test {

	@Test
	@DisplayName(PUZZLE_NAME)
	void puzzle() throws Exception {

		Random random = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
		}

		Comparator<Integer> cmp = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			}
		};

		Arrays.sort(arr, cmp);
		assertThat(SuspiciousSort.order(arr)).isEqualTo(Order.DESCENDING);
	}

	/*
	Comparator 클래스는 이행성을 만족시켜야한다
	(compare(x, y) > 0) && (compare(y, z) > 0) 이면 (compare(x, z) > 0) 성립해야 한다.
	뺄셈으로 compare() 를 구현하면 이 이행성에 위반된다.
	비교대상이 Integer.MAX_VALUE 보다 작다는 것을 확신할 수 없다면 뺄셈으로 구현하지 말아야 한다.
	 */
	@Test
	@DisplayName(SOLUTION_NAME)
	void solution() throws Exception {

		Random random = new Random();
		Integer[] arr = new Integer[100];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt();
		}

		Arrays.sort(arr, Collections.reverseOrder());
		assertThat(SuspiciousSort.order(arr)).isEqualTo(Order.DESCENDING);
	}

	enum Order {
		ASCENDING, DESCENDING, CONSTANT, UNORDERED;
	}
	static class SuspiciousSort {


		static Order order(Integer[] a) {
			boolean ascending = false;
			boolean descending = false;

			for (int i = 1; i < a.length; i++) {
				ascending |= (a[i] > a[i-1]);
				descending |= (a[i] < a[i-1]);
			}

			if (ascending && !descending) {
				return Order.ASCENDING;
			}
			if (descending && !ascending) {
				return Order.DESCENDING;
			}
			if (!ascending) {
				return Order.CONSTANT;//모든 요소가 같은 경우
			}
			return Order.UNORDERED;//정렬되지 않은 경우
		}
	}


}
