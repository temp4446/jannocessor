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

package org.jannocessor.model.util;

import org.jannocessor.model.modifier.NestedAnnotationModifiers;
import org.jannocessor.model.modifier.value.NestedAnnotationModifierValue;

public class NestedAnnotations {

	/** Represents the default nested class modifier. */
	public static final NestedAnnotationModifiers DEFAULT_MODIFIER = New
			.nestedAnnotationModifiers();

	/** Represents "public" nested class modifiers. */
	public static final NestedAnnotationModifiers PUBLIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PUBLIC);

	/** Represents "public abstract" nested class modifiers. */
	public static final NestedAnnotationModifiers PUBLIC_ABSTRACT = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PUBLIC,
					NestedAnnotationModifierValue.ABSTRACT);

	/** Represents "public abstract static" nested class modifiers. */
	public static final NestedAnnotationModifiers PUBLIC_ABSTRACT_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PUBLIC,
					NestedAnnotationModifierValue.ABSTRACT,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "public static" nested class modifiers. */
	public static final NestedAnnotationModifiers PUBLIC_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PUBLIC,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "private" nested class modifiers. */
	public static final NestedAnnotationModifiers PRIVATE = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PRIVATE);

	/** Represents "private abstract" nested class modifiers. */
	public static final NestedAnnotationModifiers PRIVATE_ABSTRACT = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PRIVATE,
					NestedAnnotationModifierValue.ABSTRACT);

	/** Represents "private abstract static" nested class modifiers. */
	public static final NestedAnnotationModifiers PRIVATE_ABSTRACT_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PRIVATE,
					NestedAnnotationModifierValue.ABSTRACT,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "private static" nested class modifiers. */
	public static final NestedAnnotationModifiers PRIVATE_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PRIVATE,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "protected" nested class modifiers. */
	public static final NestedAnnotationModifiers PROTECTED = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PROTECTED);

	/** Represents "protected abstract" nested class modifiers. */
	public static final NestedAnnotationModifiers PROTECTED_ABSTRACT = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PROTECTED,
					NestedAnnotationModifierValue.ABSTRACT);

	/** Represents "protected abstract static" nested class modifiers. */
	public static final NestedAnnotationModifiers PROTECTED_ABSTRACT_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PROTECTED,
					NestedAnnotationModifierValue.ABSTRACT,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "protected static" nested class modifiers. */
	public static final NestedAnnotationModifiers PROTECTED_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.PROTECTED,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "abstract" nested class modifiers. */
	public static final NestedAnnotationModifiers ABSTRACT = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.ABSTRACT);

	/** Represents "abstract static" nested class modifiers. */
	public static final NestedAnnotationModifiers ABSTRACT_STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.ABSTRACT,
					NestedAnnotationModifierValue.STATIC);

	/** Represents "static" nested class modifiers. */
	public static final NestedAnnotationModifiers STATIC = New
			.nestedAnnotationModifiers(NestedAnnotationModifierValue.STATIC);

}
