/**
 * Copyright 2011 jannocessor.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jannocessor.domain.type;

import java.util.List;

import org.jannocessor.bootstrap.annotation.DomainModel;
import org.jannocessor.domain.executable.JavaConstructor;
import org.jannocessor.domain.executable.JavaInstanceInit;
import org.jannocessor.domain.executable.JavaMethod;
import org.jannocessor.domain.executable.JavaStaticInit;
import org.jannocessor.domain.variable.JavaField;

@DomainModel
public interface JavaClass extends JavaType {

	List<JavaField> getFields();

	List<JavaConstructor> getConstructors();

	List<JavaMethod> getMethods();

	List<JavaStaticInit> getStaticInits();

	List<JavaInstanceInit> getInstanceInits();

}
