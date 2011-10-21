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

package org.jannocessor.adapter.variable;

import javax.lang.model.element.VariableElement;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import org.jannocessor.model.variable.JavaExceptionParameter;

public final class JavaExceptionParameterAdapter extends
		AbstractJavaVariableAdapter implements JavaExceptionParameter {

	private static final long serialVersionUID = -4815832690663017141L;
	@SuppressWarnings("unused")
	private final VariableElement exceptionParameter;

	public JavaExceptionParameterAdapter(VariableElement exceptionParameter,
			Elements elementUtils, Types typeUtils) {
		super(exceptionParameter, elementUtils, typeUtils);

		this.exceptionParameter = exceptionParameter;
	}

	@Override
	protected Class<? extends JavaExceptionParameter> getAdaptedInterface() {
		return JavaExceptionParameter.class;
	}

}
