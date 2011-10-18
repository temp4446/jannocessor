/**
 * Copyright 2011 Nikolche Mihajlovski
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

package org.jannocessor.model.bean.structure;

import java.util.List;

import org.jannocessor.collection.Power;
import org.jannocessor.data.JavaNestedAnnotationData;
import org.jannocessor.model.bean.NameBean;
import org.jannocessor.model.executable.JavaMethod;
import org.jannocessor.model.modifier.NestedAnnotationModifiers;
import org.jannocessor.model.structure.JavaNestedAnnotation;
import org.jannocessor.model.structure.JavaNestedClass;
import org.jannocessor.model.structure.JavaNestedEnum;
import org.jannocessor.model.structure.JavaNestedInterface;
import org.jannocessor.model.util.New;

public class JavaNestedAnnotationBean extends JavaNestedAnnotationData
		implements JavaNestedAnnotation {

	public JavaNestedAnnotationBean(NestedAnnotationModifiers modifiers,
			String name, List<JavaMethod> methods) {
		this.setModifiers(modifiers);
		this.setName(new NameBean(name));
		this.setMethods(Power.list(methods));

		this.setNestedClasses(Power.emptyList(JavaNestedClass.class));
		this.setNestedEnums(Power.emptyList(JavaNestedEnum.class));
		this.setNestedInterfaces(Power.emptyList(JavaNestedInterface.class));
		this.setNestedAnnotations(Power.emptyList(JavaNestedAnnotation.class));

		this.setCode(New.code(JavaNestedAnnotation.class));
	}
}
