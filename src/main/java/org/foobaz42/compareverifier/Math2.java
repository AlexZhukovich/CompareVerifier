/*
  Copyright (c) 2019-present, ComparatorVerifier Contributors.

  Licensed under the Apache License, Version 2.0 (the "License"); you may not
  use this file except in compliance with the License. You may obtain a copy
  of the License at

  http://www.apache.org/licenses/LICENSE-2.0

  Unless required by applicable law or agreed to in writing, software
  distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
  WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
  License for the specific language governing permissions and limitations
  under the License.
 */
package org.foobaz42.compareverifier;

/**
 * The class {@code Math2} contains methods for performing basic numeric
 * operations such as the elementary exponential, logarithm, square root,
 * and trigonometric functions.
 */
final class Math2 {
    private Math2() {
        throw new IllegalStateException("Math2 should not be instantiated!");
    }

    /**
     * Returns the sgn (signum) function of the argument; zero if the argument
     * is zero, 1 if the argument is greater than zero, -1 if the argument is
     * less than zero.
     *
     * @param value int whose sgn is to be returned
     * @return the sgn (signum) function of the argument
     */
    static int sgn(final int value) {
        if (0 != value)
            return (value / Math.abs(value));
        return 0;
    }
}
