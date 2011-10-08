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

package org.jannocessor.processor.model;

import java.util.Map;

public class RenderData {

	private final String templateName;
	private final Map<String, Object> attributes;

	public RenderData(String templateName, Map<String, Object> attributes) {
		this.templateName = templateName;
		this.attributes = attributes;
	}

	public String getTemplateName() {
		return templateName;
	}

	public Map<String, Object> getAttributes() {
		return attributes;
	}

	@Override
	public String toString() {
		return "RenderData [templateName=" + templateName + ", attributes="
				+ attributes + "]";
	}

}
