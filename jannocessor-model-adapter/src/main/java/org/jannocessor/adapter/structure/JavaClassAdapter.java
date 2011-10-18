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

package org.jannocessor.adapter.structure;

import javax.lang.model.element.TypeElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import org.jannocessor.model.bean.modifier.ClassModifiersBean;
import org.jannocessor.model.modifier.ClassModifiers;
import org.jannocessor.model.modifier.value.ClassModifierValue;
import org.jannocessor.model.structure.JavaClass;
import org.jannocessor.model.util.New;

public final class JavaClassAdapter extends AbstractJavaClassAdapter implements
		JavaClass {

	@SuppressWarnings("unused")
	private final TypeElement tclass;

	public JavaClassAdapter(TypeElement tclass, Elements elementUtils,
			Types typeUtils) {
		super(tclass, elementUtils, typeUtils);
		this.setCode(New.code(JavaClass.class));
		this.tclass = tclass;
	}

	@Override
	public ClassModifiers getModifiers() {
		return new ClassModifiersBean(
				getModifierValues(ClassModifierValue.class));
	}

}
