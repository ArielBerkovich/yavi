/*
 * Copyright (C) 2018 Toshiaki Maki <makingx@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package am.ik.yavi.constraint;

import java.math.BigDecimal;
import java.util.function.Predicate;

import am.ik.yavi.constraint.base.NumberConstraintBase;

public class BigDecimalConstraint<T>
		extends NumberConstraintBase<T, BigDecimal, BigDecimalConstraint<T>> {
	@Override
	protected Predicate<BigDecimal> isGreaterThan(BigDecimal min) {
		return x -> x.compareTo(min) > 0;
	}

	@Override
	protected Predicate<BigDecimal> isGreaterThanOrEquals(BigDecimal min) {
		return x -> x.compareTo(min) >= 0;
	}

	@Override
	protected Predicate<BigDecimal> isLessThan(BigDecimal max) {
		return x -> x.compareTo(max) < 0;
	}

	@Override
	protected Predicate<BigDecimal> isLessThanOrEquals(BigDecimal max) {
		return x -> x.compareTo(max) <= 0;
	}

	@Override
	public BigDecimalConstraint<T> cast() {
		return this;
	}
}
