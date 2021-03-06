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

import java.util.List;

/**
 * Defines a factory used for creation of instances used by verification in
 * {@link ComparableVerifier}.
 *
 * @param <A> type of the returned instances
 */
public interface VerificationInstancesCreator<A> {
    /**
     * Returns a List of instances that can be used by the
     * {@link ComparableVerifier}. Should not return a null List or a List that
     * contains null values.
     *
     * @return list of instances.
     */
    List<A> create();
}
