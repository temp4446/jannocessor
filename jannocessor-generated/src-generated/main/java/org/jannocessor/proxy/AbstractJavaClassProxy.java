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

package org.jannocessor.proxy;

import javax.annotation.Generated;
import org.jannocessor.proxy.AbstractJavaStructureProxy;
import org.jannocessor.model.structure.AbstractJavaClass;
import org.jannocessor.data.AbstractJavaClassData;
import org.jannocessor.collection.api.PowerList;
import org.jannocessor.model.structure.JavaTypeParameter;
import org.jannocessor.model.variable.JavaField;
import org.jannocessor.model.executable.JavaConstructor;
import org.jannocessor.model.executable.JavaStaticInit;
import org.jannocessor.model.executable.JavaInstanceInit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jannocessor.util.TypeSpecificStyle;
import org.apache.commons.lang.builder.ToStringBuilder;


@Generated("JAnnocessor-bootstraped")
public class AbstractJavaClassProxy extends AbstractJavaStructureProxy implements AbstractJavaClass {

    private AbstractJavaClass adapter;

    private AbstractJavaClassData data;

    public AbstractJavaClassProxy(AbstractJavaClass adapter, AbstractJavaClassData data) {
        super(adapter, data);
        this.adapter = adapter;
        this.data = data;
    }

	private boolean getParametersInitialized = false;

	private boolean getFieldsInitialized = false;

	private boolean getConstructorsInitialized = false;

	private boolean getStaticInitsInitialized = false;

	private boolean getInstanceInitsInitialized = false;


    public PowerList<JavaTypeParameter> getParameters() {
        if (!getParametersInitialized) {
            data.setParameters(adapter.getParameters());
			getParametersInitialized = true;
        }

        return data.getParameters();
    }

    public PowerList<JavaField> getFields() {
        if (!getFieldsInitialized) {
            data.setFields(adapter.getFields());
			getFieldsInitialized = true;
        }

        return data.getFields();
    }

    public PowerList<JavaConstructor> getConstructors() {
        if (!getConstructorsInitialized) {
            data.setConstructors(adapter.getConstructors());
			getConstructorsInitialized = true;
        }

        return data.getConstructors();
    }

    public PowerList<JavaStaticInit> getStaticInits() {
        if (!getStaticInitsInitialized) {
            data.setStaticInits(adapter.getStaticInits());
			getStaticInitsInitialized = true;
        }

        return data.getStaticInits();
    }

    public PowerList<JavaInstanceInit> getInstanceInits() {
        if (!getInstanceInitsInitialized) {
            data.setInstanceInits(adapter.getInstanceInits());
			getInstanceInitsInitialized = true;
        }

        return data.getInstanceInits();
    }

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof AbstractJavaClass)) {
			return false;
		}

		AbstractJavaClass other = (AbstractJavaClass) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(other))
				.append(this.getParameters(), other.getParameters())
				.append(this.getFields(), other.getFields())
				.append(this.getConstructors(), other.getConstructors())
				.append(this.getStaticInits(), other.getStaticInits())
				.append(this.getInstanceInits(), other.getInstanceInits())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.getParameters())
				.append(this.getFields())
				.append(this.getConstructors())
				.append(this.getStaticInits())
				.append(this.getInstanceInits())
				.toHashCode();
	}

	@Override
	public String toString() {
		TypeSpecificStyle style = new TypeSpecificStyle(AbstractJavaClass.class);
		ToStringBuilder builder = new ToStringBuilder(this, style);
		appendDescription(builder);
		return builder.toString();
	}

	@Override
	protected void appendDescription(ToStringBuilder builder) {
        super.appendDescription(builder);
        builder.append("parameters", this.getParameters());
        builder.append("fields", this.getFields());
        builder.append("constructors", this.getConstructors());
        builder.append("staticInits", this.getStaticInits());
        builder.append("instanceInits", this.getInstanceInits());
	}

}


