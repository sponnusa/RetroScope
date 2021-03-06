/*
 *  Copyright 2010 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.android.testing.mocking;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Annotation that indicates that a Class should be prepared for Mocking.
 *
 * E.g. {@code &#64;UsesMocks(ClassToMock.class)} will indicate that ClassToMock should be prepared
 * for mocking. Preparation for mocking involves the creation of new classes that will then be
 * available at runtime on the Dalvik VM (assuming that the Jar file generated by MockGenerator is
 * added to the APK uploaded to the device/emulator).
 * @author swoodward@google.com (Stephen Woodward)
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface UsesMocks {
  Class<?>[] value();
}
