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

import org.jannocessor.collection.api.PowerList;
import org.jannocessor.model.CodeNode;
import org.jannocessor.model.bean.modifier.NestedClassModifiersBean;
import org.jannocessor.model.modifier.NestedClassModifiers;
import org.jannocessor.model.modifier.value.NestedClassModifierValue;
import org.jannocessor.model.structure.AbstractJavaStructure;
import org.jannocessor.model.structure.JavaNestedClass;
import org.jannocessor.model.util.ModelUtils;

public final class JavaNestedClassAdapter extends AbstractJavaClassAdapter
		implements JavaNestedClass {

	private static final long serialVersionUID = 2252889290671782943L;
	@SuppressWarnings("unused")
	private final TypeElement tclass;

	public JavaNestedClassAdapter(TypeElement tclass, Elements elementUtils,
			Types typeUtils) {
		super(tclass, elementUtils, typeUtils);

		this.tclass = tclass;
	}

	@Override
	public NestedClassModifiers getModifiers() {
		return new NestedClassModifiersBean(
				getModifierValues(NestedClassModifierValue.class));
	}

	@Override
	protected Class<? extends JavaNestedClass> getAdaptedInterface() {
		return JavaNestedClass.class;
	}

	@Override
	public PowerList<CodeNode> getChildren() {
		return ModelUtils.getChildren(this);
	}

	@Override
	public AbstractJavaStructure getParent() {
		return super.retrieveParent();
	}

	@Override
	public JavaNestedClass copy() {
		throw calculatedMethodException();
	}

}
