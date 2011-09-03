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

package org.jannocessor.adapter;

import javax.lang.model.element.Element;
import javax.lang.model.element.ElementKind;
import javax.lang.model.element.ExecutableElement;
import javax.lang.model.element.PackageElement;
import javax.lang.model.element.TypeElement;
import javax.lang.model.element.TypeParameterElement;
import javax.lang.model.element.VariableElement;
import javax.lang.model.type.TypeMirror;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

import org.jannocessor.adapter.executable.JavaConstructorAdapter;
import org.jannocessor.adapter.executable.JavaInstanceInitAdapter;
import org.jannocessor.adapter.executable.JavaMethodAdapter;
import org.jannocessor.adapter.executable.JavaStaticInitAdapter;
import org.jannocessor.adapter.type.JavaAnnotationAdapter;
import org.jannocessor.adapter.type.JavaClassAdapter;
import org.jannocessor.adapter.type.JavaEnumAdapter;
import org.jannocessor.adapter.type.JavaInterfaceAdapter;
import org.jannocessor.adapter.type.JavaPackageAdapter;
import org.jannocessor.adapter.type.JavaTypeParameterAdapter;
import org.jannocessor.adapter.variable.JavaEnumConstantAdapter;
import org.jannocessor.adapter.variable.JavaExceptionParameterAdapter;
import org.jannocessor.adapter.variable.JavaFieldAdapter;
import org.jannocessor.adapter.variable.JavaLocalVariableAdapter;
import org.jannocessor.adapter.variable.JavaParameterAdapter;
import org.jannocessor.data.JavaClassData;
import org.jannocessor.domain.JavaElement;
import org.jannocessor.domain.JavaElementType;
import org.jannocessor.domain.Name;
import org.jannocessor.domain.Text;
import org.jannocessor.proxy.JavaClassProxy;

public class AdapterFactory {

	@SuppressWarnings("unchecked")
	public static <T extends JavaElement> T getElementModel(Element element,
			Class<T> clazz, Elements elementUtils, Types typeUtils) {

		if (element != null) {

			JavaElement model;

			ElementKind kind = element.getKind();
			switch (kind) {

			/* Package and types */

			case PACKAGE:
				model = new JavaPackageAdapter((PackageElement) element,
						elementUtils, typeUtils);
				break;

			case ENUM:
				model = new JavaEnumAdapter((TypeElement) element,
						elementUtils, typeUtils);
				break;

			case CLASS:
				JavaClassAdapter adapter = new JavaClassAdapter(
						(TypeElement) element, elementUtils, typeUtils);
				JavaClassData data = new JavaClassData();
				model = new JavaClassProxy(adapter, data);
				break;

			case ANNOTATION_TYPE:
				model = new JavaAnnotationAdapter((TypeElement) element,
						elementUtils, typeUtils);
				break;

			case INTERFACE:
				model = new JavaInterfaceAdapter((TypeElement) element,
						elementUtils, typeUtils);
				break;

			case TYPE_PARAMETER:
				model = new JavaTypeParameterAdapter(
						(TypeParameterElement) element, elementUtils, typeUtils);
				break;

			/* Variables */

			case ENUM_CONSTANT:
				model = new JavaEnumConstantAdapter((VariableElement) element,
						elementUtils, typeUtils);
				break;

			case FIELD:
				model = new JavaFieldAdapter((VariableElement) element,
						elementUtils, typeUtils);
				break;

			case PARAMETER:
				model = new JavaParameterAdapter((VariableElement) element,
						elementUtils, typeUtils);
				break;

			case LOCAL_VARIABLE:
				model = new JavaLocalVariableAdapter((VariableElement) element,
						elementUtils, typeUtils);
				break;

			case EXCEPTION_PARAMETER:
				model = new JavaExceptionParameterAdapter(
						(VariableElement) element, elementUtils, typeUtils);
				break;

			/* Executables */

			case METHOD:
				model = new JavaMethodAdapter((ExecutableElement) element,
						elementUtils, typeUtils);
				break;

			case CONSTRUCTOR:
				model = new JavaConstructorAdapter((ExecutableElement) element,
						elementUtils, typeUtils);
				break;

			case STATIC_INIT:
				model = new JavaStaticInitAdapter((ExecutableElement) element,
						elementUtils, typeUtils);
				break;

			case INSTANCE_INIT:
				model = new JavaInstanceInitAdapter(
						(ExecutableElement) element, elementUtils, typeUtils);
				break;

			default:
				throw new IllegalStateException();
			}

			if (clazz.isAssignableFrom(model.getClass())) {
				return (T) model;
			} else {
				throw new IllegalStateException("Wrong element type!");
			}
		} else {
			return null;
		}
	}

	public static JavaElementType getTypeModel(TypeMirror typeMirror,
			Elements elementUtils, Types typeUtils) {
		if (typeMirror != null) {
			return new ElementTypeAdapter(typeMirror, elementUtils, typeUtils);
		} else {
			return null;
		}
	}

	public static Text getTextModel(String text) {
		if (text != null) {
			return new TextAdapter(text);
		} else {
			return null;
		}
	}

	public static Name getNameModel(String text) {
		if (text != null) {
			return new NameAdapter(text);
		} else {
			return null;
		}
	}

}