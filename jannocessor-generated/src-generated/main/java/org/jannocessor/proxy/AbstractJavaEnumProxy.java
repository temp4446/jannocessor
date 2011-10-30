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
import org.jannocessor.model.structure.AbstractJavaEnum;
import org.jannocessor.data.AbstractJavaEnumData;
import org.jannocessor.model.util.ModelUtils;
import org.jannocessor.collection.api.PowerList;
import org.jannocessor.model.variable.JavaEnumConstant;
import org.jannocessor.model.variable.JavaField;
import org.jannocessor.model.executable.JavaConstructor;
import org.jannocessor.model.executable.JavaStaticInit;
import org.jannocessor.model.executable.JavaInstanceInit;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.jannocessor.util.TypeSpecificStyle;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.jannocessor.model.util.ToStringUtil;


@Generated("JAnnocessor-bootstraped")
public class AbstractJavaEnumProxy extends AbstractJavaStructureProxy implements AbstractJavaEnum {

	private static final long serialVersionUID = 1L;

    private transient AbstractJavaEnum adapter;

    private AbstractJavaEnumData data;

    public AbstractJavaEnumProxy(AbstractJavaEnum adapter, AbstractJavaEnumData data) {
        super(adapter, data);
        this.adapter = adapter;
        this.data = data;
    }

	private boolean getValuesInitialized = false;

	private boolean getFieldsInitialized = false;

	private boolean getConstructorsInitialized = false;

	private boolean getStaticInitsInitialized = false;

	private boolean getInstanceInitsInitialized = false;


	@Override
    public AbstractJavaEnum copy() {
        return ModelUtils.copy(this);
    }

	@Override
    public PowerList<JavaEnumConstant> getValues() {
        if (!getValuesInitialized) {
			if (adapter == null) {
				throw new IllegalStateException("Invalid model copy!");
			}
            data.setValues(ModelUtils.parentedList(adapter.getValues(), this));
			getValuesInitialized = true;
        }

        return data.getValues();
    }

	@Override
    public PowerList<JavaField> getFields() {
        if (!getFieldsInitialized) {
			if (adapter == null) {
				throw new IllegalStateException("Invalid model copy!");
			}
            data.setFields(ModelUtils.parentedList(adapter.getFields(), this));
			getFieldsInitialized = true;
        }

        return data.getFields();
    }

	@Override
    public PowerList<JavaConstructor> getConstructors() {
        if (!getConstructorsInitialized) {
			if (adapter == null) {
				throw new IllegalStateException("Invalid model copy!");
			}
            data.setConstructors(ModelUtils.parentedList(adapter.getConstructors(), this));
			getConstructorsInitialized = true;
        }

        return data.getConstructors();
    }

	@Override
    public PowerList<JavaStaticInit> getStaticInits() {
        if (!getStaticInitsInitialized) {
			if (adapter == null) {
				throw new IllegalStateException("Invalid model copy!");
			}
            data.setStaticInits(ModelUtils.parentedList(adapter.getStaticInits(), this));
			getStaticInitsInitialized = true;
        }

        return data.getStaticInits();
    }

	@Override
    public PowerList<JavaInstanceInit> getInstanceInits() {
        if (!getInstanceInitsInitialized) {
			if (adapter == null) {
				throw new IllegalStateException("Invalid model copy!");
			}
            data.setInstanceInits(ModelUtils.parentedList(adapter.getInstanceInits(), this));
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
		if (!(obj instanceof AbstractJavaEnum)) {
			return false;
		}

		AbstractJavaEnum other = (AbstractJavaEnum) obj;
		return new EqualsBuilder()
				.appendSuper(super.equals(other))
				.append(this.getValues(), other.getValues())
				.append(this.getFields(), other.getFields())
				.append(this.getConstructors(), other.getConstructors())
				.append(this.getStaticInits(), other.getStaticInits())
				.append(this.getInstanceInits(), other.getInstanceInits())
				.isEquals();
	}

	@Override
	public int hashCode() {
		return new HashCodeBuilder()
				.append(this.getValues())
				.append(this.getFields())
				.append(this.getConstructors())
				.append(this.getStaticInits())
				.append(this.getInstanceInits())
				.toHashCode();
	}

	@Override
	public String toString() {
		TypeSpecificStyle style = new TypeSpecificStyle(AbstractJavaEnum.class);
		ToStringBuilder builder = new ToStringBuilder(this, style);
		appendDescription(builder);
		return builder.toString();
	}

	@Override
	protected void appendDescription(ToStringBuilder builder) {
        super.appendDescription(builder);
        builder.append("values", ToStringUtil.describe(this.getValues()));
        builder.append("fields", ToStringUtil.describe(this.getFields()));
        builder.append("constructors", ToStringUtil.describe(this.getConstructors()));
        builder.append("staticInits", ToStringUtil.describe(this.getStaticInits()));
        builder.append("instanceInits", ToStringUtil.describe(this.getInstanceInits()));
	}

	@Override
	protected void loadAllData() {
		super.loadAllData();

		// load all values from the adapter to the data bean
		this.getValues();
		this.getFields();
		this.getConstructors();
		this.getStaticInits();
		this.getInstanceInits();
	}

}


