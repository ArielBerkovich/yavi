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
package am.ik.yavi.constraint.array;

import java.util.Arrays;
import java.util.function.ToIntFunction;

import static am.ik.yavi.core.NullValidity.NULL_IS_VALID;

import am.ik.yavi.constraint.base.ContainerConstraintBase;
import am.ik.yavi.core.ConstraintPredicate;

public class LongArrayConstraint<T>
		extends ContainerConstraintBase<T, long[], LongArrayConstraint<T>> {

	@Override
	public LongArrayConstraint<T> cast() {
		return this;
	}

	@Override
	protected ToIntFunction<long[]> size() {
		return x -> x.length;
	}

	public LongArrayConstraint<T> contains(long v) {
		this.predicates().add(new ConstraintPredicate<>(
				x -> Arrays.stream(x).anyMatch(e -> e == v), "array.contains",
				"\"{0}\" must contain {1}", () -> new Object[] { v }, NULL_IS_VALID));
		return this;
	}
}
