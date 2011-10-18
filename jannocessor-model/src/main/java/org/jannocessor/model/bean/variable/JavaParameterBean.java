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

package org.jannocessor.model.bean.variable;

import org.jannocessor.data.JavaParameterData;
import org.jannocessor.model.bean.NameBean;
import org.jannocessor.model.type.JavaType;
import org.jannocessor.model.util.New;
import org.jannocessor.model.variable.JavaParameter;

public class JavaParameterBean extends JavaParameterData implements
		JavaParameter {

	public JavaParameterBean(JavaType type, String name, boolean isFinal) {
		this.setType(type);
		this.setName(new NameBean(name));
		this.setCode(New.code(JavaParameter.class));
		this.setFinal(isFinal);
	}

}
